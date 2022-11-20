package DataFiles;

public class SecondMax {
    public static void main(String[] args) {
        int[] arr = {2035, 1899, 31214, 13789, 19042, 21013};
        System.out.println(getSecondMax(arr));
    }

    private static int getSecondMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }
}
