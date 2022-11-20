package DataFiles;

public class RecurringString {
    public static void main(String[] args) {
        RecurringString rs = new RecurringString();
        System.out.println(rs.getRepeatedString("aba", 10));
    }

    private int getRepeatedString(String s, int k) {
        int q = 0;
        int r = 0;

        q = s.length() / k;
        r = s.length() % k;

        int partialStrLen = (r == 0) ? 0 : r;
        int charCount = q * countRepeatedCharacters(s, s.length()) + countRepeatedCharacters(s, partialStrLen);
        return charCount;
    }

    private int countRepeatedCharacters(String s, int strLen) {
        int counter = 0;

        for (int i = 0; i < strLen; i++) {
            if (s.charAt(i) == 'a') {
                counter++;
            }
        }
        return counter;
    }
}
