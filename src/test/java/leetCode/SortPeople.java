/*
You are given an array of strings names, and an array heights that consists of distinct positive integers. Both arrays are of length n.
For each index i, names[i] and heights[i] denote the name and height of the ith person.

Return names sorted in descending order by the people's heights.
Example 1:
Input: names = ["Mary","John","Emma"], heights = [180,165,170]
Output: ["Mary","Emma","John"]
Explanation: Mary is the tallest, followed by Emma and John.
*/

package leetCode;

import java.util.Arrays;
import java.util.Comparator;

public class SortPeople {
    public static void main(String[] args) {
        String[] names = {"Mary", "John", "Emma"};
        int[] heights = {180, 165, 170};
        System.out.println(Arrays.toString(sortPeople(names, heights)));
    }

    public static String[] sortPeople(String[] names, int[] heights) {
//        int[] height = new int[heights.length];
//
//        int temp = 0;
//
//        for (int i = 0; i < heights.length; i++) {
//            try {
//                if (heights[i] < heights[i + 1]) {
//                    temp = heights[i];
//                    heights[i] = heights[i + 1];
//                    heights[i + 1] = temp;
//                }
//            } catch (ArrayIndexOutOfBoundsException ex) {
//                height[i - 1] = heights[i - 1];
//            }
//            height[i] = heights[i];
//        }
//
//
//
//        System.out.println(Arrays.toString(height));
        Object[][] people = new Object[names.length][2];
        for (int i = 0; i < names.length; i++) {
            people[i][0] = names[i];
            people[i][1] = heights[i];
        }
        //System.out.println(Arrays.deepToString(people).replace("], ", "]\n").replace("[[", "[").replace("]]", "]"));

        Arrays.sort(people, new Comparator<Object[]>() {
            @Override
            public int compare(Object[] o1, Object[] o2) {
                if ((int) o1[1] < (int) o2[1]) {
                    return 1;
                } else {
                    return -1;
                }
            }
        });

        String[] ans = new String[people.length];

        for (int i = 0; i < people.length; i++) {
            ans[i] = (String) people[i][0];
        }

        return ans;
    }

    /*
    Map<Integer, String> map = new HashMap<>();
        for (int i = 0; i < names.length; i++) {
            map.put(heights[i], names[i]);
        }
        Arrays.sort(heights);
        String[] result = new String[heights.length];
        int index = 0;
        for (int i = heights.length - 1; i >= 0; i--) {
            result[index] = map.get(heights[i]);
            index++;
        }
        return result;
     */

}

