package com.apache.excel;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//XSSFWorkBook
		//XSSfSheet
		//XSSFRow
		//XSSCell
		try
		{
		
		XSSFWorkbook workbook= new XSSFWorkbook("C:\\Users\\arvin\\eclipse-workspace\\selenium_learning\\src\\test\\resources\\exceldata.xlsx");
		
		//XSSFSheet sheet= workbook.getSheet("data");
		XSSFSheet sheet= workbook.getSheetAt(0);
		
		//to go to first row
		XSSFRow firstRow= sheet.getRow(0);
		
		int rows= sheet.getPhysicalNumberOfRows(); // no of rows (4)
		
		int cells= firstRow.getPhysicalNumberOfCells(); //no of columns(2)
		
		for(int i=1; i<rows;i++)

		{
			for(int j=0; j<cells;j++)
			{
				String cellValue=sheet.getRow(i).getCell(j).getStringCellValue();
				//int cellValue=sheet.getRow(i).getCell(j).getNumericCellValue();

				
				//To write to an excel on a particular row
				//sheet.createRow(5).createCell(0).setCellValue("writing");
				
				System.out.println ("Cell value-->"+cellValue);
				//Topic --> [0][0]
				//sSource url [0][1]
				//java [1][0]
				//javattpoint[1][1]
				//selenium [2][0]
				//guvi[2][1]
				//testing[3][0]
				//google[3][1]
			}
		}
		

		
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}

	}

}
