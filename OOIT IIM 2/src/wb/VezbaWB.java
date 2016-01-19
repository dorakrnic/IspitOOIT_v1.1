package wb;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;

import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JToggleButton;
import javax.swing.ButtonGroup;
import javax.swing.JList;
import javax.swing.JScrollPane;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class VezbaWB extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	DefaultListModel dlm = new DefaultListModel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VezbaWB frame = new VezbaWB();
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
	public VezbaWB() {
		setTitle("WB Vezba");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 624, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel pnlOsnovni = new JPanel();
		pnlOsnovni.setBackground(new Color(64, 224, 208));
		pnlOsnovni.setBounds(44, 24, 533, 394);
		contentPane.add(pnlOsnovni);
		pnlOsnovni.setLayout(null);

		JLabel lblNaslov = new JLabel("Naslov!");
		lblNaslov.setForeground(new Color(0, 0, 255));
		lblNaslov.setFont(new Font("Monotype Corsiva", Font.BOLD | Font.ITALIC, 22));
		lblNaslov.setBounds(178, 11, 189, 50);
		pnlOsnovni.add(lblNaslov);


		final JLabel lblTest = new JLabel("");
		lblTest.setBounds(339, 97, 161, 14);
		pnlOsnovni.add(lblTest);

		JButton btnTest = new JButton("Test");
		btnTest.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER){
					JOptionPane.showMessageDialog(null, "Kliknuto na dugme Test!");
				}
			}
		});
		btnTest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Kliknuto na dugme Test!");
				lblTest.setText("Kliknuto na dugme Test!");
			}
		});
		btnTest.setBounds(192, 93, 91, 23);
		pnlOsnovni.add(btnTest);

		final JLabel lblIvanovic = new JLabel("");
		lblIvanovic.setBounds(178, 180, 138, 14);
		pnlOsnovni.add(lblIvanovic);

		final JLabel lblMatic = new JLabel("");
		lblMatic.setBounds(178, 214, 138, 14);
		pnlOsnovni.add(lblMatic);

		final JLabel lblKolarov = new JLabel("");
		lblKolarov.setBounds(178, 248, 138, 14);
		pnlOsnovni.add(lblKolarov);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(360, 161, 147, 203);
		pnlOsnovni.add(scrollPane);

		final JList lstImena = new JList();
		scrollPane.setViewportView(lstImena);
		lstImena.setModel(dlm);

		JToggleButton tglbtnIvanovic = new JToggleButton("Ivanovic");
		tglbtnIvanovic.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblIvanovic.setText("Branislav Ivanovic");
				lblIvanovic.setVisible(true);
				lblMatic.setVisible(false);
				lblKolarov.setVisible(false);
				dlm.addElement("Branislav Ivanovic");

			}
		});
		buttonGroup.add(tglbtnIvanovic);
		tglbtnIvanovic.setBounds(30, 176, 121, 23);
		pnlOsnovni.add(tglbtnIvanovic);

		JToggleButton tglbtnMatic = new JToggleButton("Matic");
		tglbtnMatic.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblMatic.setText("Nemanja Matic");
				lblMatic.setVisible(true);
				lblIvanovic.setVisible(false);
				lblKolarov.setVisible(false);
				dlm.addElement("Nemanja Matic");
			}
		});
		buttonGroup.add(tglbtnMatic);
		tglbtnMatic.setBounds(30, 210, 121, 23);
		pnlOsnovni.add(tglbtnMatic);

		JToggleButton tglbtnKolarov = new JToggleButton("Kolarov");
		tglbtnKolarov.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblKolarov.setText("Aleksandar Kolarov");
				lblKolarov.setVisible(true);
				lblMatic.setVisible(false);
				lblIvanovic.setVisible(false);
				dlm.addElement("Aleksandar Kolarov");
			}
		});
		buttonGroup.add(tglbtnKolarov);
		tglbtnKolarov.setBounds(30, 244, 121, 23);
		pnlOsnovni.add(tglbtnKolarov);
		
		JButton btnPravougaonik = new JButton("Pravougaonik");
		btnPravougaonik.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DlgPravougaonik dlgp = new DlgPravougaonik();
				dlgp.setVisible(true);
				
				System.out.println("Visina: "+dlgp.visina+"\nSirina: "+dlgp.sirina+"\nBoja: "+dlgp.boja);
				
			}
		});
		btnPravougaonik.setBounds(30, 294, 121, 23);
		pnlOsnovni.add(btnPravougaonik);





	}
}
