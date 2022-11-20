package DataFiles;

public class CopyArray {
    public static void main(String[] args) {
        int[] arr = new int[]{4, 5, 6, 7, 8};
        copyElements(arr);
    }

    private static void copyElements(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int[] copy = new int[arr.length];

            copy[i] = arr[i];
            System.out.println("arr: " + arr[i]);
            System.out.println("copy: " + copy[i]);
        }
    }
}
