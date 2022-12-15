package leetCode;

public class CountWordWithPrefix {
    public static void main(String[] args) {
        String[] words = {"leetcode","win","loops","success"};
        System.out.println(prefixCount(words, "code"));
    }

    private static int prefixCount(String[] words, String pref) {
        int len = pref.length(), count = 0;

        for (String word : words) {
            if(word.length() < len) {
                continue;
            }
            if (word.substring(0, len).equals(pref)) {
                count++;
            }
        }
        return count;
    }
}
