package DataFiles;

import java.util.Arrays;
import java.util.Comparator;

public class GreatestLetter {
    public static void main(String[] args) {
        String inputString = "chinmay";
        String outputString = sortString(inputString);
        char[] ch = outputString.toCharArray();
        System.out.println(nextGreatestLetter(ch, 'z'));
    }

    public static String sortString(String inputString) {
        // Converting input string to character array
        char tempArray[] = inputString.toCharArray();

        // Sorting temp array using
        Arrays.sort(tempArray);

        // Returning new sorted string
        return new String(tempArray);
    }

    static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target > letters[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return letters[start % letters.length];
    }
}
