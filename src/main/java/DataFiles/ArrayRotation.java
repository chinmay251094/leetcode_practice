package DataFiles;

import java.util.Arrays;

public class ArrayRotation {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(Arrays.toString(arr));
        System.out.println(findTarget(rotateArray(arr, 3), 2));
    }

    static int[] rotateArray(int[] arr, int k) {
        int[] temp = new int[arr.length];
        int ctr = k;
        int index = 0;
        for (int i = 0; i < k; i++) {
            temp[temp.length - ctr] = arr[i];
            ctr--;
        }

        for (int i = k; i < arr.length; i++) {
            temp[index] = arr[i];
            index++;
        }
        System.out.println(Arrays.toString(temp));
        return temp;
    }

    static String findTarget(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return "Target found at " + i;
            }
        }
        return null;
    }
}
