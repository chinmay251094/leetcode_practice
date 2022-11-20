package DataFiles;

public class MaxOfArray {
    public static void main(String[] args) {
        int[] arr = {1023, 5074, 104, 1024, 98, 412};
        //System.out.println(max(arr));
        System.out.println(maxRange(arr, 2, arr.length));
    }

    private static int maxRange(int[] arr, int k, int length) {
        int max = arr[k];
        for (int i = k; i < length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    private static int max(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
