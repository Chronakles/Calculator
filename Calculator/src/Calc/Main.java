package Calc;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

public class Main {
	
	public static double[] firstNum =  {50};
	public static double[] secondNum = {50};
	
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
	
	public static Color buttonBackground = new Color(0x212529);
	public static Color resultBackground = new Color(0x3d5a80);
	public static Color calcBackground = new Color(0x495057);
	
	public static Color frameBackground = new Color(0x343a40);
	public static int frameWidth = 340;
	public static int frameHeight = 540;
	public static String frameTitle = "Calculator";
	
	public static NumberField result = new NumberField("0");
	

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
		Button button00 = new Button("0", secondColoum, forthRow, buttonBackground, myButtons);
		Button button01 = new Button("1", firstColoum, firstRow, buttonBackground, myButtons);
		Button button02 = new Button("2", secondColoum, firstRow, buttonBackground, myButtons);
		Button button03 = new Button("3", thirdColoum, firstRow, buttonBackground, myButtons);
		Button button04 = new Button("4", firstColoum, secondRow, buttonBackground, myButtons);
		Button button05 = new Button("5", secondColoum, secondRow, buttonBackground, myButtons);
		Button button06 = new Button("6", thirdColoum, secondRow, buttonBackground, myButtons);
		Button button07 = new Button("7", firstColoum, thirdRow, buttonBackground, myButtons);
		Button button08 = new Button("8", secondColoum, thirdRow, buttonBackground, myButtons);
		Button button09 = new Button("9", thirdColoum, thirdRow, buttonBackground, myButtons);
		ResultButton buttonResult = new ResultButton("=", forthColoum, forthRow, resultBackground, myButtons);
		mathButton buttonMinus = new mathButton("-", forthColoum, secondRow, calcBackground, myButtons);
		mathButton buttonMal = new mathButton("x", forthColoum, thirdRow, calcBackground, myButtons);
		mathButton buttonDiv = new mathButton("/", firstColoum, forthRow, calcBackground, myButtons);
		mathButton buttonPlus = new mathButton("+", forthColoum, firstRow, calcBackground, myButtons);
		mathButton buttonClear = new mathButton("C", thirdColoum, forthRow, calcBackground, myButtons);
				
		
		//create text field
		
		
		
		//adding everything to JFrame
		frame.addButtons(myButtons);
		frame.addLabel(label);
		frame.addLabel(result.getLabel());
		frame.makeVisible();
		
		
		
		
		
