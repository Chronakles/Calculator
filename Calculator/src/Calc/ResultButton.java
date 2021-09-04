package Calc;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;

public class ResultButton implements ActionListener {

	
	public JButton button;
	
	public static int width = 82;
	public static int height = 80;
	
	ResultButton(String name, int x, int y, Color col, ArrayList<JButton> myButtons){
		
		button = new JButton(name);
		button.setBounds(x, y, width, height);
		button.setFont(new Font("Lucida Bright", Font.BOLD, 25));
		button.setForeground(new Color(0xced4da));
		button.setFocusable(false);
		button.setBackground(col);
		
		myButtons.add(button);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
			
			/*if(Main.method == "+") {
				double result = Main.firstNum + Main.secondNum;
				Main.result.setText(Double.toString(result));
				Main.firstNum = result;
			}else if(Main.method == "-") {
				double result = Main.firstNum - Main.secondNum;
				Main.result.setText(Double.toString(result));
				Main.firstNum = result;
			}else if(Main.method == "/") {
				double result = Main.firstNum / Main.secondNum;
				Main.result.setText(Double.toString(result));
				Main.firstNum = result;
			}else if(Main.method == "*") {
				double result = Main.firstNum * Main.secondNum;
				Main.result.setText(Double.toString(result));
				Main.firstNum = result;
			}*/

			
		
		
	};
}
