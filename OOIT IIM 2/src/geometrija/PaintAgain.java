package geometrija;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;

public class PaintAgain extends JFrame {

	private JPanel contentPane;
	public static String actionStr;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PaintAgain frame = new PaintAgain();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PaintAgain() {
		
		final Crtez1 crtez1=new Crtez1(this);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 431);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setForeground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		crtez1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		crtez1.setBackground(Color.WHITE);
		crtez1.setBounds(159, 5, 270, 252);
		crtez1.removeComponentListener(null);
		contentPane.add(crtez1);
		crtez1.setLayout(null);
		
		JButton btnTacka = new JButton("TACKA");
		btnTacka.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(e.getActionCommand());
				actionStr=e.getActionCommand();
			}
		});
		btnTacka.setBounds(10, 42, 95, 52);
		contentPane.add(btnTacka);
		
		JButton btnLinija = new JButton("LINIJA");
		btnLinija.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionStr=e.getActionCommand();
				
			}
		});
		btnLinija.setBounds(10, 122, 95, 52);
		contentPane.add(btnLinija);
	}
}
