package BinarySearch;

import java.util.Arrays;

public class FirstLastPosition {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 6, 6, 6, 6, 7, 8, 9};
        System.out.println(Arrays.toString(search(arr, 6)));
    }

    static int[] search(int[] arr, int target) {
        int[] ans = {-1, -1};

        ans[0] = elementSearch(arr, target, true);
        System.out.println(ans[0]);
        ans[1] = elementSearch(arr, target, false);
        System.out.println(ans[1]);
        return ans;
    }

    static int elementSearch(int[] arr, int target, boolean flag) {
        int start = 0;
        int end = arr.length - 1;
        int first = 0;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                first = mid;

                if (flag) {
                    end = mid -1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return first;
    }
}
