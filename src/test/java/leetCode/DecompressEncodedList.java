/*
We are given a list nums of integers representing a list compressed with run-length encoding.

Consider each adjacent pair of elements [freq, val] = [nums[2*i], nums[2*i+1]] (with i >= 0).
For each such pair, there are freq elements with value val concatenated in a sublist.
Concatenate all the sublists from left to right to generate the decompressed list.

Return the decompressed list.

* Input: nums = [1,2,3,4]
Output: [2,4,4,4]
Explanation: The first pair [1,2] means we have freq = 1 and val = 2 so we generate the array [2].
The second pair [3,4] means we have freq = 3 and val = 4 so we generate [4,4,4].
At the end the concatenation [2] + [4,4,4] is [2,4,4,4].
*/

package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DecompressEncodedList {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3};
        //decompressRLElist(arr);
        System.out.println(Arrays.toString(altWay(arr)));
    }

//    private static void decompressRLElist(int[] nums) {
//        int[] req;
//        List<int[]> list = new ArrayList<>();
//
//        for (int i = 0; i < nums.length / 2; i++) {
//            req = new int[nums[2 * i]];
//            int k = 0;
//
//            if (req.length == 1) {
//                req[0] = nums[2 * i + 1];
//            }
//
//            for (int j = 0; j < req.length; j++) {
//                int num = nums[2 * i + 1];
//                req[k] = num;
//                k++;
//            }
//            list.add(req);
//        }
//
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(Arrays.toString(list.get(i)));
//        }
//        //return req;
//    }

    private static int[] altWay(int[] nums) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length / 2; i++) {
            if (nums[2 * i] == 1) {
                list.add(nums[2 * i + 1]);
            } else {
                for (int j = 0; j < nums[2 * i]; j++) {
                    list.add(nums[2 * i + 1]);
                }
            }
        }

        int[] ans = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }

        return ans;
    }
}
