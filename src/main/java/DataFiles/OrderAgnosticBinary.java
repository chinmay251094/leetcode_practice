package DataFiles;

public class OrderAgnosticBinary {
    public static void main(String[] args) {
        //int[] arr = {2, 4, 6, 9, 11, 12, 14, 20, 36, 48};
        int[] arr = {94, 41, 36, 29, 22, 17, 14, 12, 6, -2};
        System.out.println(orderAgnosticBinarySearch(arr, 36));
    }

    static int orderAgnosticBinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
