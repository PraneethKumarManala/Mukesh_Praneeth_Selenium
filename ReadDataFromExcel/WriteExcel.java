package ReadDataFromExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		File src = new File("C:\\Users\\praneethM\\Desktop\\Praneeth\\ApachePOI\\ReadData.xlsx");

		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		 XSSFSheet Sheet1= wb.getSheetAt(0);
		 Sheet1.getRow(0).createCell(2).setCellValue("pass");
		 Sheet1.getRow(1).createCell(2).setCellValue("fail");
		 FileOutputStream fos = new FileOutputStream(src);
		 wb.write(fos);
		 wb.close();
		 
	}

}
