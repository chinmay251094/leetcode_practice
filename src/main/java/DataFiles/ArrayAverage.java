package DataFiles;

public class ArrayAverage {
    public static void main(String[] args) {
        double[] arr = new double[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(avgArrays(arr));
    }

    private static double avgArrays(double[] arr) {
        double temp = 0;
        double avg = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            temp = temp + arr[i];
        }
        System.out.println(temp);
        return avg = temp / arr.length;
    }
}
