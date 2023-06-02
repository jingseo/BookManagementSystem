package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class BookAdder extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4536848227844096329L;
	
	public void Adder() {
		
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		
		JLabel labelID = new JLabel("ID: ", JLabel.TRAILING);
		JTextField fieldID = new JTextField(10);
		labelID.setLabelFor(fieldID);
		panel.add(labelID);
		panel.add(fieldID);
		
		JLabel labelName = new JLabel("Name: ", JLabel.TRAILING);
		JTextField fieldName = new JTextField(10);
		labelName.setLabelFor(fieldName);
		panel.add(labelName);
		panel.add(fieldName);
		
		JLabel labelWriter = new JLabel("Writer: ", JLabel.TRAILING);
		JTextField fieldWriter = new JTextField(10);
		labelWriter.setLabelFor(fieldWriter);
		panel.add(labelWriter);
		panel.add(fieldWriter);
		
		JLabel labelPage = new JLabel("Page: ", JLabel.TRAILING);
		JTextField fieldPage = new JTextField(10);
		labelPage.setLabelFor(fieldPage);
		panel.add(labelPage);
		panel.add(fieldPage);
		
		panel.add(new JButton("save"));
		panel.add(new JButton("cancel"));
		
		SpringUtilities.makeCompactGrid(panel, 5, 2, 6, 6, 6, 6);
		
		this.setSize(300,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setContentPane(panel);
		this.setVisible(true);
	}

}
