package org.example.Method;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.IOException;

public class ExcelUtils {
    public static XSSFWorkbook workbook;
    public static XSSFSheet worksheet;
    public static DataFormatter formatter = new DataFormatter();

    public  Object[][] getExcelData(String excelSheetPath, String sheetName) {
        Object[][] Data = new Object[0][];
        try (
                OPCPackage pkg = OPCPackage.open(new File(excelSheetPath)); // lấy đường dẫn thư mục
        ) {
            workbook = new XSSFWorkbook(pkg); //work dùng cho fide xlxs
            worksheet = workbook.getSheet(sheetName);// get my sheet from workbook
            XSSFRow Row = worksheet.getRow(0);   // lấy row bắt đầu từ 0
            int RowNum = worksheet.getPhysicalNumberOfRows();// tổng row
            int ColNum = Row.getLastCellNum(); // colum cuối cùng

            Data = new Object[RowNum - 1][ColNum];

            for (int i = 0; i < RowNum - 1; i++) // loop chạy từ row trước
            {
                XSSFRow row = worksheet.getRow(i + 1);

                for (int j = 0; j < ColNum; j++) //Loop chạy tiếp theo colum
                {
                    if (row == null)
                        Data[i][j] = "";
                    else {
                        XSSFCell cell = row.getCell(j);
                        if (cell == null)
                            Data[i][j] = ""; //if it get Null value it pass no data
                        else {
                            String value = formatter.formatCellValue(cell);
                            Data[i][j] = value;

                        }
                    }
                }
            }
        } catch (InvalidFormatException | IOException e) {
            e.printStackTrace();
        }
        return Data;
    }
}

