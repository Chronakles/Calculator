package Calc;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;

public class CalcButton implements ActionListener {

public JButton button;
	
	public static int width = 82;
	public static int height = 80;
	
	CalcButton(String name, int x, int y, Color col, ArrayList<JButton> myButtons){
		
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
	
}
