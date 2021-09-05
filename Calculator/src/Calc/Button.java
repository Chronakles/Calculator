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
	private String number;
	
	Button(String name, int x, int y, Color col, ArrayList<JButton> myButtons){
		
		button = new JButton(name);
		button.setBounds(x, y, width, height);
		button.setFont(new Font("Lucida Bright", Font.BOLD, 25));
		button.setForeground(new Color(0xced4da));
		button.setFocusable(false);
		button.setBackground(col);
		button.addActionListener(this);
		this.number = name;
		
		myButtons.add(button);
	}

	//@SuppressWarnings("deprecation")
	@Override
	public void actionPerformed(ActionEvent e) {
		//String text = Main.result.getText();
		if(Main.result.getText().equals("0") || Main.nextNum) {
			Main.result.setText(this.number);
			Main.nextNum = false;
		}else {
			Main.result.setText(Main.result.getText() + this.number);
		}
		
	};
	
	
	public void mouseEntered(java.awt.event.MouseEvent evt) {
		this.button.setBackground(new Color(0x6c757d));
	}

	public void mouseExited(java.awt.event.MouseEvent evt) {
	    this.button.setBackground(this.col);
	}
	
	
	
	

}
