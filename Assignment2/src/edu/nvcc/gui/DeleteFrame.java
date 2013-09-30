package edu.nvcc.gui;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import javax.swing.WindowConstants;
import javax.swing.SwingUtilities;


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
public  class DeleteFrame extends JFrame implements ActionListener{
	private JLabel addLabel;
	private JLabel priceLabel;
	private JButton searchButton;
	private JButton confirmButton;
	private JButton sofalseButton;
	private JButton sotrueButton;
	private JTextField sizeField;
	private JTextField descriptionField;
	private JTextField quantityField;
	private JTextField priceField;
	private JTextField nameField;
	private JLabel specialorderLabel;
	private JLabel sizeLabel;
	private JLabel descriptionLabel;
	private JLabel quantitylabel;
	private JLabel nameLabel;

	/**
	* Auto-generated main method to display this JFrame
	*/
		
	public DeleteFrame() {
		super();
		initGUI();
		setVisible(true);
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			{
				addLabel = new JLabel();
				getContentPane().add(addLabel);
				addLabel.setText("Delete Food Item");
				addLabel.setBounds(206, 12, 239, 44);
				addLabel.setFont(new java.awt.Font("Segoe UI",0,28));
			}
			{
				nameLabel = new JLabel();
				getContentPane().add(nameLabel);
				nameLabel.setText("Name :");
				nameLabel.setBounds(118, 90, 78, 29);
				nameLabel.setFont(new java.awt.Font("Segoe UI",0,16));
			}
			{
				priceLabel = new JLabel();
				getContentPane().add(priceLabel);
				priceLabel.setText("Price :");
				priceLabel.setBounds(118, 120, 78, 25);
				priceLabel.setFont(new java.awt.Font("Segoe UI",0,16));
			}
			{
				quantitylabel = new JLabel();
				getContentPane().add(quantitylabel);
				quantitylabel.setText("Quantity :");
				quantitylabel.setBounds(118, 151, 78, 21);
				quantitylabel.setFont(new java.awt.Font("Segoe UI",0,16));
			}
			{
				descriptionLabel = new JLabel();
				getContentPane().add(descriptionLabel);
				descriptionLabel.setText("Description :");
				descriptionLabel.setBounds(118, 184, 103, 22);
				descriptionLabel.setFont(new java.awt.Font("Segoe UI",0,16));
			}
			{
				sizeLabel = new JLabel();
				getContentPane().add(sizeLabel);
				sizeLabel.setText("Size :");
				sizeLabel.setBounds(118, 212, 78, 26);
				sizeLabel.setFont(new java.awt.Font("Segoe UI",0,16));
			}
			{
				specialorderLabel = new JLabel();
				getContentPane().add(specialorderLabel);
				specialorderLabel.setText("Special Order :");
				specialorderLabel.setBounds(118, 244, 114, 24);
				specialorderLabel.setFont(new java.awt.Font("Segoe UI",0,16));
			}
			{
				nameField = new JTextField();
				getContentPane().add(getNameField());
				nameField.setBounds(326, 85, 156, 25);
			}
			{
				priceField = new JTextField();
				getContentPane().add(priceField);
				priceField.setBounds(326, 123, 156, 23);
			}
			{
				quantityField = new JTextField();
				getContentPane().add(getQuantityField());
				quantityField.setBounds(326, 158, 156, 23);
			}
			{
				descriptionField = new JTextField();
				getContentPane().add(descriptionField);
				descriptionField.setBounds(326, 193, 156, 20);
			}
			{
				sizeField = new JTextField();
				getContentPane().add(getSizeField());
				sizeField.setBounds(326, 225, 156, 19);
			}
			{
				sotrueButton = new JButton();
				getContentPane().add(sotrueButton);
				sotrueButton.setText("True");
				sotrueButton.setBounds(326, 256, 63, 32);
			}
			{
				sofalseButton = new JButton();
				getContentPane().add(sofalseButton);
				sofalseButton.setText("False");
				sofalseButton.setBounds(414, 256, 62, 32);
			}
			{
				confirmButton = new JButton();
				getContentPane().add(confirmButton);
				confirmButton.setText("Done");
				confirmButton.setBounds(476, 315, 82, 34);
			}
			{
				searchButton = new JButton();
				getContentPane().add(searchButton);
				searchButton.setText("search");
				searchButton.setBounds(499, 86, 48, 23);
			}
			pack();
			this.setSize(617, 407);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}
	
	public JTextField getNameField() {
		return nameField;
	}
	
	public JTextField getQuantityField() {
		return quantityField;
	}
	
	public JTextField getSizeField() {
		return sizeField;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}