package Calc;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;

public class NumberField {

	private JLabel label = new JLabel();     // JLabel label = new JLabel(“Some text”); also possible
	
	NumberField(String text){
		this.label.setText(text);    // creates a label - text on the window
		this.label.setForeground(Color.WHITE);   // or create new Color(255, 80, 0), colors the background
		this.label.setBounds(0,50,310,100);
		this.label.setHorizontalAlignment(JLabel.RIGHT);
		this.label.setFont(new Font("Lucida Bright", Font.BOLD, 40));
	}
	
	public String getText() {
		
		return label.getText();
	}
	
	public void setText(String text) {
		this.label.setText(text);
		if(Main.nextNum) {
			//Main.firstNum
		}
	}
	
	public JLabel getLabel() {
		return this.label;
	}
}
