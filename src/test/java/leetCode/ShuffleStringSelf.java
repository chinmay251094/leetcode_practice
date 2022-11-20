package leetCode;

public class ShuffleStringSelf {
    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 2, 1, 3};
        System.out.println(restoreString("codeleet", nums));
    }

    private static String restoreString(String s, int[] indices) {
        int len = s.length();
        char[] charArray = new char[len];

        for (int i = 0; i < len; i++) {
            charArray[indices[i]] = s.charAt(i);
        }

        return new String(charArray);
    }
}
