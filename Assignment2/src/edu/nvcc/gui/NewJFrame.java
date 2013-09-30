package edu.nvcc.gui;
import java.awt.BorderLayout;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.LayoutStyle;

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
public class NewJFrame extends javax.swing.JFrame {
	private JPanel jPanel1;
	private JButton jButton1;
	private JPanel jPanel2;
	private JLabel jLabel1;

	/**
	* Auto-generated main method to display this JFrame
	*/
		
	public NewJFrame() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			{
				jPanel2 = new JPanel();
				getContentPane().add(jPanel2);
				{
					jButton1 = new JButton();
					jPanel2.add(jButton1);
					jButton1.setText("jButton1");
				}
				jPanel2.setVisible(false);
			}
			{
				jPanel1 = new JPanel();
				getContentPane().add(jPanel1, BorderLayout.CENTER);
				jPanel1.setLayout(null);
				{
					jLabel1 = new JLabel();
					jPanel1.add(jLabel1);
					jLabel1.setText("jLabel1");
					jLabel1.setBounds(256, 5, 37, 16);
				}
			}
			pack();
			this.setSize(566, 385);
			new NewJPanel();
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}

}
