package DataFiles;

import java.util.Scanner;

public class AverageOfArrays {
    public static void main(String[] args) {
        int[] typedIntegers = getIntegers(3);
        for (int i = 0; i < typedIntegers.length; i++) {
            System.out.println("Numbers entered by the user are "+typedIntegers[i]);
        }

        double avg = getAverage(typedIntegers);
        System.out.println("The average is "+avg);
    }

    private static Scanner scanner = new Scanner(System.in);

    public static int[] getIntegers(int number) {
        System.out.println("Enter "+number+" integers.\r");
        int[] values = new int[number];
        for (int i = 0; i < number; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static double getAverage(int[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum / (double) arr.length;
    }
}
