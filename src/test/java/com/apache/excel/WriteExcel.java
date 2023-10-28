package com.apache.excel;

import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//XSSFWorkBook
		//XSSfSheet
		//XSSFRow
		//XSSCell
		try
		{
		
		XSSFWorkbook workbook= new XSSFWorkbook();
		
		//XSSFSheet sheet= workbook.getSheet("Sheet1");
		XSSFSheet sheet= workbook.getSheetAt(0);
		
		//to go to first row
		//XSSFRow firstRow= sheet.getRow(0);
		
		int rows= sheet.getPhysicalNumberOfRows(); // no of rows (4)
		
		//int cells= firstRow.getPhysicalNumberOfCells(); //no of columns(2)
		
		/*
		
		for(int i=1; i<rows;i++)

		{
			for(int j=0; j<cells;j++)
			{
				 String cellValue = sheet.getRow(i).getCell(j).getStringCellValue();
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
		*/
		
		sheet.createRow(0).createCell(1).setCellValue("testng");
		sheet.createRow(5).createCell(1).setCellValue("google");
		
		FileOutputStream fos= new FileOutputStream("C:\\Users\\arvin\\eclipse-workspace\\selenium_learning\\src\\test\\resources\\excelwrite.xlsx");
		workbook.write(fos);
		workbook.close();
		

		
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}

	}

}
