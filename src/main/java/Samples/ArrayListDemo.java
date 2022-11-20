package Samples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 2, 3, 4, 5, 1, 3, 6, 1, 8};
        System.out.println(Arrays.toString(getAllIndexes(arr, 1)));
    }

    public static int[] getAllIndexes(int[] arr, int target) {
        List<Integer> indices = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target) {
                indices.add(i);
            }
        }

        int[] ans = new int[indices.size()];

        for (int i = 0; i < indices.size(); i++) {
            ans[i] = indices.get(i);
        }
        return ans;
    }
}
