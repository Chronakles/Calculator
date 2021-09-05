package Calc;

import java.awt.Color; 
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

public class mathButton implements ActionListener {

	public JButton button;
	
	public static int width = 82;
	public static int height = 80;
	
	
	
	mathButton(String name, int x, int y, Color col, ArrayList<JButton> myButtons){
		
		button = new JButton(name);
		button.setBounds(x, y, width, height);
		button.setFont(new Font("Lucida Bright", Font.BOLD, 25));
		button.setForeground(new Color(0xced4da));
		button.setFocusable(false);
		button.setBackground(col);
		button.addActionListener(this);
		
		myButtons.add(this.button);
	}
	
	mathButton(String name, int x, int y, Color col, ArrayList<JButton> myButtons, int wid, int hei){
		
		button = new JButton(name);
		button.setBounds(x, y, wid, hei);
		button.setFont(new Font("Lucida Bright", Font.BOLD, 25));
		button.setForeground(new Color(0xced4da));
		button.setFocusable(false);
		button.setBackground(col);
		button.addActionListener(this);
		
		myButtons.add(button);
	}
	
	public JButton getButton() {
		return this.button;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
				
		if(e.getSource() == Main.buttonMal.getButton()) {
			Main.firstNum = Double.parseDouble(Main.result.getText());
			Main.method = "*";
			Main.nextNum = true;
			Main.canSetDot = true;
		}
		
		if(e.getSource() == Main.buttonMinus.getButton()) {
			Main.firstNum = Double.parseDouble(Main.result.getText());
			Main.method = "-";
			Main.nextNum = true;
			Main.canSetDot = true;
		}
		
		if(e.getSource() == Main.buttonDiv.getButton()) {
			Main.firstNum = Double.parseDouble(Main.result.getText());
			Main.method = "/";
			Main.nextNum = true;
			Main.canSetDot = true;
		}
		
		if(e.getSource()==Main.buttonClear.getButton()) {
			Main.result.setText("0");
			Main.nextNum = false;
			Main.canSetDot = true;
		}
		
		if(e.getSource() == Main.buttonPlus.getButton()) {
			Main.firstNum = Double.parseDouble(Main.result.getText());
			Main.method = "+";
			Main.nextNum = true;
			Main.canSetDot = true;
		}
		
		if(e.getSource() == Main.buttonComma.getButton()) {
			if(Main.canSetDot) {
				Main.result.setText(Main.result.getText() + ".");
				Main.canSetDot = false;
			}
		}
		
		if(e.getSource() == Main.buttonResult.getButton()) {
			Main.secondNum = Double.parseDouble(Main.result.getText());
			switch(Main.method) {
			case "+": 
				double result = Main.firstNum + Main.secondNum;
				
				if ((result == Math.floor(result)) && !Double.isInfinite(result)) {
					int help = (int)result;
					Main.result.setText(Integer.toString(help));
				}else {
					Main.result.setText(Double.toString(result));
				}
				Main.firstNum = result;
				Main.nextNum = true;
				Main.canSetDot = true;
				break;
				
			case "-": 
				double result1 = Main.firstNum - Main.secondNum;
				
				if ((result1 == Math.floor(result1)) && !Double.isInfinite(result1)) {
					int help = (int)result1;
					Main.result.setText(Integer.toString(help));
				}else {
					Main.result.setText(Double.toString(result1));
				}
				Main.firstNum = result1;
				Main.nextNum = true;
				Main.canSetDot = true;
				break;
				
			case "*": 
				double result2 = Main.firstNum * Main.secondNum;
				
				if ((result2 == Math.floor(result2)) && !Double.isInfinite(result2)) {
					int help = (int) result2;
					Main.result.setText(Integer.toString(help));
				}else {
					Main.result.setText(Double.toString(result2));
				}
				Main.firstNum = result2;
				Main.nextNum = true;
				Main.canSetDot = true;
				break;
				
			case "/": 
				double result3 = Main.firstNum / Main.secondNum;
				
				if ((result3 == Math.floor(result3)) && !Double.isInfinite(result3)) {
					int help = (int) result3;
					Main.result.setText(Integer.toString(help));
				}else {
					Main.result.setText(Double.toString(result3));
				}
				Main.firstNum = result3;
				Main.nextNum = true;
				Main.canSetDot = true;
				break;
			}
		}		
		
	};	
}
