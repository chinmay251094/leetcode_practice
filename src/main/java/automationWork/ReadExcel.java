package automationWork;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReadExcel {
    public static void readExcelData() throws IOException {
        FileInputStream fis = new FileInputStream("G:\\SeleniumProject\\src\\main\\java\\DataFiles\\Data.xlsx");
        XSSFWorkbook book = new XSSFWorkbook(fis);
        XSSFSheet sheet = book.getSheet("RunManager");

        Map<String, String> map = null;
        List<Map<String, String>> list = new ArrayList<>();

        int lastRowNum = sheet.getLastRowNum();
        int lastColNum = sheet.getRow(0).getLastCellNum();

        for (int i = 1; i <= lastRowNum; i++) {
            map = new HashMap<>();
            for (int j = 0; j < lastColNum; j++) {
                String key = sheet.getRow(0).getCell(j).getStringCellValue();
                String value = sheet.getRow(i).getCell(j).getStringCellValue();
                map.put(key, value);
            }
            list.add(map);
        }

        for (int i = 0; i < list.size(); i++) {
            for (Map.Entry<String, String> entry : list.get(i).entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                System.out.println("Key is:: " + key + " and its value is:: " + value);
            }
        }
    }
    public static void main(String[] args) throws IOException {
        ReadExcel.readExcelData();
    }
}
