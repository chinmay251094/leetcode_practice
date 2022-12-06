package leetCode;

public class HouseRobber {
    public static void main(String[] args) {
        int[] arr = {2, 1, 1, 2};
        System.out.println(rob(arr));
    }

//    private static int rob(int[] nums) {
//        int start = 0, end = nums.length - 1;
//        List<Integer> list = new ArrayList<>();
//
//        while (start < end) {
//
//            if(start == end) {
//                break;
//            }
//
//            if (nums[start] > nums[end]) {
//                list.add(nums[start]);
//            } else {
//                list.add(nums[end]);
//            }
//            start++;
//            end--;
//        }
//
//        return list.stream().mapToInt(Integer::intValue).sum();
//    }

    private static int rob(int[] nums) {
        int odd = 0, even = 0;

        for (int index = 0; index < nums.length; index += 2) {
            even = even + nums[index];
            try {
                odd = odd + nums[index + 1];
            } catch (ArrayIndexOutOfBoundsException e) {
                return Math.max(even, odd);
            }
        }
        return Math.max(even, odd);
    }
}
