package leetCode;

import java.util.Arrays;

public class ShuffleString {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 2, 1, 3};
        String str = "codeleet";
        String call = new ShuffleString().restoreString(str, arr);
        System.out.println(call);
    }

    public static boolean isSorted(int[] indices) {
        boolean flag = false;

        for (int i = 0; i < indices.length - 1; i++) {
            if (!(indices[i] < indices[i + 1])) {
                flag = false;
                break;
            } else {
                flag = true;
            }
        }
        return flag;
    }

    public static String restoreString(String s, int[] indices) {

        char[] temp = new char[indices.length];
        for (int i = 0; i < indices.length; i++) {
            temp[indices[i]] = s.charAt(i);
        }
        return new String(temp);
    }
}
