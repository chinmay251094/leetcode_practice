/*
Given an array of integers arr, a lucky integer is an integer that has a frequency in the array equal to its value.
Return the largest lucky integer in the array. If there is no lucky integer return -1.

Example 1:
Input: arr = [2,2,3,4]
Output: 2
Explanation: The only lucky number in the array is 2 because frequency[2] == 2.

Example 2:
Input: arr = [1,2,2,3,3,3]
Output: 3
Explanation: 1, 2 and 3 are all lucky numbers, return the largest of them.

Example 3:
Input: arr = [2,2,2,3,3]
Output: -1
Explanation: There are no lucky numbers in the array.
*/

package leetCode;

import java.util.Collections;
import java.util.HashSet;

public class FindLuckyInteger {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3, 3};
        System.out.println(findLucky(arr));
    }

    private static int findLucky(int[] arr) {
        int count;
        HashSet<Integer> hashSet = new HashSet<>();

        for (int row = 0; row < arr.length; row++) {
            count = 0;
            for (int col = 0; col < arr.length; col++) {
                if (arr[row] == arr[col]) {
                    count++;
                }
            }
            if (arr[row] == count) {
                hashSet.add(count);
            }
        }
        if (hashSet.size() > 0) {
            return Collections.max(hashSet);
        } else {
            return -1;
        }
    }
}
