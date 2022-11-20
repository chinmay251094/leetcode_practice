/*
You are given a string allowed consisting of distinct characters and an array of strings words.
A string is consistent if all characters in the string appear in the string allowed.
Return the number of consistent strings in the array words.

Example 1:
Input: allowed = "ab", words = ["ad","bd","aaab","baa","badab"]
Output: 2
Explanation: Strings "aaab" and "baa" are consistent since they only contain characters 'a' and 'b'.

Example 2:
Input: allowed = "abc", words = ["a","b","c","ab","ac","bc","abc"]
Output: 7
Explanation: All strings are consistent.
*/

package leetCode;

public class CountConsistentStrings {
    public static void main(String[] args) {
        String[] arr = {"ad", "bd", "aaab", "baa", "badab"};
        System.out.println(countConsistentStrings("ab", arr));
    }

    private static int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        for (String allow : words) {
            boolean flag = true;
            for (char ch : allowed.toCharArray()) {
                if(!allow.contains(String.valueOf(ch))) {
                    flag = false;
                }
            }
            if(flag) count++;
        }
        return count;
    }
}
