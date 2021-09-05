package Calc;


import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

public class Main {
	
	public static double firstNum =  0;
	public static double secondNum = 0;
	public static String resultNum = "";
	public static boolean canSetDot = true;
	
	public static String method = null;
	public static boolean nextNum = false;
	
	public static final int firstColoum = 0;
	public static final int firstRow = 160;
	public static final int secondColoum = 82;
	public static final int secondRow = 240;
	public static final int thirdColoum = 164;
	public static final int thirdRow = 320;
	public static final int forthColoum = 246;
	public static final int forthRow = 400;
	public static final int clearX = 210;
	public static final int clearY = 20;
	
	public static Color buttonBackground = new Color(0x212529);
	public static Color resultBackground = new Color(0x3d5a80);
	public static Color calcBackground = new Color(0x495057);
	
	public static Color frameBackground = new Color(0x343a40);
	public static int frameWidth = 340;
	public static int frameHeight = 540;
	public static String frameTitle = "Calculator";
	
	public static NumberField result = new NumberField("0");
	
	
	public static Button button00, button01, button02, button03,
	button04, button05, button06, button07, button08, button09;
	
	public static mathButton buttonMinus, buttonMal, buttonDiv, buttonPlus, buttonClear, buttonResult, buttonComma;
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<JButton> myButtons = new ArrayList<>();
		
		JLabel label = new JLabel();     // JLabel label = new JLabel(“Some text”); also possible
		label.setText("© Nikola Bicanic");    // creates a label - text on the window
		label.setForeground(Color.gray);   // or create new Color(255, 80, 0), colors the background
		label.setBounds(125, 480, 100, 20);
		
		
		
		//create instance of JFrame
		Frame frame = new Frame(frameWidth, frameHeight, frameBackground, frameTitle);
		
		
		//create instance of JButton
		button00 = new Button("0", secondColoum, forthRow, buttonBackground, myButtons);
		button01 = new Button("1", firstColoum, firstRow, buttonBackground, myButtons);
		button02 = new Button("2", secondColoum, firstRow, buttonBackground, myButtons);
		button03 = new Button("3", thirdColoum, firstRow, buttonBackground, myButtons);
		button04 = new Button("4", firstColoum, secondRow, buttonBackground, myButtons);
		button05 = new Button("5", secondColoum, secondRow, buttonBackground, myButtons);
		button06 = new Button("6", thirdColoum, secondRow, buttonBackground, myButtons);
		button07 = new Button("7", firstColoum, thirdRow, buttonBackground, myButtons);
		button08 = new Button("8", secondColoum, thirdRow, buttonBackground, myButtons);
		button09 = new Button("9", thirdColoum, thirdRow, buttonBackground, myButtons);
		buttonResult = new mathButton("=", forthColoum, forthRow, resultBackground, myButtons);
		buttonMinus = new mathButton("-", forthColoum, secondRow, calcBackground, myButtons);
		buttonMal = new mathButton("x", forthColoum, thirdRow, calcBackground, myButtons);
		buttonDiv = new mathButton("/", firstColoum, forthRow, calcBackground, myButtons);
		buttonPlus = new mathButton("+", forthColoum, firstRow, calcBackground, myButtons);
		buttonClear = new mathButton("Clear", clearX, clearY, calcBackground, myButtons, 100, 40);
		buttonComma = new mathButton(".", thirdColoum, forthRow, calcBackground, myButtons);
		
		
		//adding everything to JFrame
		frame.addButtons(myButtons);
		frame.addLabel(label);
		frame.addLabel(result.getLabel());
		frame.makeVisible();
		
		
	}
	

}
