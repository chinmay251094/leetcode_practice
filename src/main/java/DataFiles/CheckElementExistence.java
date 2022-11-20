package DataFiles;

public class CheckElementExistence {
    public static void main(String[] args) {
        int[] arr = {12, 36, 54, 98, 65, 23, 94, 41, 74, 58};
        System.out.println(ifElementExists(arr, 65));
    }

    private static int ifElementExists(int[] arr, int k) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k) {
                return i;
            }
        }
        return -1;
    }
}
