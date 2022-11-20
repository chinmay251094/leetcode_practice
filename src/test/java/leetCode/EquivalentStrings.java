package leetCode;

public class EquivalentStrings {
    public static void main(String[] args) {
        String[] arr1 = {"abc", "d", "defg"};
        String[] arr2 = {"abcddefg"};
        System.out.println(arrayStringsAreEqual(arr1, arr2));
    }

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String one = "";
        String two = "";

        if (word1.length < 0 || word1.length == 1) {
            one = word1[0];
        } else {
            for (int i = 0; i < word1.length; i++) {
                one = one + word1[i];
            }
        }

        if (word2.length < 0 || word2.length == 1) {
            two = word2[0];
        } else {
            for (int i = 0; i < word2.length - 1; i++) {
                two = two + word2[i];
            }
        }

        return one.equals(two);
    }
}
