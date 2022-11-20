package leetCode;

import java.util.Arrays;

public class SmallerThanCurrentNumber {
    public static void main(String[] args) {
        int[] nums = {6, 5, 4, 8};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
    }

    private static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] answer = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (j != i && nums[i] > nums[j]) {
                    count++;
                }
            }
            answer[i] = count;
        }
        return answer;
    }
}
