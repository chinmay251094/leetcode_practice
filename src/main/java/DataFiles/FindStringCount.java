package DataFiles;

public class FindStringCount {
    public static void main(String[] args) {
        System.out.println(getCount("Today is Sunday, so it is a free day for you.", "day"));
    }

    private static int getCount(String str, String match) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if(str.contains(match)) {
                count++;
            }
        }
        return count;
    }
}
