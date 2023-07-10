package org.example;

import java.util.Random;

public class Three {
    private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        int length = 10; // Define the desired length of the random string

        String randomString = generateRandomString(length);
        System.out.println(randomString);
    }

    public static String generateRandomString(int length) {
        StringBuilder sb = new StringBuilder();

        // Generate the first letter in uppercase
        sb.append(Character.toUpperCase(ALPHABET.charAt(RANDOM.nextInt(ALPHABET.length()))));

        // Generate the remaining lowercase letters
        for (int i = 1; i < length; i++) {
            sb.append(ALPHABET.charAt(RANDOM.nextInt(ALPHABET.length())));
        }

        return sb.toString();
    }
}
