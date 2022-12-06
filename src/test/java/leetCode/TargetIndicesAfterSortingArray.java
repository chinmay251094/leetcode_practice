package leetCode;

import java.util.*;

public class TargetIndicesAfterSortingArray {
    public static void main(String[] args) {
        int[] arr = {100, 1, 100};
        System.out.println(targetIndices(arr, 100));
        //targetIndices(arr, 2);
    }

    private static List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();
        int lp = 0, rp = nums.length - 1;
        boolean flag = true;

        while (flag) {
            int mid = lp + (rp - lp) / 2;
            //1 100 100
            if (target <= nums[mid]) {
                lp = 0;
                rp = mid;
            } else if (target >= nums[mid] && nums[mid - 1] != target) {
                lp = mid;
            }
            flag = false;
        }

        while (lp <= rp) {
            if (nums[lp] == target) {
                list.add(lp);
            } else if (nums[rp] == target) {
                list.add(rp);
            }

            lp++;
            rp--;
        }
        Collections.sort(list);
        return list;
    }
}
