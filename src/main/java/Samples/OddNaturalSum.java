package Samples;

import java.util.Scanner;

public class OddNaturalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a range:: ");
        int num = sc.nextInt();
        int sum = 0;

        for (int i = 0; i <= num; i++) {
            if (i % 2 != 0) {
                System.out.print(i+" ");
                sum = sum + i;
            }
        }
        System.out.println("\nSum is: "+sum);
    }
}
