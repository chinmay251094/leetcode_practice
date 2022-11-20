package leetCode;

import java.util.Arrays;

public class ConcatenationOfArray {
    public static void main(String[] args) {
        int[] a = {1, 3, 2, 1};
        System.out.println(Arrays.toString(getConcatenation(a)));
    }

    public static int[] getConcatenation(int[] nums) {
        int[] combined = new int[nums.length * 2];

        for (int i = 0; i < nums.length; i++) {
            combined[i] = nums[i];
            combined[nums.length + i] = nums[i];
        }
        return combined;
    }
}
