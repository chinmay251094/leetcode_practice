package DataFiles;

public class MinOfArray {
    public static void main(String[] args) {
        int[] arr = {12, 36, 54, 98, 7, 23, -3, 41, 74, 58};
        System.out.println(findMin(arr));
    }

    private static int findMin(int[] arr) {
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
