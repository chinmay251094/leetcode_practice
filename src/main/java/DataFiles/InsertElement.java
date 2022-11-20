package DataFiles;

import java.util.Arrays;

public class InsertElement {
    public static void main(String[] args) {
        addElement(6, 65);
    }

    private static void addElement(int x, int y) {
        int[] arr = {45, 25, 10, 94, 93, 7, 56, 96};

        for (int i = 0; i < 1; i++) {
            arr[x] = y;
            System.out.println(Arrays.toString(arr));
        }
    }
}
