package ExcelReading;

import org.apache.poi.ss.usermodel.*;

import java.io.File;
import java.io.IOException;

public class ExcelUtils
{
    public static Object[][] getTestData(String filePath, String sheetName) {
        Object[][] testData = null;
        try {
            Workbook workbook = WorkbookFactory.create(new File(filePath));
            Sheet sheet = workbook.getSheet(sheetName);
            int rowCount = sheet.getLastRowNum();
            int columnCount = sheet.getRow(0).getLastCellNum();
            testData = new Object[rowCount][columnCount];
            for (int i = 0; i < rowCount; i++) {
                Row row = sheet.getRow(i + 1);
                for (int j = 0; j < columnCount; j++) {
                    Cell cell = row.getCell(j);
                    switch (cell.getCellType()) {
                        case STRING:
                            testData[i][j] = cell.getStringCellValue();
                            break;
                        case NUMERIC:
                            testData[i][j] = cell.getNumericCellValue();
                            break;
                        case BOOLEAN:
                            testData[i][j] = cell.getBooleanCellValue();
                            break;
                        default:
                            testData[i][j] = null;
                    }
                }
            }
            workbook.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return testData;
    }
}
