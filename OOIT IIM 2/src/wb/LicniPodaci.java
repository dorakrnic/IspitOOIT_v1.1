package wb;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LicniPodaci extends JFrame {

	private JPanel contentPane;
	private JTextField txtIme;
	private JTextField txtPrezime;
	private JTextField txtJMBG;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LicniPodaci frame = new LicniPodaci();
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
	public LicniPodaci() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 598, 243);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblIme = new JLabel("Ime");
		lblIme.setBounds(10, 47, 108, 26);
		contentPane.add(lblIme);

		JLabel lblPrezime = new JLabel("Prezime");
		lblPrezime.setBounds(10, 84, 108, 26);
		contentPane.add(lblPrezime);

		JLabel lblJMBG = new JLabel("JMBG");
		lblJMBG.setBounds(10, 121, 108, 26);
		contentPane.add(lblJMBG);

		txtIme = new JTextField();
		txtIme.setBounds(174, 50, 149, 20);
		contentPane.add(txtIme);
		txtIme.setColumns(10);

		txtPrezime = new JTextField();
		txtPrezime.setColumns(10);
		txtPrezime.setBounds(174, 87, 149, 20);
		contentPane.add(txtPrezime);

		txtJMBG = new JTextField();
		txtJMBG.setColumns(10);
		txtJMBG.setBounds(174, 124, 149, 20);
		contentPane.add(txtJMBG);

		JButton btnLicniPodaci = new JButton("Licni podaci");
		btnLicniPodaci.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if(txtIme.getText().length()<1){
					JOptionPane.showMessageDialog(null,
							"Niste uneli ime!",
							"GREŠKA", //utf obrrati pažnju
							JOptionPane.ERROR_MESSAGE);

				}

				if(txtPrezime.getText().length()<1){
					JOptionPane.showMessageDialog(null,
							"Niste uneli prezime!",
							"GREŠKA", //utf obrrati pažnju
							JOptionPane.ERROR_MESSAGE);

				}

				if(txtJMBG.getText().length()>0){

					if(txtJMBG.getText().length()==13){


						try {
							//da li je uneto 13 CIFARA
							Double.parseDouble(txtJMBG.getText()); 

							JOptionPane.showMessageDialog(null,
									"Ime: "+txtIme.getText()+"\nPrezime: "+txtPrezime.getText()+"\nJMBG: "+txtJMBG.getText(),
									"Licni podaci", //utf obrrati pažnju
									JOptionPane.WARNING_MESSAGE);
							
						} catch (NumberFormatException e1) {
							// TODO Auto-generated catch block
							//e1.printStackTrace();
							JOptionPane.showMessageDialog(null,
									"Morate uneti SAMO brojeve!!",
									"JMBG", 
									JOptionPane.WARNING_MESSAGE);

						}

					}
					else	{					
						JOptionPane.showMessageDialog(null,
								"Niste uneli 13 cifara!",
								"GREŠKA", //utf obrrati pažnju
								JOptionPane.ERROR_MESSAGE);
					}
				}

				else 

					JOptionPane.showMessageDialog(null,
							"Niste uneli JMBG",
							"Licni podaci", //utf obrrati pažnju
							JOptionPane.ERROR_MESSAGE);
			}



		});
		btnLicniPodaci.setBounds(379, 86, 129, 23);
		contentPane.add(btnLicniPodaci);
	}
}
