package Calc;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.UIManager;

public class Button implements ActionListener {
	
	public JButton button;
	
	private int width = 82;
	private int height = 80;
	private Color col;
	private double number;
	
	Button(String name, int x, int y, Color col, ArrayList<JButton> myButtons){
		
		button = new JButton(name);
		button.setBounds(x, y, width, height);
		button.setFont(new Font("Lucida Bright", Font.BOLD, 25));
		button.setForeground(new Color(0xced4da));
		button.setFocusable(false);
		button.setBackground(col);
		button.addActionListener(this);
		
		this.number = Double.parseDouble(name);
		
		myButtons.add(button);
	}

	//@SuppressWarnings("deprecation")
	@Override
	public void actionPerformed(ActionEvent e) {
		//String text = Main.result.getText();
		Main.result.setText(Double.toString(number));
		/*if(Main.firstNum == 0) {
			Main.firstNum = Integer.parseInt(button.getText().toString());
		}else {
			Main.secondNum = Integer.parseInt(button.getText().toString());
		}
		if(Main.nextNum == false) {
			Main.result.setText(button.getText().toString());
			Main.nextNum = true;
		}else {
			String help = Main.result.getText() + button.getText().toString();
			Main.result.setText(help);
		}*/
		
	};
	
	
	public void mouseEntered(java.awt.event.MouseEvent evt) {
		this.button.setBackground(new Color(0x6c757d));
	}

	public void mouseExited(java.awt.event.MouseEvent evt) {
	    this.button.setBackground(this.col);
	}
	
	
	
	

}
