package edu.nvcc.pos;

import java.io.Serializable;
import java.math.BigDecimal;


public class FoodItem implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String name;
	double price;
	int quantity;
	String description;
	String size;
	String category;

	public FoodItem() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FoodItem(String name, double price, int quantity,
			String description, String size, String category) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.description = description;
		this.size = size;
		this.category = category;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getCategory() {
		return category;
	}
	public void setSpecialOrder(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Name = "+name+"\n"+"Price = "+price+"\n"+"Quantity = "+quantity+"\n"+"Description = "+description+"\n"
				+"Size = "+size+"\n"+"Category = "+category;
	}

}