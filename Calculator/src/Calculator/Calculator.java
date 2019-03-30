/* Author: Ajjuthan Sarvananthan */
package Calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.ComponentOrientation;
import java.awt.Color;

public class Calculator {

	private JFrame frame;
	private JTextField txtDisplay;
	private JButton btnbackspace;
	private JButton btnModulus;
	private JButton btnPlus;
	private JButton btnMinus;
	private JButton btn9;
	private JButton btn8;
	private JButton btn7;
	private JButton multi;
	private JButton btn6;
	private JButton btn5;
	private JButton btn4;
	private JButton btnDivide;
	private JButton btn3;
	private JButton btn2;
	private JButton btn1;
	private JButton btnDot;
	private JButton btn0;
	private JButton btnPM;
	private JButton btnEqual;

	/**
	 * Launch the application.
	 */
	double firstnum;
	double secondnum;
	double result;
	String operations;
	String answer;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(135, 206, 250));
		frame.setBounds(100, 100, 419, 439);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtDisplay = new JTextField();
		txtDisplay.setBounds(36, 19, 355, 92);
		frame.getContentPane().add(txtDisplay);
		txtDisplay.setColumns(10);
		//---------ROW1------------------------------ 
		
		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDisplay.setText(null);
				
			}
		});
		btnClear.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		btnClear.setBounds(44, 123, 75, 44);
		frame.getContentPane().add(btnClear);
		
		btnbackspace = new JButton("\uF0E7");
		btnbackspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtDisplay.getText().length()>0)
				{
					String backspace =null;
					StringBuilder strB = new StringBuilder(txtDisplay.getText());
					strB.deleteCharAt(txtDisplay.getText().length()-1);
					backspace =strB.toString();
					txtDisplay.setText(backspace);
				}
			}
		});
		btnbackspace.setFont(new Font("Wingdings", Font.PLAIN, 20));
		btnbackspace.setBounds(131, 123, 75, 44);
		frame.getContentPane().add(btnbackspace);
		
		btnModulus = new JButton("%");
		btnModulus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "%";
			}
		});
		btnModulus.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		btnModulus.setBounds(218, 123, 75, 44);
		frame.getContentPane().add(btnModulus);
		
		btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "+";
			}
		});
		btnPlus.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		btnPlus.setBounds(305, 123, 75, 44);
		frame.getContentPane().add(btnPlus);
		//---------ROW2------------------------------ 
	
		btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterValue= txtDisplay.getText() + btn7.getText();
				txtDisplay.setText(EnterValue);
			}
		});
		btn7.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		btn7.setBounds(44, 179, 75, 44);
		frame.getContentPane().add(btn7);
		
		btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterValue= txtDisplay.getText() + btn8.getText();
				txtDisplay.setText(EnterValue);
			}
		});
		btn8.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		btn8.setBounds(131, 179, 75, 44);
		frame.getContentPane().add(btn8);
		
		btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterValue= txtDisplay.getText() + btn9.getText();
				txtDisplay.setText(EnterValue);
			}
		});
		btn9.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		btn9.setBounds(218, 179, 75, 44);
		frame.getContentPane().add(btn9);
		
		btnMinus = new JButton("-");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "-";
			}
		});
		btnMinus.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		btnMinus.setBounds(305, 179, 75, 44);
		frame.getContentPane().add(btnMinus);
		//---------ROW3----------------------------- 

		multi = new JButton("X");
		multi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "X";
			}
		});
		multi.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		multi.setBounds(305, 241, 75, 44);
		frame.getContentPane().add(multi);
		
		btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterValue= txtDisplay.getText() + btn6.getText();
				txtDisplay.setText(EnterValue);
			}
		});
		btn6.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		btn6.setBounds(218, 241, 75, 44);
		frame.getContentPane().add(btn6);
		
		btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterValue= txtDisplay.getText() + btn5.getText();
				txtDisplay.setText(EnterValue);
			}
		});
		btn5.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		btn5.setBounds(131, 241, 75, 44);
		frame.getContentPane().add(btn5);
		//---------ROW4----------------------------- 

		btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterValue= txtDisplay.getText() + btn4.getText();
				txtDisplay.setText(EnterValue);
			}
		});
		btn4.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		btn4.setBounds(44, 241, 75, 44);
		frame.getContentPane().add(btn4);
		
		btnDivide = new JButton("/");
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(txtDisplay.getText()); txtDisplay.setText("");
				operations = "/";

			}
		});
		btnDivide.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		btnDivide.setBounds(305, 297, 75, 44);
		frame.getContentPane().add(btnDivide);
		
		btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterValue= txtDisplay.getText() + btn3.getText();
				txtDisplay.setText(EnterValue);
			}
		});
		btn3.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		btn3.setBounds(218, 297, 75, 44);
		frame.getContentPane().add(btn3);
		
		btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterValue= txtDisplay.getText() + btn2.getText();
				txtDisplay.setText(EnterValue);
			}
		});
		btn2.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		btn2.setBounds(131, 297, 75, 44);
		frame.getContentPane().add(btn2);
		
		btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterValue= txtDisplay.getText() + btn1.getText();
				txtDisplay.setText(EnterValue);
			}
		});
		btn1.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		btn1.setBounds(44, 297, 75, 44);
		frame.getContentPane().add(btn1);
		//---------ROW5----------------------------- 

		btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterValue= txtDisplay.getText() + btnDot.getText();
				txtDisplay.setText(EnterValue);
			}
		});
		btnDot.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		btnDot.setBounds(131, 353, 75, 44);
		frame.getContentPane().add(btnDot);
		
		btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterValue= txtDisplay.getText() + btn0.getText();
				txtDisplay.setText(EnterValue);
			}
		});
		btn0.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		btn0.setBounds(44, 353, 75, 44);
		frame.getContentPane().add(btn0);
		
		btnPM = new JButton("\u00B1");
		btnPM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double plusminus =Double.parseDouble(String.valueOf(txtDisplay.getText()));
				plusminus = plusminus *(-1);
				txtDisplay.setText(String.valueOf(plusminus));
			}
		});
		btnPM.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		btnPM.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		btnPM.setBounds(218, 353, 75, 44);
		frame.getContentPane().add(btnPM);
		
		btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
		
			secondnum = Double.parseDouble(txtDisplay.getText());
				if(operations =="+" )
				{
					result =  firstnum + secondnum;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
					}
				else if(operations =="-")
				{
					result = firstnum - secondnum;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
				}
				else if (operations == "X")
				{
					result = firstnum * secondnum;
					answer =String.format("%.2f",result);
					txtDisplay.setText(answer);
			
				}
				else if (operations == "/")
				{
					result = firstnum / secondnum;
					answer = String.format("%.2f",result);
					txtDisplay.setText(answer);
				}
				else if (operations == "%")
				{
					result = firstnum % secondnum;
					answer = String.format("%.2f",result);					
					txtDisplay.setText(answer);
						
				}	
					
			}
			
			
		});
		btnEqual.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		btnEqual.setBounds(305, 353, 75, 44);
		frame.getContentPane().add(btnEqual);
		

	}
}
