package DataFiles;

public class PatternChallenge {
    public static void main(String[] args) {
        pattern5Alt(5);
    }

    static void pattern1(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col < n + 1 - row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern4(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n) {
        for (int row = 1; row < (n * 2); row++) {
            int totalColsInRow = row > n ? 2 * n - row : row;
            for (int col = 1; col < totalColsInRow; col++) {
                System.out.print("k ");
            }
            System.out.println();
        }
    }

    static void pattern5Alt(int n) {
        for (int rows = 1; rows <= n; rows++)
        {
            for (int cols = 1; cols <= rows; cols++)
            {
                System.out.print(cols + " ");
            }
            System.out.println();
        }
        for (int rows = n; rows >= 1; rows--)
        {
            for (int cols = 1; cols < rows; cols++)
            {
                System.out.print(cols + " ");
            }
            System.out.println();
        }
    }
}
