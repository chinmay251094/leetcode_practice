package leetCode;

public class CountAsterisks {
    public static void main(String[] args) {
        String myStr = "yo|uar|e**|b|e***au|tifu|l";
        System.out.println(countAsterisks(myStr));
    }

//    public static int countAsterisks(String s) {
//        boolean insidePipe = false;
//        int count = 0;
//
//        for (int i = 0; i < s.length(); i++) {
//            if (s.charAt(i) == '|') {
//                insidePipe = !insidePipe;
//            }
//            if (!insidePipe && s.charAt(i) == '*') {
//                count++;
//            }
//        }
//        return count;
//    }

    public static int countAsterisks(String s) {
        int star = 0;
        boolean barEven = true;

        for (int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i);
            if (c == '|') {
                barEven = !barEven;
            } else if (c == '*' && barEven) {
                ++star;
            }
        }
        return star;
    }
}
