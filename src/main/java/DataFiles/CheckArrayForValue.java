package DataFiles;

public class CheckArrayForValue {
    public static void main(String[] args) {
        int[] arr = new int[]{45, 65, 78, 96, 12, 1, 6, 4, 8, 1, 123, 6};
        System.out.println(getValue(arr, 65));
    }

    private static boolean getValue(int[] arr, int value) {
        boolean flag = false;

        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i] == value) {
                flag = true;
                return flag;
            }
        }
        return flag;
    }

}
