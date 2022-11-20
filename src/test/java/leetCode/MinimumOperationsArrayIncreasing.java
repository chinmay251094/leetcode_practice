/*
You are given an integer array nums (0-indexed). In one operation, you can choose an element of the array and increment it by 1.

For example, if nums = [1,2,3], you can choose to increment nums[1] to make nums = [1,3,3].
Return the minimum number of operations needed to make nums strictly increasing.

An array nums is strictly increasing if nums[i] < nums[i+1] for all 0 <= i < nums.length - 1. An array of length 1 is trivially strictly increasing.
Example 1:

Input: nums = [1,1,1]
Output: 3

Explanation: You can do the following operations:
1) Increment nums[2], so nums becomes [1,1,2].
2) Increment nums[1], so nums becomes [1,2,2].
3) Increment nums[2], so nums becomes [1,2,3].
*/

package leetCode;

public class MinimumOperationsArrayIncreasing {
    public static void main(String[] args) {
        int[] arr = {4, 6, 7, 8, 8, 9, 10, 11, 12};
        //int[] arr = {8, 8};
        //int[] arr = {1, 1, 1};
        minOperations(arr);
    }

    private static boolean checkForSameElements(int[] nums) {
        int first = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != first) {
                return false;
            }
        }
        return true;
    }

    private static int minOperations(int[] nums) {
        int count = 0;
        int[] initial = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            initial[i] = nums[i];
        }

        if (nums.length == 1) {
            return 0;
        }

        if (checkForSameElements(nums)) {
            try {
                int k = 1;
                for (int i = 0; i < nums.length; i++) {
                    nums[i + 1] = nums[i + 1] + k;
                    k++;
                }
            } catch (ArrayIndexOutOfBoundsException ex) {

            }

        } else {
            try {
                for (int i = 0; i < nums.length; i++) {
                    if (nums[i] - nums[i + 1] >= 0) {
                        nums[i + 1] = nums[i + 1] + (nums[i] - nums[i + 1]) + 1;
                    }
                }
            } catch (ArrayIndexOutOfBoundsException ex) {

            }
        }

        for (int i = 0; i < nums.length; i++) {
            count = count + (nums[i] - initial[i]);
        }
        return count;
    }
}
