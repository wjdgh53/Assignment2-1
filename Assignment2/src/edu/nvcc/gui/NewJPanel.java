package edu.nvcc.gui;

import java.awt.Dimension;
import javax.swing.JButton;

import javax.swing.WindowConstants;
import javax.swing.JFrame;
import javax.swing.JLabel;


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
public class NewJPanel extends javax.swing.JPanel {
	private JLabel jLabel1;
	private JButton jButton1;

	/**
	* Auto-generated main method to display this 
	* JPanel inside a new JFrame.
	*/
		
	public NewJPanel() {
		super();
		initGUI();
		setVisible(true);
	}
	
	private void initGUI() {
		try {
			setPreferredSize(new Dimension(400, 300));
			{
				jLabel1 = new JLabel();
				this.add(jLabel1);
				jLabel1.setText("jLabel1");
			}
			{
				jButton1 = new JButton();
				this.add(jButton1);
				jButton1.setText("jButton1");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
