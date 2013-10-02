package edu.nvcc.utils;
//import FoodItem;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.apache.poi.hssf.record.formula.functions.T;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;

import edu.nvcc.pos.CategoryList;
import edu.nvcc.pos.FoodItem;
import edu.nvcc.pos.ItemList;

public class ReadExcel {
	ItemList<FoodItem> foodList = new ItemList<FoodItem>();
	CategoryList<String> categoryList = new CategoryList<String>();
	@SuppressWarnings({ "unchecked", "unchecked" })
	public ReadExcel(String path) throws Exception {
		// An excel file name. You can create a file name with a full
		// path information.
		//C:\Users\tkanchanawanchai6403\Documents
		//String filename = "Files\\test.xls";
		String filename = path;
		//
		// Create an ArrayList to store the data read from excel sheet.
		//
		List sheetData = new ArrayList();
		FileInputStream fis = null;
		try {
			//
			// Create a FileInputStream that will be use to read the
			// excel file.
			//
			fis = new FileInputStream(filename);

			//
			// Create an excel workbook from the file system.
			//
			HSSFWorkbook workbook = new HSSFWorkbook(fis);
			//
			// Get the first sheet on the workbook.
			//
			HSSFSheet sheet = workbook.getSheetAt(0);

			//
			// When we have a sheet object in hand we can iterator on
			// each sheet's rows and on each row's cells. We store the
			// data read on an ArrayList so that we can printed the
			// content of the excel to the console.
			//
			Iterator rows = sheet.rowIterator();
			while (rows.hasNext()) {
				HSSFRow row = (HSSFRow) rows.next();
				Iterator cells = row.cellIterator();

				List data = new ArrayList();
				while (cells.hasNext()) {
					HSSFCell cell = (HSSFCell) cells.next();
					data.add(cell);
				}

				sheetData.add(data);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fis != null) {
				fis.close();
			}
		}

		showExcelData(sheetData);
	}
	private void showExcelData(List sheetData) {
		//
		// Iterates the data and print it out to the console.
		//
		String name = "";
		double price =0;
		int quantity=0;
		String description="";
		String size="";
		String category=""; 
	
		for(int i=1; i < sheetData.size(); i++) 
		{
			List list = (List) sheetData.get(i);			
			for (int j = 0; j < list.size(); j++) 
			{	
				if(j==0)
				{
					Cell cell = (Cell) list.get(j);
					name = cell.getStringCellValue();
				}if(j==1)
				{
					Cell cell = (Cell) list.get(j);
					price = cell.getNumericCellValue();
				}if(j==2)
				{
					Cell cell = (Cell) list.get(j);
					quantity = (int)cell.getNumericCellValue();
				}if(j==3)
				{
					Cell cell = (Cell) list.get(j);
					description = cell.getStringCellValue();
				}if(j==4)
				{
					Cell cell = (Cell) list.get(j);
					size = cell.getStringCellValue();
				}if(j==5)
				{
					Cell cell = (Cell) list.get(j);
					category = cell.getStringCellValue();
				}
				
			}
			
					
			getFoodList().add(new FoodItem(name,price,quantity,description,size,category));
			if(!getMenuList().contains(category))
			{
				getMenuList().add(category);
			}
		}
		
		System.out.println(getMenuList());
	}
	public CategoryList<String> getMenuList(){
		return categoryList;
	}
	public void setcategoryarray(CategoryList<String> categoryList) {
		this.categoryList = categoryList;
	}
	public ItemList<FoodItem> getFoodList() {
		return foodList;
	}
	public void setFiarray(ItemList<FoodItem> foodList) {
		this.foodList = foodList;
	}
}