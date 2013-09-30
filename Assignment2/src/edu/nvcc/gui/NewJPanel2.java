package edu.nvcc.gui;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

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
public class NewJPanel2 extends javax.swing.JPanel  {
	private JButton jButton1;
	private JButton jButton2;

	/**
	* Auto-generated main method to display this 
	* JPanel inside a new JFrame.
	*/
		
	public NewJPanel2() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			setPreferredSize(new Dimension(400, 300));
			{
				jButton1 = new JButton();
				this.add(jButton1);
				jButton1.setText("jButton1");
				jButton1.addActionListener((ActionListener) this);
				jButton2.addActionListener((ActionListener) this);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		jButton1.addActionListener(this);
	
		jButton2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				new AddFrame();
				setVisible(false);
				}
		});
		
	}
}
	