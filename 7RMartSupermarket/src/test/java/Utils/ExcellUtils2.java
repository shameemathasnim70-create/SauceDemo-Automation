package Utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcellUtils2 {
	
static String filePath ="\"C:\\Users\\Rasheena Ali\\AppData\\Roaming\\Microsoft\\Excel\\TestData2.xlsx\"";
	
	//excel data reading
	public static String  getCellData(int row,int col) throws IOException {
		FileInputStream fis = new FileInputStream(filePath);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
	
		XSSFSheet sheet =wb.getSheet("LoginPage");
		if(sheet==null) {
			throw new RuntimeException("sheet not found");
		}
		if(sheet.getRow(row)==null) {
			throw new RuntimeException("Row not found");
		}
		String data =sheet.getRow(row).getCell(col).getStringCellValue();
		wb.close();
		return data;
		
	}
	//data write into ExcelUtils
	public static void setCellData(int row, int col, String value) throws Exception {
	    
        FileInputStream fis = new FileInputStream(filePath);
        XSSFWorkbook wb = new XSSFWorkbook(fis);
        XSSFSheet sheet = wb.getSheet("LoginPage");

        sheet.getRow(row).createCell(col).setCellValue(value);
   
        FileOutputStream fos = new FileOutputStream(filePath);
        
        wb.write(fos);

        wb.close();
       
        fos.close();

}
}