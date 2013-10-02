package edu.nvcc.gui;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.JFrame;

import edu.nvcc.pos.FoodItem;
import edu.nvcc.utils.WriteExcel;


/**
* This code was edited or generated using CloudGarden's Jigloo
* SWT/Swing GUI Builder, which is free for non-commercial
* use. If Jigloo is being used commercially (ie, by a corporation,
* company or business for any purpose whatever) then you
* should purchase a license for each developer using Jigloo.
* Please visit www.cloudgarden.com for details.
* Use of Jigloo implies acceptance of these licensing terms.
* A COMMERCIAL LICENSE HAS NOT BEEN PURCHASED FOR
* THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED
* LEGALLY FOR ANY CORPORATE OR COMMERCIAL PURPOSE.
*/
public class EditPanel extends JPanel implements ActionListener {
	private JButton jButton1;
	private JLabel addLabel;
	private JLabel priceLabel;
	private JButton searchButton;
	private JTextField categoryField;
	private JLabel categoryLabel;
	private JTextArea ItemStatusArea;
	private JButton addFoodButton;
	private JButton confirmButton;
	private JTextField sizeField;
	private JTextField descriptionField;
	private JTextField quantityField;
	private JTextField priceField;
	private JTextField nameField;
	private JLabel sizeLabel;
	private JLabel descriptionLabel;
	private JLabel quantitylabel;
	private JLabel nameLabel;
	WriteExcel we = new WriteExcel();

	/**
	* Auto-generated main method to display this 
	* JPanel inside a new JFrame.
	*/
		
	EditPanel() {
		try {
			this.setPreferredSize(new java.awt.Dimension(1000, 800));
			this.setLayout(null);
			{
				addLabel = new JLabel();
				this.add(addLabel);
				addLabel.setText("Edit Food Item");
				addLabel.setBounds(363, 3, 429, 88);
				addLabel.setFont(new java.awt.Font("Segoe UI",0,36));
			}
			{
				nameLabel = new JLabel();
				this.add(nameLabel);
				nameLabel.setText("Name :");
				nameLabel.setBounds(123, 197, 196, 31);
				nameLabel.setFont(new java.awt.Font("Segoe UI",0,24));
			}
			{
				priceLabel = new JLabel();
				this.add(priceLabel);
				priceLabel.setText("Price :");
				priceLabel.setBounds(125, 260, 192, 38);
				priceLabel.setFont(new java.awt.Font("Segoe UI",0,24));
			}
			{
				quantitylabel = new JLabel();
				this.add(quantitylabel);
				quantitylabel.setText("Quantity :");
				quantitylabel.setBounds(124, 324, 193, 37);
				quantitylabel.setFont(new java.awt.Font("Segoe UI",0,24));
			}
			{
				descriptionLabel = new JLabel();
				this.add(descriptionLabel);
				descriptionLabel.setText("Description :");
				descriptionLabel.setBounds(125, 387, 191, 36);
				descriptionLabel.setFont(new java.awt.Font("Segoe UI",0,24));
			}
			{
				sizeLabel = new JLabel();
				this.add(sizeLabel);
				sizeLabel.setText("Size :");
				sizeLabel.setBounds(126, 451, 189, 37);
				sizeLabel.setFont(new java.awt.Font("Segoe UI",0,24));
			}
			{
				nameField = new JTextField();
				this.add(nameField);
				nameField.setBounds(306, 206, 295, 40);
			}
			{
				priceField = new JTextField();
				this.add(priceField);
				priceField.setBounds(306, 267, 295, 40);
			}
			{
				quantityField = new JTextField();
				this.add(quantityField);
				quantityField.setBounds(306, 327, 295, 40);
			}
			{
				descriptionField = new JTextField();
				this.add(descriptionField);
				descriptionField.setBounds(307, 388, 295, 40);
			}
			{
				sizeField = new JTextField();
				this.add(sizeField);
				sizeField.setBounds(307, 449, 295, 40);
			}
			{
				confirmButton = new JButton();
				this.add(confirmButton);
				confirmButton.setText("Done");
				confirmButton.setBounds(813, 647, 137, 60);
				confirmButton.setFont(new java.awt.Font("Segoe UI",0,20));
				confirmButton.addActionListener(this);
			}
			{
				addFoodButton = new JButton();
				this.add(addFoodButton);
				addFoodButton.setText("Edit");
				addFoodButton.setBounds(776, 515, 121, 50);
				addFoodButton.setFont(new java.awt.Font("Segoe UI",0,20));
				addFoodButton.addActionListener(this);
			}
			{
				ItemStatusArea = new JTextArea();
				this.add(ItemStatusArea);
				ItemStatusArea.setBounds(711, 206, 234, 231);
			}
			{
				categoryLabel = new JLabel();
				this.add(categoryLabel);
				categoryLabel.setText("Category:");
				categoryLabel.setBounds(126, 515, 141, 34);
				categoryLabel.setFont(new java.awt.Font("Segoe UI",0,24));
			}
			{
				categoryField = new JTextField();
				this.add(categoryField);
				categoryField.setBounds(307, 515, 295, 46);
			}
			{
				searchButton = new JButton();
				this.add(searchButton);
				searchButton.setText("Search");
				searchButton.setBounds(613, 206, 79, 38);
				searchButton.setFont(new java.awt.Font("Segoe UI",0,20));
				searchButton.addActionListener(this);
			}

		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}
	public void actionPerformed(ActionEvent event)
	{
		
		if (event.getActionCommand().equals("Done")) {
			   
			   POSFrame.mainpanel();
		}
		if(event.getActionCommand().equals("Edit")){
			//String name = getNameField();
			FoodItem editfi = new FoodItem(getNameField(),getPriceField(),getQuantityField(),getDescriptionField(),getSizeField(),getCategory());
			ReadPanel.restaurant.getFoodList().add(editfi);
			we.WriteExcelFile(ReadPanel.restaurant.getFoodList());
			ItemStatusArea.setText("Item Edited on List");
			ItemStatusArea.setText(editfi.toString());
			
			}
		if(event.getActionCommand().equals("Search")){
			FoodItem editfi = (ReadPanel.restaurant.getFoodList().search(getNameField()));
			nameField.setText(editfi.getName());
			priceField.setText(Double.toString(editfi.getPrice()));
			quantityField.setText(Integer.toString(editfi.getQuantity()));
			descriptionField.setText(editfi.getDescription());
			sizeField.setText(editfi.getSize());
			categoryField.setText(editfi.getCategory());
			ReadPanel.restaurant.getFoodList().remove(getNameField());
		}
	}
	private String getCategory() {
		// TODO Auto-generated method stub
		return categoryField.getText();
	}
	public String getNameField() {
		
		return nameField.getText();
	}
	
	public int getQuantityField() {
		int i = Integer.parseInt(quantityField.getText());
		return i;
	}
	
	public String getSizeField() {
		return sizeField.getText();
	}
	public String getDescriptionField() {
		return descriptionField.getText();
	}
	public double getPriceField() {
		try{
		double d = Double.parseDouble(priceField.getText());
		return d;
		}catch(NumberFormatException nfe){
			priceField.setText("");
			double d = Double.parseDouble(priceField.getText());
			return d;
		}
		
	}
}