package DataFiles;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ReadExcel {
    @Test
    public static void getData() throws IOException {
        FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir") + "/Data.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet = workbook.getSheet("RUNMANAGER");

        int row = sheet.getLastRowNum();
        int col = sheet.getRow(0).getLastCellNum();

        Map<String, String> map = null;

        for (int i = 1; i <= row; i++) {
            map = new HashMap<>();
            for (int j = 0; j <= col; j++) {
                if (sheet.getRow(i).getCell(j) == null) {
                    continue;
                }
                String key = sheet.getRow(0).getCell(j).getStringCellValue();
                String value = sheet.getRow(i).getCell(j).getStringCellValue();
                map.put(key, value);
            }
        }

        System.out.println(map);
    }
}
