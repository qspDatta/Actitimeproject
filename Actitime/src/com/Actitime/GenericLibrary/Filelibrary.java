package com.Actitime.GenericLibrary;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * This is a generic Library class which contains all the generic methods
 * @author Dattashri
 *
 */
public class Filelibrary {
	/**
	 * This is generic method which is used to read the data from property file.
	 * @param key
	 * @return
	 * @throws IOException
	 */
	public String readDataFromPropertyFile(String key) throws IOException {
		FileInputStream fis=new FileInputStream("./Testdata/commomdata.property");
		Properties p=new Properties();
		p.load(fis);
		String value = p.getProperty(key);
		return value;
	}
	/**
	 * This is generic method which is used to read the data from excel sheet.
	 * @param sheetname
	 * @param row
	 * @param cell
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public String readDataFromExcel(String sheetname,int row,int cell) throws EncryptedDocumentException, IOException {
		FileInputStream fis1=new FileInputStream("./Testdata/TESTDATA.xlsx");
	   Workbook wb = WorkbookFactory.create(fis1);
	   String value = wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
	   return value;
	}	

}
