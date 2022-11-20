package DataFiles;

public class FindRichestPerson {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 3, 2},
                {1, 2, 8}
        };
        System.out.println(findWealth(arr));
    }

    static int findWealth(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++) {
            int wealth = 0;
            for (int col = 0; col < arr[row].length; col++) {
                wealth = wealth + arr[row][col];
            }
            if (wealth > max) {
                max = wealth;
            }
        }
        return max;
    }
}
