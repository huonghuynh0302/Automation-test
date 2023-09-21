package org.example;
import org.example.Method.ExcelUtils;
import org.testng.annotations.DataProvider;
import java.io.IOException;
public class input_data {

        @DataProvider(name = "1")
        public Object[][] dpMethod(){
            return new Object[][] {{"100150072"}, {"292900003"}, {"276501151"}};
        }
        @DataProvider(name = "2")
        public Object[][] test(){
            return new Object[][] {{"292900003"},{"292900003"}};
        }

    @DataProvider(name = "task")
    public Object[][] taotask(){
        return new Object[][] {{"Test 2"},{"Test 3"},{"Test 4"},{"Test 5"}};
    }
    @DataProvider(name = "3")
    public Object[][] getExcelData() throws IOException {
        String excelSheetPath = System.getProperty("user.dir")+"\\src\\main\\java\\org\\example\\TestData\\Book1.xlsx";
        String sheetName = "Sheet1";
        ExcelUtils excelUtils = new ExcelUtils();
        return excelUtils.getExcelData(excelSheetPath, sheetName);
    }
    @DataProvider(name = "4")
    public Object[][] getExcelDataAddress() throws IOException {
        String excelSheetPath = System.getProperty("user.dir")+"\\src\\main\\java\\org\\example\\TestData\\Book2.xlsx";
        String sheetName = "Sheet1";
        ExcelUtils excelUtils = new ExcelUtils();
        return excelUtils.getExcelData(excelSheetPath, sheetName);
    }
//
//        @Test(dataProvider = "2")
//        public void myTest (String val) {
//            System.out.println("Passed Parameter Is : " + val);
//        }

}
