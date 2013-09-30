package edu.nvcc.pos;

import java.io.File;
import java.util.List;
import java.util.Scanner;

import javax.swing.JFileChooser;

import edu.nvcc.utils.LinkedList;
import edu.nvcc.utils.ReadExcel;

public class POSDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		//In response to a button click:
		ReadExcel restaurant = null;
		int returnVal;
		final JFileChooser fc = new JFileChooser();
		returnVal = fc.showOpenDialog(null);
		
		ItemList<FoodItem> foodList = new ItemList<FoodItem>();
		ItemList<FoodItem> selectList = new ItemList<FoodItem>();
		//System.out.println(returnVal);
		if (returnVal == JFileChooser.APPROVE_OPTION) {
			File selectedFile = fc.getSelectedFile();
			String path = selectedFile.getAbsolutePath();
			System.out.println(path);
			try {
				restaurant = new ReadExcel(path);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		for(int i = 0; i < restaurant.getFiarray().size();i++)
		{
			foodList.add(restaurant.getFoodItem(i));
		}
		System.out.println(foodList);
		System.out.println("what do you want to do next?");
		System.out.println("Please select food any food");
		String foodName = keyboard.next();
		selectList.add(foodList.search(foodName));
		System.out.println("Please select food any food");
		foodName = keyboard.next();		
		foodList.remove(foodName);
		System.out.println(foodList);
		
		System.out.println(selectList);
	}

	
	//showExcelData(sheetData,8)
	//FoodItem fi = new FoodItem("Frenchfries",2.0,2,"good","midium",false);

	/*aList.add("Appetizer");
		aList.add("Beverage");
		aList.add("Desert");
		aList.add("Entre");
		aList.add("Chef's Special");*/

	//System.out.println(aList);
	//aList.remove("Entre");
	//System.out.println(aList);
	//System.out.println("pop : "+aList.pop());
	//System.out.println(aList);
}


