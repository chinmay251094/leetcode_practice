package Samples;

import java.util.Random;

public class MethodsDemo {
    public static void main(String[] args) {
//        String mac = "";
//        Random r = new Random();
//        for (int i = 0; i < 6; i++) {
//            int n = r.nextInt(255);
//            mac += String.format("%02x", n);
//        }
//
//        System.out.println(mac.toUpperCase());
MethodsDemo.ownShop();

    }

    //synatx:
    //access_specificer static(optional) return_type function_name(parameters(optional))

    public static void ownShop() {
        System.out.println(123);
    }

    public static int rentedShop() {
        return -1;
    }

    public static int rentedShopWithParameters(int num) {
        if(num > 18) {
            return num;
        }
        return -1;
    }

    public static String generateMACAddress() {
        String mac = "";
        Random r = new Random();
        for (int i = 0; i < 6; i++) {
            int n = r.nextInt(255);
            mac += String.format("%02x", n);
        }
        return mac.toUpperCase();
    }
}
