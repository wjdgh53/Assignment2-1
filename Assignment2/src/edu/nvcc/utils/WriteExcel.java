package edu.nvcc.utils;

import java.io.*;
import java.util.*;

import edu.nvcc.gui.*;
import edu.nvcc.pos.FoodItem;
import edu.nvcc.pos.ItemList;

import org.apache.poi.hssf.record.formula.functions.Row;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;

public class WriteExcel {
	HSSFWorkbook workbook = new HSSFWorkbook();
	HSSFSheet sheet = workbook.createSheet("Sample sheet");
	Map<Integer, Object[]> data = new HashMap<Integer, Object[]>();


	public void WriteExcelFile(ItemList fi) {
		for(int i = 0; i<fi.size(); i++){
		data.put(i, new Object[] {((FoodItem) fi.showlist(i)).getName(),((FoodItem) fi.showlist(i)).getPrice(),((FoodItem) fi.showlist(i)).getQuantity(),
									((FoodItem) fi.showlist(i)).getDescription(),((FoodItem) fi.showlist(i)).getSize(),((FoodItem) fi.showlist(i)).getCategory()});
		}
		Set<Integer> keyset = data.keySet();
		int rownum = 0;
		for (Integer key : keyset) {
			HSSFRow row = sheet.createRow(rownum++);
			Object [] objArr = data.get(key);
			int cellnum = 0;
			for (Object obj : objArr) {
				Cell cell = row.createCell(cellnum++);
				 if(obj instanceof Date) 
		            cell.setCellValue((Date)obj);
		        else if(obj instanceof Boolean)
		            cell.setCellValue((Boolean)obj);
		        else if(obj instanceof String)
		            cell.setCellValue((String)obj);
		        else if(obj instanceof Double)
		            cell.setCellValue((Double)obj);
		        else if(obj instanceof Integer)
		        	cell.setCellValue((Integer)obj);		     
				
			}

		}
		try {
		    FileOutputStream out = 
		            new FileOutputStream(new File("C:\\Users\\jeongho\\Documents\\³ë¹Ù\\2013 Fall\\CSC 202\\Assignment2\\Files\\FoodInformation.xls"));
		    workbook.write(out);
		    out.close();
		    System.out.println("Excel written successfully..");
		     
		} catch (FileNotFoundException e) {
		    e.printStackTrace();
		} catch (IOException e) {
		    e.printStackTrace();
		}
		
	}
}