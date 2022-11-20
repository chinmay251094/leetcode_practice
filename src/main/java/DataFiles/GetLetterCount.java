package DataFiles;

public class GetLetterCount {
    public static void main(String[] args) {
        System.out.println(letterCount("qwert", "a"));
    }

    private static int letterCount(String value, String character) {
        int counter = 0;
        String[] arr = new String[value.length()];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = String.valueOf(value.charAt(i));
            if(arr[i].equals(character)) {
                counter++;
            }
        }
        return counter;
    }
}
