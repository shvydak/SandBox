package org.example;

public class Two {
    public static void main(String[] args) {
        int[] numbers = {5, 8, 1, 4, 12, -3};
        for (int x : numbers) {
            System.out.print(x + ",");
        }
        System.out.println();
        sort(numbers);
        for (int x : numbers) {
            System.out.print(x + ",");
        }

    }

    public static void sort(int[] arr) {
        int length = arr.length - 1;
        boolean isSort;

        for (int i = 0; i < length; i++) {
            isSort = false;

            for (int j = 0; j < length - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSort = true;
                }
            }
            if (!isSort)
                break;
        }

    }
}
