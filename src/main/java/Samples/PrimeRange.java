package Samples;

import java.util.Scanner;

public class PrimeRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a range: ");
        int sum = sc.nextInt();
        int flag = 0;

        for (int i = 2; i <= sum; i++) {
            for (int j = 2; j <= i; j++) {
                if (i % j == 0) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.print(i + " ");
            }
            flag = 0;
        }
    }
}
