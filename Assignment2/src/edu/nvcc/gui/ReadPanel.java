package edu.nvcc.gui;

import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.*;

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
public class ReadPanel extends JPanel implements ActionListener{
	JButton openButton;
	final JFileChooser fc = new JFileChooser();
	static ReadExcel restaurant = null;
	int returnVal;
	/**
	* Auto-generated main method to display this 
	* JPanel inside a new JFrame.
	*/
		
	ReadPanel(){
		try {
			this.setPreferredSize(new java.awt.Dimension(1000, 800));
			{
				openButton = new JButton("Browse");	
				this.add(openButton);
				openButton.setLayout(null);
				openButton.setSize(new java.awt.Dimension(138, 48));
				//openButton.setPreferredSize(new java.awt.Dimension(358, 265));
				openButton.addActionListener(this);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void actionPerformed(ActionEvent event)
	{
		returnVal = fc.showOpenDialog(null);
		System.out.println(returnVal);
		if (returnVal == JFileChooser.APPROVE_OPTION) {
			   File selectedFile = fc.getSelectedFile();
			   String path = selectedFile.getAbsolutePath();
			   System.out.println(path);
			   POSFrame.mainpanel();
			   try {
				restaurant = new ReadExcel(path);
				
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
				
				
			
		}
			
	}
	
}
