package ApnaCollege;

public class SimpleBinary {
    public static void main(String[] args) {
        int[] arr = {-3, 1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(binary(arr, 7));
    }

    private static int binary(int[] arr, int target) {
        int leftPointer = 0, rightPointer = arr.length - 1, mid = 0;

        while (leftPointer <= rightPointer) {
            mid = (leftPointer + rightPointer) / 2;

            if (target == arr[mid]) {
                return mid;
            }
            if (target > arr[mid]) {
                leftPointer = mid + 1;
            } else if (target < arr[mid]) {
                rightPointer = mid - 1;
            }
        }
        return mid;
    }
}
