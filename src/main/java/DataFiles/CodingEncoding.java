package DataFiles;

public class CodingEncoding {
    public static void main(String[] args) {
        System.out.println(encode("aabbcde"));
    }

    private static String encode(String str) {
        int count;
        String n = "";
        for (int i = 0; i < str.length(); i++) {
            count = 1;
            while (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            n += String.valueOf(count) + str.charAt(i);
        }
        return n;
    }
}
