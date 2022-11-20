package DataFiles;

public class DuplicateElements {
    public static void main(String[] args) {
        int[] arr = {5, 2, 7, 7, 5};
        duplicates(arr);
    }

    private static void duplicates(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 1; j < arr.length; j++) {
                if(arr[i] == arr[j] && i != j) {
                    System.out.println("Duplicates are: "+arr[j]);
                }
            }
        }
    }
}
