package leetCode;

import java.util.*;

public class TargetIndicesAfterSortingArray {
    public static void main(String[] args) {
        int[] arr = {47, 39, 27, 16, 5, 51, 51, 40, 30, 100, 83, 7, 80, 3, 14, 52, 39, 43, 8, 39, 100, 14, 90, 7, 17, 72, 16, 9};
        System.out.println(targetIndices(arr, 14));
    }

    private static List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();
        int lp = 0, rp = nums.length - 1;
        //3, 5, 7, 7, 8, 9, 14, 14, 16, 16, 17, 27, 30, 39, 39, 39, 40, 43, 47, 51, 51, 52, 72, 80, 83, 90, 100, 100

        for (int num : nums) {
            if (num < target) {
                lp++;
            } else if (num > target) {
                rp--;
            }
        }

        while (lp <= rp) {
            list.add(lp);
        }

        return list;
    }
}
