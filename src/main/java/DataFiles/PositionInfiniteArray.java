package DataFiles;

import java.util.Arrays;

public class PositionInfiniteArray {
    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 7, 8, 11, 15, 17, 19, 21, 23, 24, 25, 27, 28, 30};
        System.out.println(ans(arr, 28));
    }

    static int ans(int[] arr, int target) {
        int start = 0;
        int end = 1;

        while (target > arr[end]) {
            int newStart = end + 1;
            end = end + (end - start + 1) * 2;
            start = newStart;
        }
        return findPosition(arr, target, start, end);
    }

    static int findPosition(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
