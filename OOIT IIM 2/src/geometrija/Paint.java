package geometrija;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.FlowLayout;
import java.awt.Color;

import javax.swing.JTextArea;
import javax.swing.JButton;

import java.awt.Font;

import javax.swing.JToggleButton;
import javax.swing.ButtonGroup;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Paint extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	ArrayList oblici = new ArrayList();
	private JPanel radniPanel;
	public String action;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Paint frame = new Paint();
					frame.setVisible(true);
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Konstruktor - kreira frame.
	 */
	public Paint() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 634, 426);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		radniPanel=new RadniPanel();
		
		final JPanel pnlListener = new JPanel();

		pnlListener.setBackground(Color.WHITE);
		pnlListener.setBounds(198, 11, 410, 327);
		contentPane.add(pnlListener);
		pnlListener.setLayout(null);
		radniPanel.setBounds(0,0,390,327);
		pnlListener.add(radniPanel);
		radniPanel.setVisible(true);
		
		final JTextArea txtAreaInfo = new JTextArea();
		txtAreaInfo.setBounds(198, 349, 410, 28);
		contentPane.add(txtAreaInfo);
		
		final JToggleButton tglBtnTacka = new JToggleButton("TACKA");
		tglBtnTacka.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtAreaInfo.setText("********* Crtanje tacke klikom na radnu povrsinu ************");
				radniPanel.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent e) {
						int x = e.getX();
						int y = e.getY();
						System.out.println("x: " +x +" y: " +y);
						Tacka t = new Tacka(x, y,"crna");
						
					}
				});
			}
		});
		buttonGroup.add(tglBtnTacka);
		tglBtnTacka.setBounds(10, 11, 150, 35);
		contentPane.add(tglBtnTacka);
		
		JToggleButton tglBtnLinija = new JToggleButton("LINIJA");
		buttonGroup.add(tglBtnLinija);
		tglBtnLinija.setBounds(10, 52, 150, 35);
		contentPane.add(tglBtnLinija);
		
		JToggleButton tglBtnKrug = new JToggleButton("KRUG");
		buttonGroup.add(tglBtnKrug);
		tglBtnKrug.setBounds(10, 93, 150, 35);
		contentPane.add(tglBtnKrug);
		
		JToggleButton tglBtnKvadrat = new JToggleButton("KVADRAT");
		buttonGroup.add(tglBtnKvadrat);
		tglBtnKvadrat.setBounds(10, 134, 150, 35);
		contentPane.add(tglBtnKvadrat);
		
		JToggleButton tglbtnPravougaonik = new JToggleButton("PRAVOUGAONIK");
		buttonGroup.add(tglbtnPravougaonik);
		tglbtnPravougaonik.setBounds(10, 175, 150, 35);
		contentPane.add(tglbtnPravougaonik);
		


	}
	
	
	
}
