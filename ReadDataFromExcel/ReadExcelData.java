package ReadDataFromExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {

	public static void main(String[] args) throws Exception {
		
		File src = new File("C:\\Users\\praneethM\\Desktop\\Praneeth\\ApachePOI\\ReadData.xlsx");

		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		 XSSFSheet Sheet1= wb.getSheetAt(0);
		 int rowcount =Sheet1.getLastRowNum();
		 System.out.println("The Total No of Rows are " +rowcount);
		 
		 for(int i=0;i<rowcount;i++){
			String data0= Sheet1.getRow(i).getCell(0).getStringCellValue();
			System.out.println("The row value of "+ i + "is" +data0);
		 }
		 wb.close();
	}

}
