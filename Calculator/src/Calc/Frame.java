package Calc;

import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Frame {

	public JFrame frame;
	
	Frame(int width, int height, Color background, String title){
		this.frame = new JFrame();
		
		frame.setSize(width, height); //340 width and 540 height
		frame.setLayout(null); //using no layout managers
		frame.setLocationRelativeTo(null); //put the window in the middle of screen
		frame.setTitle(title); //gives the Window a title
		frame.getContentPane().setBackground(background); //changes color of background
		frame.setResizable(false); //prevents frame from being resized
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //actually closes the window
		//frame.setVisible(true); //making the frame visible
		
		ImageIcon image = new ImageIcon("calculator.png"); // Creates an image icon
		frame.setIconImage(image.getImage()); // changes the icon of the window
	}
	
	public void addButtons(ArrayList<JButton> myButtons) {
		for(int i = 0; i < myButtons.size(); i++) {
			this.frame.add(myButtons.get(i));
		}
	}
	public void addButton(JButton myButton) {
		this.frame.add(myButton);
	}
	
	
	public void addLabels(ArrayList<JLabel> myLabels) {
		for(int i = 0; i < myLabels.size(); i++) {
			this.frame.add(myLabels.get(i));
		}
	}
	public void addLabel(JLabel myLabel) {
		this.frame.add(myLabel);
	}
	
	
	public void addTextField(JTextField myText) {
		this.frame.add(myText);
	}
	
	
	public void makeVisible() { 
		this.frame.setVisible(true); //making the frame visible
	}
}
