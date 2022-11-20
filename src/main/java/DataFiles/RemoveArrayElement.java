package DataFiles;

public class RemoveArrayElement {
    public static void main(String[] args) {
        int[] arr = new int[]{20, 30, 40};
        System.out.println("flag:: " + removeElement(arr));
    }

    private static int removeElement(int[] arr) {
        int flag = -1;

        if (arr.length < 1) {
            return flag;
        }

        for (int j = 0; j < arr.length - 1; j++) {
            arr[j] = arr[j + 1];
        }

        for (int j = 0; j < arr.length - 1; j++) {
            System.out.println(arr[j]+ " ");
        }
        return flag;
    }
}
