package leetCode;

import java.util.ArrayList;
import java.util.List;

public class HouseRobber {
    public static void main(String[] args) {
        int[] arr = {2, 1, 1, 2};
        System.out.println(rob(arr));
    }

    //try finding max value one after the other list[index] and list[index+1] and keep adding them to list and finally sum up the list
    private static int rob(int[] nums) {
        int sum = 0;
        List<Integer> maxItems = new ArrayList<>();

        for (int index = 0; index < nums.length; index += 2) {
            maxItems.add(Math.max(nums[index], nums[index + 1]));
        }
        sum = maxItems.stream().mapToInt(Integer::intValue).sum();
        return sum;
    }
}
