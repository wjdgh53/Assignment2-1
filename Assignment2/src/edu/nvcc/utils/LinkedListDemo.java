package edu.nvcc.utils;

import java.math.BigDecimal;

import edu.nvcc.pos.FoodItem;

public class LinkedListDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<FoodItem> aList = new LinkedList<FoodItem>();
		
		FoodItem fi = new FoodItem("Frenchfries",2.0,2,"good","midium",false);
		
		/*aList.add("Appetizer");
		aList.add("Beverage");
		aList.add("Desert");
		aList.add("Entre");
		aList.add("Chef's Special");*/
		aList.add(fi);
		System.out.println(aList);
		//aList.remove("Entre");
		//System.out.println(aList);
		//System.out.println("pop : "+aList.pop());
		//System.out.println(aList);
	}

}
