package DataFiles;

import java.util.Arrays;

public class FirstLastPosition {
    public static void main(String[] args) {
        int[] arr = {5, 7, 7, 7, 7, 10, 8, 8, 10, 11, 7};
        System.out.println(Arrays.toString(searchInRange(arr, 7)));
    }

    static int[] searchInRange(int[] arr, int target) {
        int[] ans = {-1, -1};

        ans[0] = search(arr, target, true);

        if (ans[0] != -1) {
            ans[1] = search(arr, target, false);
        }

        return ans;
    }

    static int search(int[] arr, int target, boolean findStartIndex) {
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int start = 0;
        int end = arr.length - 1;
        int first = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                first = mid;
                if (findStartIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return first;
    }
}
