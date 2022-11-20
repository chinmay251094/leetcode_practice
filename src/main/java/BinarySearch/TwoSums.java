package BinarySearch;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSums {
    public static void main(String[] args) {
        int[] nums = {1, 3, 4};
        System.out.println(Arrays.toString(twoSum(nums, 7)));
    }

//    public static int[] twoSum(int[] nums, int target) {
//        int[] arr = new int[2];
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = 1; j < nums.length; j++) {
//                if (nums[i] + nums[j] == target) {
//                    return arr = new int[]{i, j};
//                }
//            }
//        }
//        return arr = new int[]{};
//    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> prevMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int diff = target - num;

            if (prevMap.containsKey(num)) {
                return new int[] { prevMap.get(num), i };
            }

            prevMap.put(diff, i);
            System.out.println(prevMap);
        }

        return new int[] {};
    }
}
