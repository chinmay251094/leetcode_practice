package DataFiles;

import java.util.Arrays;

public class FlipArray {
    public static void main(String[] args) {
        int[] arr = {5, 2, 7, 9, 6};
        reverse(arr);
    }

    private static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
