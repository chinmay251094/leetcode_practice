package leetCode;

public class GoodPairs {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1};
        System.out.println(numIdenticalPairs(arr));
    }

    public static int numIdenticalPairs(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (nums[i] == nums[j] && i < j) {
                    count++;
                }
            }
        }
        return count;
    }
}
