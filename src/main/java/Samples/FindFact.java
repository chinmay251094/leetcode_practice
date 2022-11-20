package Samples;

import java.util.Scanner;

public class FindFact {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a range: ");
        int sum = sc.nextInt();
        int fact = 1;

        for (int i = sum; i > 0; i--) {
            fact = fact * i;
        }

        System.out.println(fact);
    }
}
