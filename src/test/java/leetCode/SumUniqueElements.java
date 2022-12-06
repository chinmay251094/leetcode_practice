package leetCode;

public class SumUniqueElements {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2};
        System.out.println(sumOfUnique(arr));
        //System.out.println(isUnique(1, arr));
    }

//    private static int sumOfUnique(int[] nums) {
//        int res = 0;
//        Map<Integer, Integer> map = new HashMap<>();
//
//        for (int i = 0; i < nums.length; i++) {
//            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
//            if (map.get(nums[i]) == 1) {
//                res = res + nums[i];
//            } else if (map.get(nums[i]) == 2) {
//                res = res - nums[i];
//            }
//        }
//        return res;
//    }

    private static int sumOfUnique(int[] nums) {
        int sum = 0;

        for (int index = 0; index < nums.length; index++) {
            boolean isTrue = isUnique(nums[index], nums);

            if (isTrue) {
                sum = sum + nums[index];
            }
        }
        return sum;
    }

    private static boolean isUnique(int num, int[] nums) {
        int count = 0;
        for (int item : nums) {
            if (num == item) {
                count++;
            }
        }

        if (count > 1) {
            return false;
        }
        return true;
    }
}
