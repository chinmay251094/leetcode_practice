package DataFiles;

public class SumOfArray {
    public static void main(String[] args) {
        int[] myArr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5};
        System.out.println(sumOfArray(myArr));

    }

    public static int sumOfArray(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            temp = temp + arr[i];
        }
        return temp;
    }
}
