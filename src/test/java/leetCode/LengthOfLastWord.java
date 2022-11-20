package leetCode;

public class LengthOfLastWord {
    public static void main(String[] args) {
        int len = new LengthOfLastWord().lengthOfLastWord("   fly me   to   the moon  ");
        System.out.println(len);
    }

    public int lengthOfLastWord(String s) {
        int counter = 0;
        s = s.trim();
        if (s != null) {
            for (int i = s.length() - 1; i >= 0; i--) {
                if (Character.isWhitespace(s.charAt(i))) {
                    break;
                }
                counter++;
            }
        }
        return counter;
    }
}
