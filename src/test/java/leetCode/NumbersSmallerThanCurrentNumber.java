package leetCode;

public class NumbersSmallerThanCurrentNumber {
    public static void main(String[] args) {
        int[] nums = {6, 5, 4, 8};
        smallerNumbersThanCurrent(nums);
    }

    private static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] arr = new int[nums.length];
        int count;

        for (int row = 0; row < nums.length; row++) {
            count = 0;
            for (int col = 0; col < nums.length; col++) {
                if (nums[row] > nums[col]) {
                    count++;
                }
            }
            arr[row] = count;
        }
        return arr;
    }
}
