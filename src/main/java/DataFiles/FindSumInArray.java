package DataFiles;

import java.util.Arrays;

public class FindSumInArray {
    public static void main(String[] args) {
        int[] arr = {11, 15, 6, 8, 9, 10};
        //System.out.println(findSum(arr, 16));
        System.out.println(findSumUsingBinarySearch(arr, 18));
    }

    static boolean findSum(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target && i != j) {
                    return true;
                }
            }
        }
        return false;
    }

    static String findSumUsingBinarySearch(int[] arr, int target) {
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            if (arr[start] + arr[end] == target) {
                return arr[start] +" "+ arr[end];
            } else if(arr[start] + arr[end] < target) {
                start++;
            } else {
                end--;
            }
        }
        return null;
    }
}
