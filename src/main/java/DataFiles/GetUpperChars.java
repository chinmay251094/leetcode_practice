package DataFiles;

public class GetUpperChars {
    public static void main(String[] args) {
        System.out.println(countUpper("CHinmAY"));
    }

    private static int countUpper(String value) {
        int counter = 0;
        for (int i = 0; i < value.length(); i++) {
            char ch = value.charAt(i);
            if (Character.isUpperCase(ch)) {
                counter++;
            }
        }
        return counter;
    }
}
