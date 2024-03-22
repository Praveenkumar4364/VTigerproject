package genericUtilityorLibrary;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * This class consists of reusable methods related to Excel file
 * @author praveen
 *
 */
public class ExcelUtility {
	/**
	 * This method will read the data from excel file and return the data to the caller
	 * @param sheetname
	 * @param rownum
	 * @param cellnum
	 * @return DATA
	 * @throws Exception
	 */
public String getdataformexcel(String sheetname,int rownum,int cellnum) throws Exception
{
	FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\TestData.xlsx");
	Workbook book = WorkbookFactory.create(fis);
	Sheet sh = book.getSheet(sheetname);
	DataFormatter df=new DataFormatter();
	String DATA=df.formatCellValue(sh.getRow(rownum).getCell(cellnum));
	return DATA;
	
}
}
