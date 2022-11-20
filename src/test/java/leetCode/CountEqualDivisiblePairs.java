package leetCode;

public class CountEqualDivisiblePairs {
    public static void main(String[] args) {
        //int[] arr = {5, 5, 9, 2, 5, 5, 9, 2, 2, 5, 5, 6, 2, 2, 5, 2, 5, 4, 3};
        int[] arr = {3, 1, 2, 2, 2, 1, 3};
        System.out.println(countPairs(arr, 2));
        //System.out.println((0 * 0) / 1);
    }

    private static int countPairs(int[] nums, int k) {
        int count = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if ((nums[i] == nums[j]) && ((i * j) % k == 0)) {
                    count++;
                }
            }
        }
        return count;
    }
}
