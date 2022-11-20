package leetCode;

import java.util.Arrays;

public class ShuffleArray {
    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 3, 4, 7, 8, 9};
        //          {2, 4, 5, 7, 1, 8, 3, 9}
        System.out.println(Arrays.toString(shuffle(arr, 4)));
        //shuffle(arr, 4);
    }

    public static int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];

//        for(int i = 0; i < n; i++){
//            ans[2 * i] = nums[i];
//            ans[2 * i + 1] = nums[n+i];
//        }

        for (int i = 0, c = 0; i < n; i++) {
            ans[c++] = nums[i];
            ans[c++] = nums[i + n];
        }
        return ans;
    }
}

