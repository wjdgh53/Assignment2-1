package edu.nvcc.gui;


import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JPanel;

import javax.swing.JFrame;
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
public class POSFrame extends JFrame {
	private static JPanel mainPanel = new JPanel();

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		POSFrame pf = new POSFrame();
		pf.setVisible(true);
	}	
	
	POSFrame(){
		try {
		//	setExtendedState(MAXIMIZED_BOTH);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			{
				//setExtendedState(MAXIMIZED_BOTH);
				setDefaultCloseOperation(EXIT_ON_CLOSE);
				getContentPane().add(mainPanel);
				readpanel();
			}
			pack();
			
			this.setSize(1000, 800);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
		
	}
	static void readpanel() {
		mainPanel.removeAll();
		mainPanel.add(new ReadPanel());
		refresh(mainPanel);
	}
	static void mainpanel(){
		mainPanel.removeAll();
		mainPanel.add(new MainPanel());
		refresh(mainPanel);
	}
	static void addpanel(){
		mainPanel.removeAll();
		mainPanel.add(new AddPanel());
		refresh(mainPanel);
	}
	static void deletepanel(){
		mainPanel.removeAll();
		mainPanel.add(new DeletePanel());
		refresh(mainPanel);
	}
	static void editpanel(){
		mainPanel.removeAll();
		mainPanel.add(new EditPanel());
		refresh(mainPanel);
	}
	static void orderpanel(){
		mainPanel.removeAll();
		mainPanel.add(new OrderPanel());
		refresh(mainPanel);
	}
	static void refresh(Container contentPane){
		contentPane.setVisible(false);
		contentPane.setVisible(true);
	}
}
