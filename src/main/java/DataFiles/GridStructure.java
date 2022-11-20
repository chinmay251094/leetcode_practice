package DataFiles;

public class GridStructure {
    public static void main(String[] args) {
        String[] symbols = new String[]{"-", "-", "-", "-", "-", "-", "-", "-", "-", "-"};
        GridStructure gs = new GridStructure();
        gs.gridBuild(symbols);
    }

    public void gridBuild(String[] arr) {
        for (int row = 1; row <= arr.length - 1; row++) {
            for (int col = 0; col <= arr.length - 1; col++) {
                System.out.print(arr[row] + " ");
            }
            System.out.println();
        }
    }
}
