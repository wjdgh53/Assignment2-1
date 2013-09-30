package edu.nvcc.gui;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

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
public  class MainFrame extends JFrame implements ActionListener{
	private JLabel titleLabel;
	private JButton orderButton;
	private JButton editButton;
	private JButton deleteButton;
	private JButton addButton;

	/**
	 * Auto-generated main method to display this JFrame
	 */


	public MainFrame() {
		super();
		initGUI();
		setVisible(true);
		//setSize(100,100);

	}

	private void initGUI() 
	{
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			{
				titleLabel = new JLabel();
				getContentPane().add(titleLabel);
				titleLabel.setText("POS");
				titleLabel.setBounds(225, 12, 57, 56);
				titleLabel.setFont(new java.awt.Font("Segoe UI",0,28));
			}
			{
				addButton = new JButton();
				getContentPane().add(addButton);
				addButton.setText("Add");
				addButton.setBounds(75, 180, 150, 50);
				addButton.addActionListener(this);
				
			}
			{
				deleteButton = new JButton();
				getContentPane().add(deleteButton);
				deleteButton.setText("Delete");
				deleteButton.setBounds(282, 180, 150, 50);
			}
			{
				editButton = new JButton();
				getContentPane().add(editButton);
				editButton.setText("Edit");
				editButton.setBounds(75, 295, 150, 50);
			}
			{
				orderButton = new JButton();
				getContentPane().add(orderButton);
				orderButton.setText("Order");
				orderButton.setBounds(282, 295, 150, 50);
				orderButton.addActionListener(this);
			}
			pack();
			this.setSize(549, 448);
		} catch (Exception e) {
			//add your error handling code here
			e.printStackTrace();
		}
	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		addButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				new AddFrame();
				setVisible(false);
				}
		});
		
	}
}