		/*button01.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(firstNum == 0) {
					firstNum = Integer.parseInt(button01.getLabel().toString());
				}else {
					secondNum = Integer.parseInt(button01.getLabel().toString());
				}
				if(nextNum == false) {
					numbers.setText(button01.getLabel().toString());
					nextNum = true;
				}else {
					String help = numbers.getText() + button01.getLabel().toString();
					numbers.setText(help);
				}
			}
		});
		button02.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(firstNum == 0) {
					firstNum = Integer.parseInt(button02.getLabel().toString());
				}else {
					secondNum = Integer.parseInt(button02.getLabel().toString());
				}
				if(nextNum == false) {
					numbers.setText(button02.getLabel().toString());
					nextNum = true;
				}else {
					String help = numbers.getText() + button02.getLabel().toString();
					numbers.setText(help);
				}
					
			}
		});
		button03.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(firstNum == 0) {
					firstNum = Integer.parseInt(button03.getLabel().toString());
				}else {
					secondNum = Integer.parseInt(button03.getLabel().toString());
				}
				if(nextNum == false) {
					numbers.setText(button03.getLabel().toString());
					nextNum = true;
				}else {
					String help = numbers.getText() + button03.getLabel().toString();
					numbers.setText(help);
				}
			}
		});
		button04.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(firstNum == 0) {
					firstNum = Integer.parseInt(button04.getLabel().toString());
				}else {
					secondNum = Integer.parseInt(button04.getLabel().toString());
				}
				if(nextNum == false) {
					numbers.setText(button04.getLabel().toString());
					nextNum = true;
				}else {
					String help = numbers.getText() + button04.getLabel().toString();
					numbers.setText(help);
				}
			}
		});
		button05.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(firstNum == 0) {
					firstNum = Integer.parseInt(button05.getLabel().toString());
				}else {
					secondNum = Integer.parseInt(button05.getLabel().toString());
				}
				if(nextNum == false) {
					numbers.setText(button05.getLabel().toString());
					nextNum = true;
				}else {
					String help = numbers.getText() + button05.getLabel().toString();
					numbers.setText(help);
				}
			}
		});
		button06.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(firstNum == 0) {
					firstNum = Integer.parseInt(button06.getLabel().toString());
				}else {
					secondNum = Integer.parseInt(button06.getLabel().toString());
				}
				if(nextNum == false) {
					numbers.setText(button06.getLabel().toString());
					nextNum = true;
				}else {
					String help = numbers.getText() + button06.getLabel().toString();
					numbers.setText(help);
				}
			}
		});
		button07.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(firstNum == 0) {
					firstNum = Integer.parseInt(button07.getLabel().toString());
				}else {
					secondNum = Integer.parseInt(button07.getLabel().toString());
				}
				if(nextNum == false) {
					numbers.setText(button07.getLabel().toString());
					nextNum = true;
				}else {
					String help = numbers.getText() + button07.getLabel().toString();
					numbers.setText(help);
				}
			}
		});
		button08.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(firstNum == 0) {
					firstNum = Integer.parseInt(button08.getLabel().toString());
				}else {
					secondNum = Integer.parseInt(button08.getLabel().toString());
				}
				if(nextNum == false) {
					numbers.setText(button08.getLabel().toString());
					nextNum = true;
				}else {
					String help = numbers.getText() + button08.getLabel().toString();
					numbers.setText(help);
				}
			}
		});
		button09.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(firstNum == 0) {
					firstNum = Integer.parseInt(button09.getLabel().toString());
				}else {
					secondNum = Integer.parseInt(button09.getLabel().toString());
				}
				if(nextNum == false) {
					numbers.setText(button09.getLabel().toString());
					nextNum = true;
				}else {
					String help = numbers.getText() + button09.getLabel().toString();
					numbers.setText(help);
				}
			}
		});
		button00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(firstNum == 0) {
					firstNum = Integer.parseInt(button00.getLabel().toString());
				}else {
					secondNum = Integer.parseInt(button00.getLabel().toString());
				}
				if(nextNum == false) {
					numbers.setText(button00.getLabel().toString());
					nextNum = true;
				}else {
					String help = numbers.getText() + button00.getLabel().toString();
					numbers.setText(help);
				}
			}
		});
		
		buttonPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				String help = numbers.getText() + "+";
				numbers.setText(help);
				method = "+";
				
			}
		});
		buttonMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				String help = numbers.getText() + "-";
				numbers.setText(help);
				method = "-";
				
			}
		});
		buttonMal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				String help = numbers.getText() + "*";
				numbers.setText(help);
				method = "*";
				
			}
		});
		buttonDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				String help = numbers.getText() + "/";
				numbers.setText(help);
				
				method = "/";
				
			}
		});
		
		buttonResult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(method == "+") {
					double result = firstNum + secondNum;
					numbers.setText(Double.toString(result));
					firstNum = result;
				}else if(method == "-") {
					double result = firstNum - secondNum;
					numbers.setText(Double.toString(result));
					firstNum = result;
				}else if(method == "/") {
					double result = firstNum / secondNum;
					numbers.setText(Double.toString(result));
					firstNum = result;
				}else if(method == "*") {
					double result = firstNum * secondNum;
					numbers.setText(Double.toString(result));
					firstNum = result;
				}

				
			}
		});*/
		
	}
	

}
