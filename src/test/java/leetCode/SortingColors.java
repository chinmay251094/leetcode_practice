package leetCode;

import java.util.Arrays;

public class SortingColors {
    public static void main(String[] args) {
        int[] userDefined = {2, 0, 2, 1, 1, 0};

        SortingColors.sortColors(userDefined);
    }

    private static void sortColors(int[] nums) {
        int swapVariable = 0;

        for (int row = 0; row < nums.length; row++) {
            for (int column = row + 1; column < nums.length; column++) {
                if (nums[row] >= nums[column]) {
                    swapVariable = nums[row];
                    nums[row] = nums[column];
                    nums[column] = swapVariable;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
