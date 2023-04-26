package Generic_Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_Utility {

/**
 * 	this method is used to fetch data from excel
 * @param sheetName
 * @param rowNum
 * @param cellNum
 * @return
 * @throws Throwable
 * @author rahul
 * @param data 
 */
		
  public String getExcelData(String sheetName,int rowNum,int cellNum) throws Throwable
  {
	  FileInputStream fes = new FileInputStream("./src/test/resources/ExcelFeb.xlsx");
		
		Workbook book = WorkbookFactory.create(fes);
		
		Sheet sheet = book.getSheet(sheetName);
		Row row = sheet.getRow(rowNum);
		Cell cell = row.getCell(cellNum);
		String Value = cell.getStringCellValue();
	    return Value; 
		
  }
/*		DataFormatter format = new DataFormatter();
		String data = format.formatCellValue(book.getSheet(sheetName).getRow(rowNum).getCell(cellNum));
		return data; */
		/**
		 * 	Fetching data from excel by using DataFormatter();
		 * @param sheetName
		 * @param rowNum
		 * @param cellNum
		 * @return
		 * @throws Throwable
		 * @author rahul
		 * @param data 
		 */
		
	   public String getExcelUsingDataFormatter(String sheetName,int rowNum,int cellNum) throws Throwable {
		  
		   FileInputStream fes1 = new FileInputStream("./src/test/resources/ExcelFeb.xlsx");
			Workbook book1 = WorkbookFactory.create(fes1);
			DataFormatter format = new DataFormatter();
			String data = format.formatCellValue(book1.getSheet(sheetName).getRow(rowNum).getCell(cellNum));
		   
		   return data;
	   }
			
}
		
  
  
 
