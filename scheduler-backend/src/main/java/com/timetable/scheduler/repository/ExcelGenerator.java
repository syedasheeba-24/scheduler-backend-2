package com.timetable.scheduler.repository;

import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import com.timetable.scheduler.model.Newclass;

public class ExcelGenerator {
	
	public void createExcel(Newclass newclass) {
		List<String> listOfDays = Arrays.asList("Monday","Tuesday","Wednesday","Thursday","Friday");
		String[] arrayOfSubject = newclass.getSubjects().split(",");
		int id = newclass.getClassid();
		List<String> listOfSubjects = Arrays.asList(arrayOfSubject);
	/*try   
	{  
	//declare file name to be create   
	String filename = "./src/main/resources/Timetable"+id+".xls";  
	//creating an instance of HSSFWorkbook class  
	HSSFWorkbook workbook = new HSSFWorkbook();  
	//invoking creatSheet() method and passing the name of the sheet to be created   
	HSSFSheet sheet = workbook.createSheet("TimeTable of Class "+id);   
	//creating the 0th row using the createRow() method  
	HSSFRow rowhead = sheet.createRow((short)0);  
	//creating cell by using the createCell() method and setting the values to the cell by using the setCellValue() method  
	rowhead.createCell(0).setCellValue("Day");  
	rowhead.createCell(1).setCellValue("1st period");  
	rowhead.createCell(2).setCellValue("2nd period");  
	rowhead.createCell(3).setCellValue("3rd period");  
	rowhead.createCell(4).setCellValue("4th period");
	rowhead.createCell(5).setCellValue("5th period");
	for(int i=1;i<=5;i++) {
		HSSFRow row = sheet.createRow((short)i);  
		//inserting data in the first row  
		row.createCell(0).setCellValue(listOfDays.get(i-1));  
		row.createCell(1).setCellValue(listOfSubjects.get(0));  
		row.createCell(2).setCellValue(listOfSubjects.get(1));  
		row.createCell(3).setCellValue(listOfSubjects.get(2));  
		row.createCell(4).setCellValue(listOfSubjects.get(3));
		row.createCell(5).setCellValue(listOfSubjects.get(4));  
	}
	/*creating the 1st row  
	HSSFRow row = sheet.createRow((short)1);  
	//inserting data in the first row  
	row.createCell(0).setCellValue("1");  
	row.createCell(1).setCellValue("John William");  
	row.createCell(2).setCellValue("9999999");  
	row.createCell(3).setCellValue("william.john@gmail.com");  
	row.createCell(4).setCellValue("700000.00");  
	//creating the 2nd row  
	HSSFRow row1 = sheet.createRow((short)2);  
	//inserting data in the second row  
	row1.createCell(0).setCellValue("2");  
	row1.createCell(1).setCellValue("Mathew Parker");  
	row1.createCell(2).setCellValue("22222222");  
	row1.createCell(3).setCellValue("parker.mathew@gmail.com");  
	row1.createCell(4).setCellValue("200000.00");  
	FileOutputStream fileOut = new FileOutputStream(filename);  
	workbook.write(fileOut);  
	//closing the Stream  
	fileOut.close();  
	//closing the workbook  
	workbook.close();  
	//prints the message on the console  
	System.out.println("Excel file has been generated successfully.");  
	}   
	catch (Exception e)   
	{  
	e.printStackTrace();  
	}  */
	}  
}
