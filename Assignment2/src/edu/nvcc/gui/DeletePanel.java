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
public class DeletePanel extends JPanel implements ActionListener {

	private JButton jButton1;
	private JLabel addLabel;
	private JButton searchButton;
	private JTextArea ItemStatusArea;
	private JButton addFoodButton;
	private JButton confirmButton;
	private JTextField nameField;
	private JLabel nameLabel;
	WriteExcel we = new WriteExcel();

	/**
	* Auto-generated main method to display this 
	* JPanel inside a new JFrame.
	*/
		
	DeletePanel() {
		try {
			this.setPreferredSize(new java.awt.Dimension(1000, 800));
			this.setLayout(null);
			{
				addLabel = new JLabel();
				this.add(addLabel);
				addLabel.setText("Delete Food Item");
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
				nameField = new JTextField();
				this.add(nameField);
				nameField.setBounds(306, 206, 295, 40);
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
				addFoodButton.setText("Delete");
				addFoodButton.setBounds(670, 647, 132, 60);
				addFoodButton.setFont(new java.awt.Font("Segoe UI",0,20));
				addFoodButton.addActionListener(this);
			}
			{
				ItemStatusArea = new JTextArea();
				this.add(ItemStatusArea);
				ItemStatusArea.setBounds(653, 206, 292, 231);
			}
			{
				searchButton = new JButton();
				this.add(searchButton);
				searchButton.setText("Search");
				searchButton.setBounds(469, 258, 132, 47);
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
		if(event.getActionCommand().equals("Delete")){
			//String name = getNameField();
			//FoodItem addfi = new FoodItem(getNameField(),getPriceField(),getQuantityField(),getDescriptionField(),getSizeField(),getCategory());
			ReadPanel.restaurant.getFoodList().remove(getNameField());
			we.WriteExcelFile(ReadPanel.restaurant.getFoodList());
			ItemStatusArea.setText("Item Deleted on List");			
			}
		if(event.getActionCommand().equals("Search")){
			ItemStatusArea.setText(ReadPanel.restaurant.getFoodList().search(getNameField()).toString());
		}
	}
	public String getNameField() {
		
		return nameField.getText();
	}
	
	
}
