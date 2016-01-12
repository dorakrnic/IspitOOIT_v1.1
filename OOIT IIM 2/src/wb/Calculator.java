package wb;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.EventQueue;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



public class Calculator extends JFrame {
	private JTextField textField;
	double broj;
	int operacija;
	double ulaz;
	public Calculator() {
		setTitle("Calculator");
		getContentPane().setLayout(null);

		textField = new JTextField();
		textField.setBounds(41, 26, 420, 40);
		getContentPane().add(textField);
		textField.setColumns(10);

		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("1");
				broj = 1;
			}
		});
		btn1.setBounds(41, 75, 90, 40);
		getContentPane().add(btn1);

		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				textField.setText("2");
				broj = 2;
			}
		});
		btn2.setBounds(141, 75, 90, 40);
		getContentPane().add(btn2);

		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				textField.setText("3");
				broj = 3;
			}
		});
		btn3.setBounds(241, 75, 90, 40);
		getContentPane().add(btn3);

		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ulaz = Integer.parseInt(textField.getText()); 
				operacija = 1;
			}
		});
		btnPlus.setBounds(371, 77, 90, 40);
		getContentPane().add(btnPlus);

		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				textField.setText("4");
				broj = 4;
			}
		});
		btn4.setBounds(41, 126, 90, 40);
		getContentPane().add(btn4);

		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				textField.setText("5");
				broj = 5;
			}
		});
		btn5.setBounds(141, 126, 90, 40);
		getContentPane().add(btn5);

		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("6");
				broj = 6;
			}
		});
		btn6.setBounds(241, 126, 90, 40);
		getContentPane().add(btn6);

		JButton btnMinus = new JButton("-");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				ulaz = Integer.parseInt(textField.getText()); 
				operacija = 2;
			}
		});
		btnMinus.setBounds(371, 128, 90, 40);
		getContentPane().add(btnMinus);

		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("7");
				broj = 7;
			}
		});
		btn7.setBounds(41, 177, 90, 40);
		getContentPane().add(btn7);

		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("8");
				broj = 8;
			}
		});
		btn8.setBounds(141, 177, 90, 40);
		getContentPane().add(btn8);

		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("9");
				broj = 9;
			}
		});
		btn9.setBounds(241, 177, 90, 40);
		getContentPane().add(btn9);

		JButton btnMnozenje = new JButton("*");
		btnMnozenje.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				ulaz = Integer.parseInt(textField.getText()); 
				operacija = 3;
			}
		});
		btnMnozenje.setBounds(371, 179, 90, 40);
		getContentPane().add(btnMnozenje);

		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				broj = 0;
				operacija = 0;
				ulaz = 0;
				textField.setText("0");
			}
		});
		btnC.setBounds(41, 228, 90, 40);
		getContentPane().add(btnC);

		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("0");
				broj = 0;
			}
		});
		btn0.setBounds(141, 228, 90, 40);
		getContentPane().add(btn0);

		JButton btnJednako = new JButton("=");
		btnJednako.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				//int ulaz = Integer.parseInt(textField.getText()); 
				if (operacija == 1)
				{
					double calculate =  (ulaz + broj);
					textField.setText(String.valueOf(calculate));
				}

				else if (operacija == 2)
				{
					double calculate =  (ulaz - broj);
					textField.setText(String.valueOf(calculate));
				}
				else if (operacija == 3)
				{
					double calculate =  (ulaz * broj);
					textField.setText(String.valueOf(calculate));
				}
				else if (operacija == 4)
				{
					double calculate =  (ulaz / broj);
					textField.setText(String.valueOf(calculate));
				}
			}
		});
		btnJednako.setBounds(241, 228, 90, 40);
		getContentPane().add(btnJednako);

		JButton btnDeljenje = new JButton("/");
		btnDeljenje.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				ulaz = Integer.parseInt(textField.getText()); 
				operacija = 4;
			}
		});
		btnDeljenje.setBounds(371, 230, 90, 40);
		getContentPane().add(btnDeljenje);
	}

	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.setVisible(true);
		c.setSize(500, 350);
		c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//c.setTitle("Calculator");
		c.setResizable(false);
	}
}
