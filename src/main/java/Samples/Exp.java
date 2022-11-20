package Samples;

import java.util.Arrays;

public class Exp {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(mul(arr)));
    }
    
    static int[] mul(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * 5;
        }
        return arr;
    }
}
