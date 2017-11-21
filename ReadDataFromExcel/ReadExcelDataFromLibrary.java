package ReadDataFromExcel;
import library.ReadExcelData;

public class ReadExcelDataFromLibrary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ReadExcelData excel = new ReadExcelData("C:\\Users\\praneethM\\Desktop\\Praneeth\\ApachePOI\\ReadData.xlsx");
		System.out.println(excel.getData(1, 0, 0));
	}

}
