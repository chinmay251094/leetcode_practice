package DataFiles;

public class Start1 {
    public static void main(String[] args) {
        int[] a = {1};
        int[] b = {1};
        System.out.println(start1(a, b));
    }

    public static int start1(int[] a, int[] b) {
        int counter = 0;

        if(a.length != 0) {
            if(a[0] == 1) {
                counter++;
            }
        }

        if(b.length != 0) {
            if(b[0] == 1) {
                counter++;
            }
        }
        return counter;
    }
}
