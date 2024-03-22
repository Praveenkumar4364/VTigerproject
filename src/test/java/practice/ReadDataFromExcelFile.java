package practice;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcelFile {
public static void main(String[] args) throws Exception {
	//Step 1:- Open the document in java readable format
	FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\TestData.xlsx");
	//step 2:- create a workbook
	Workbook book=WorkbookFactory.create(fis);
	//step 3:- Navigate to required sheet
	Sheet sh=book.getSheet("Contacts");
	//step 4:- Navigate to required row
	Row r=sh.getRow(1);
	//step 5:- Navigate to required cell
	Cell c=r.getCell(1);
	//step 6:- Capture the data inside the cell
	String d=c.getStringCellValue();
	System.out.println(d);
	//step 7:- Close the workbook
	book.close();
	
}
}
