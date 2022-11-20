package leetCode;

import java.util.ArrayList;
import java.util.List;

public class ExcelSheetCellRange {
    public static void main(String[] args) {
        System.out.println(cellsInRange("C1:K9"));
    }

    //read data from excel
    public static List<String> cellsInRange(String str) {
        char[] s = str.toCharArray();
        List<String> result = new ArrayList<>();

        for (char c1 = s[0]; c1 <= s[3]; c1++) {
            for (char c2 = s[1]; c2 <= s[4]; c2++) {
                result.add("" + c1 + c2);
            }
        }
        return result;
    }
}
