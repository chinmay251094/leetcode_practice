package Samples;

import java.util.Scanner;

public class IncreasingDecreasing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter one: ");
        int one = sc.nextInt();
        System.out.print("Enter two: ");
        int two = sc.nextInt();
        System.out.print("Enter three: ");
        int three = sc.nextInt();

        if(one > two && two > three) {
            System.out.println("Decreasing");
        } else if (one < two && two < three) {
            System.out.println("Increasing");
        } else {
            System.out.println("Neither");
        }
    }
}
