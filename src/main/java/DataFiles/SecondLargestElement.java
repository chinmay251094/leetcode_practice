package DataFiles;

import java.util.Arrays;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr = {25, 19, 49, 36, 52, 62, 47, 41, 25, 69};
        getSecondLargest(arr);
    }

    private static void getSecondLargest(int[] arr) {
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int index = arr.length - 1;

        while (arr[index] == arr[arr.length - 1]) {
            index--;
        }
        System.out.println(arr[index]);
    }
}
