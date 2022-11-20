package DataFiles;

public class Product1ToN {
    public static void main(String[] args) {
        System.out.println(findFactorial(7));
    }

    private static int findFactorial(int n) {
        int flag = 1;
        for (int i = 1; i <= n; i++) {
            flag = flag * i;
        }
        return flag;
    }


}
