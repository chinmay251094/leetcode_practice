package DataFiles;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 9, 7, 12, 32};
        altReverse(arr);
    }

    private static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    private static void altReverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        System.out.println(Arrays.toString(arr));

        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }

        System.out.println(Arrays.toString(arr));
    }
}
