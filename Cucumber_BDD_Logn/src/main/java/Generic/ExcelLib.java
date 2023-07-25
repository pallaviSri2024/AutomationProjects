package Generic;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelLib {

	public static String getExcelData(String sheetName, int rowNum, int cellNum) throws Exception {

		FileInputStream fis = new FileInputStream(Constants.filepath);

		// Open workbook and take the control
		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		// Get the control of sheet
		XSSFSheet sheet = workbook.getSheet(sheetName);

		// Get the control of row
		XSSFRow row = sheet.getRow(rowNum);

		// Get the data from cells of the current row
		String data = row.getCell(cellNum).getStringCellValue();

		System.out.println("read data is = " + data);
		
		return data; 
	}

	public static void setExcelData(String sheetName, int rowNum, int cellNum, String data) throws Exception {

		FileInputStream fis = new FileInputStream(Constants.filepath);

		// Open workbook and take the control
		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		// Get the control of sheet
		XSSFSheet sheet = workbook.getSheet(sheetName);

		// Get the control of row
		XSSFRow row = sheet.getRow(rowNum);

		XSSFCell cell = row.createCell(cellNum);

		FileOutputStream fos = new FileOutputStream(Constants.filepath);

		cell.setCellValue(data);

		workbook.write(fos);

		workbook.close();

	}

}
