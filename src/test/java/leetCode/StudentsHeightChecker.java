/*
A school is trying to take an annual photo of all the students.
The students are asked to stand in a single file line in non-decreasing order by height.
Let this ordering be represented by the integer array expected where expected[i] is the expected height of the ith student in line.

You are given an integer array heights representing the current order that the students are standing in.
Each heights[i] is the height of the ith student in line (0-indexed).

Return the number of indices where heights[i] != expected[i].

Example 1:

Input: heights = [1,1,4,2,1,3]
Output: 3
Explanation:
heights:  [1,1,4,2,1,3]
expected: [1,1,1,2,3,4]
Indices 2, 4, and 5 do not match.
*/

package leetCode;

import java.util.Arrays;

public class StudentsHeightChecker {
    public static void main(String[] args) {
        int[] queue = {1, 1, 4, 2, 1, 3};
        int answer = StudentsHeightChecker.heightChecker(queue);

        System.out.println(answer);
    }

    private static int heightChecker(int[] heights) {
        int[] expected = new int[heights.length];

        for (int index = 0; index < heights.length; index++) {
            expected[index] = heights[index];
        }

        Arrays.sort(expected);

        int finalCount = 0;
        for (int index = 0; index < heights.length; index++) {
            if(heights[index] != expected[index]) {
                finalCount++;
            }
        }
        return finalCount;
    }
}
