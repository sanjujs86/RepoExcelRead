package Package1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelA {

	XSSFSheet sh;
	
	public ExcelA() throws IOException
	{
		FileInputStream f= new FileInputStream("C:\\WORK\\Test.xlsx");
		XSSFWorkbook w= new XSSFWorkbook(f);
		sh= w.getSheet("Sheet1");      

	}	
	/*
	 * public double readData(int i, int j) { Row r= sh.getRow(i); Cell c=
	 * r.getCell(j); //Import Cell of apache poi not Table return
	 * c.getNumericCellValue(); //Read integer data and return it as double
	 * 
	 * }
	 */	
	/*
	 * public String readData(int i ,int j) { String readvalue=""; Row
	 * r=sh.getRow(i); Cell c=r.getCell(j); int celltype =c.getCellType();
	 * 
	 * switch(celltype) { case Cell.CELL_TYPE_NUMERIC: { double
	 * value=c.getNumericCellValue(); readvalue=String.valueOf(value);
	 * 
	 * } case Cell.CELL_TYPE_STRING: readvalue =c.getStringCellValue(); }
	 * 
	 * return readvalue; }
	 */
	
	public String readData(int i ,int j)
	{
		  
		Row r=sh.getRow(i);
		Cell c=r.getCell(j);
		int celltype =c.getCellType(); 
	 // System.out.println(celltype);  
		switch(celltype)
		{
		case Cell.CELL_TYPE_NUMERIC:
		{
			double value=c.getNumericCellValue();
			return String.valueOf(value);
			
		}
		case Cell.CELL_TYPE_STRING:
			return c.getStringCellValue();
		}
		return null;
	 
	 
	}


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
