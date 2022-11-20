package DataFiles;

public class DuplicatesInAnArray {
    public static void main(String[] args) {
        int[] arr = {23, 45, 67, 65, 43, 45, 25, 93, 25, 94, 10, 94};
        findDuplicates(arr);
    }

    private static void findDuplicates(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[i] == arr[j] && i != j) {
                    System.out.println(arr[j]);
                }
            }
        }
    }
}
