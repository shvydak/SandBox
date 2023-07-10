package org.example;

public class One {
    public static void main(String[] args) {
        int[] numbers = {12, 7, -45, 77, -77, 3, 8, 1, 5};
        for (int x : numbers) {
            System.out.print(x + ",");
        }
        System.out.println();
        sortingArray(numbers);
        for (int x : numbers) {
            System.out.print(x + ",");
        }
    }

    private static void sortingArray(int[] arr) {
        int length = arr.length - 1;
        boolean sorting;
        for (int i = 0; i < length; i++) {
            sorting = false;
            for (int j = 0; j < length - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    sorting = true;
                }
            }
            if (!sorting)
                break;
        }
    }
}
