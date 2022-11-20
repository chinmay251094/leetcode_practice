/*
You are given a 0-indexed, strictly increasing integer array nums and a positive integer diff.
A triplet (i, j, k) is an arithmetic triplet if the following conditions are met:

i < j < k,
nums[j] - nums[i] == diff, and
nums[k] - nums[j] == diff.

Return the number of unique arithmetic triplets.

Example 1:
Input: nums = [0,1,4,6,7,10], diff = 3
Output: 2
Explanation:
(1, 2, 4) is an arithmetic triplet because both 7 - 4 == 3 and 4 - 1 == 3.
(2, 4, 5) is an arithmetic triplet because both 10 - 7 == 3 and 7 - 4 == 3.
 */
package leetCode;

import java.util.HashSet;
import java.util.Set;

public class ArithmeticTriplets {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 8, 9};
        System.out.println(arithmeticTriplets(arr, 2));
    }

    private static int arithmeticTriplets(int[] nums, int diff) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                for (int k = 2; k < nums.length; k++) {
                    if (nums[i] < nums[j] && nums[j] < nums[k]) {
                        if (nums[j] - nums[i] == diff && nums[k] - nums[j] == diff) {
                            count++;
                        }
                    }
                }
            }
        }
        return count;
    }

    private static int arithmeticTripletsOptimized(int[] nums, int diff) {
        int count = 0;
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num - diff) && set.contains(num - diff * 2))
                count++;

            set.add(num);
        }
        return count;
    }
}
