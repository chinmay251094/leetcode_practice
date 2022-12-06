package Samples;

public class SwapNumbers {
    public static void main(String[] args) {
        int a = 10, b = 20;
        System.out.println("After swap a: " + a);
        System.out.println("After swap b: " + b);
        System.out.println("******");
        a = b + a;
        b = a - b;
        a = a - b;

        System.out.println("After swap a: " + a);
        System.out.println("After swap b: " + b);
    }
}
