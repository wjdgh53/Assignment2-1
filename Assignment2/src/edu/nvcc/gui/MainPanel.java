package edu.nvcc.gui;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import javax.swing.JFrame;


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
public class MainPanel extends JPanel implements ActionListener {
	private JLabel titleLabel;
	private JButton orderButton;
	private JButton editButton;
	private JButton deleteButton;
	private JButton addButton;
	/**
	* Auto-generated main method to display this 
	* JPanel inside a new JFrame.
	*/
		
	MainPanel(){
		try {

			this.setPreferredSize(new java.awt.Dimension(1000, 800));
			this.setLayout(null);
			{
				titleLabel = new JLabel();
				this.add(titleLabel);
				titleLabel.setText("POS");
				titleLabel.setBounds(395, 82, 236, 168);
				titleLabel.setFont(new java.awt.Font("Segoe UI",0,72));
			}
			{
				addButton = new JButton();
				this.add(addButton);
				addButton.setText("Add");
				addButton.setBounds(117, 361, 254, 85);
				addButton.setFont(new java.awt.Font("Segoe UI",0,24));
				addButton.addActionListener(this);
				
				
			}
			{
				deleteButton = new JButton();
				this.add(deleteButton);
				deleteButton.setText("Delete");
				deleteButton.setBounds(574, 361, 254, 85);
				deleteButton.setFont(new java.awt.Font("Segoe UI",0,24));
				deleteButton.addActionListener(this);
			}
			{
				editButton = new JButton();
				this.add(editButton);
				editButton.setText("Edit"); 
				editButton.setBounds(117, 558, 254, 85);
				editButton.setFont(new java.awt.Font("Segoe UI",0,24));
				editButton.addActionListener(this);
			}
			{
				orderButton = new JButton();
				this.add(orderButton);
				orderButton.setText("Order");
				orderButton.setBounds(574, 558, 254, 85);
				orderButton.setFont(new java.awt.Font("Segoe UI",0,24));
				orderButton.addActionListener(this);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void actionPerformed(ActionEvent event)
	{
		if (event.getActionCommand().equals("Add")){	
			POSFrame.addpanel();
		}
		if (event.getActionCommand().equals("Delete")){	
			POSFrame.deletepanel();
		}
		if (event.getActionCommand().equals("Edit")){	
			POSFrame.editpanel();
		}
		if (event.getActionCommand().equals("Order")){	
			POSFrame.orderpanel();
		}
	}
}
