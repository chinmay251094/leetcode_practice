package leetCode;

public class CountChar {
    public static void main(String[] args) {
        System.out.println(encode("aaabbcdef"));
    }

    private static String encode(String str) {
        int count;
        String n = "";
        for (int i = 0; i < str.length(); i++) {
            count = 1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            n = n + String.valueOf(count) + str.charAt(i);
        }
        return n;
    }
}
