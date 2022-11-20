package DataFiles;

public class CountVowels {
    public static void main(String[] args) {
        System.out.println(getVowels("AEIOU"));
    }

    private static int getVowels(String value) {
        int counter = 0;
        String lower = value.toLowerCase();
        String[] arr = new String[lower.length()];
        for (int i = 0; i < lower.length(); i++) {
            arr[i] = String.valueOf(lower.charAt(i));
            if (arr[i].equals("a") || arr[i].equals("e") || arr[i].equals("i") || arr[i].equals("o") || arr[i].equals("u")) {
                counter++;
            }
        }
        return counter;
    }
}
