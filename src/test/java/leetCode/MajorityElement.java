package leetCode;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 1, 1, 2, 2};
        System.out.println(majorityElement(arr));
    }

    private static int majorityElement(int[] nums) {
        int moreThanHalf = (nums.length) / 2, count;

        for (int row = 0; row < nums.length; row++) {
            count = 0;
            for (int col = 0; col < nums.length; col++) {
                if (nums[row] == nums[col]) {
                    count++;
                }
            }
            if (count > moreThanHalf) {
                return nums[row];
            }
        }
        return -1;
    }
}