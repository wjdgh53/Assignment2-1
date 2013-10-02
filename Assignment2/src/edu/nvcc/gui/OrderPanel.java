package edu.nvcc.gui;

import java.awt.Dimension;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

import javax.swing.WindowConstants;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextArea;
import javax.swing.ListModel;

import edu.nvcc.utils.ReadExcel;


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
public class OrderPanel extends javax.swing.JPanel {
	private JList CategoryList;
	private JList FoodList;
	private JLabel recipeLabel;
	private JButton orderButton;
	private JButton finishButton;
	private JLabel orderLabel;
	private JTextArea recipeArea;
	private JLabel foodLabel;
	private JLabel categoryLabel;

	/**
	* Auto-generated main method to display this 
	* JPanel inside a new JFrame.
	*/
		
	public OrderPanel() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			setPreferredSize(new Dimension(1000, 800));
			this.setLayout(null);
			{
				String category[] = new String[ReadPanel.restaurant.getMenuList().size()];
				for(int i = 0; i < ReadPanel.restaurant.getMenuList().size(); i++)
				{
					category[i] = ReadPanel.restaurant.getMenuList().showlist(i).toString();
				}
				
				ListModel jList1Model = new DefaultComboBoxModel(category);
				CategoryList = new JList();
				
				this.add(CategoryList);
				CategoryList.setModel(jList1Model);
		
				CategoryList.setBounds(18, 176, 260, 417);
				System.out.println(CategoryList.getSelectedValue());
			}
			{
				
				FoodList = new JList();
				this.add(FoodList);
				
				FoodList.setBounds(298, 178, 260, 417);
			}
			{
				categoryLabel = new JLabel();
				this.add(categoryLabel);
				categoryLabel.setText("Category");
				categoryLabel.setBounds(85, 114, 117, 59);
				categoryLabel.setFont(new java.awt.Font("Segoe UI",0,28));
			}
			{
				foodLabel = new JLabel();
				this.add(foodLabel);
				foodLabel.setText("Food");
				foodLabel.setBounds(388, 114, 117, 59);
				foodLabel.setFont(new java.awt.Font("Segoe UI",0,28));
			}
			{
				recipeArea = new JTextArea();
				this.add(recipeArea);
				recipeArea.setText("Order Item comes here");
				recipeArea.setBounds(702, 173, 260, 417);
			}
			{
				recipeLabel = new JLabel();
				this.add(recipeLabel);
				recipeLabel.setText("Recipe");
				recipeLabel.setBounds(790, 115, 116, 59);
				recipeLabel.setFont(new java.awt.Font("Segoe UI",0,28));
			}
			{
				orderButton = new JButton();
				this.add(orderButton);
				orderButton.setText("Order");
				orderButton.setBounds(570, 317, 121, 45);
				orderButton.setFont(new java.awt.Font("Segoe UI",0,20));
			}
			{
				orderLabel = new JLabel();
				this.add(orderLabel);
				orderLabel.setText("Order Here");
				orderLabel.setBounds(334, 35, 234, 55);
				orderLabel.setFont(new java.awt.Font("Segoe UI",0,36));
			}
			{
				finishButton = new JButton();
				this.add(finishButton);
				finishButton.setText("Finish");
				finishButton.setBounds(790, 680, 155, 57);
				finishButton.setFont(new java.awt.Font("Segoe UI",0,20));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		String foodItem[] = new String[ReadPanel.restaurant.getFoodList().size()];
		//System.out.println()
		
					
			if(CategoryList.getSelectedValue().equals("Steak")){
				while(true){
				if(ReadPanel.restaurant.getFoodList().showlist(i).getCategory().toString().equals("Steak")){
					foodItem[i] = ReadPanel.restaurant.getFoodList().showlist(i).getCategory().toString();
				}
				//foodItem[i] = ReadPanel.restaurant.getFoodList().showlist(i).getCategory().toString();
			}
			ListModel FoodListModel = new DefaultComboBoxModel(foodItem);
			FoodList.setModel(FoodListModel);
		}
	}

}
