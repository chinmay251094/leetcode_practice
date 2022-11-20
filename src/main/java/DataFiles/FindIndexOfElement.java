package DataFiles;

public class FindIndexOfElement {
    public static void main(String[] args) {
        int[] arr = new int[]{27, 25, 94, 93, 10, 35, 28, 62};
        findIndex(arr, 28);
    }

    private static void findIndex(int[] arr, int i) {
        for (int j = 0; j < arr.length; j++) {
            if(arr[j] == i) {
                System.out.println(j);
            }
        }
    }
}
