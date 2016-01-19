package wb;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DlgPravougaonik extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtVisina;
	private JTextField txtSirina;
	public String visina;
	public String sirina;
	public String boja;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DlgPravougaonik dialog = new DlgPravougaonik();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DlgPravougaonik() {
		setModal(true);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		contentPanel.setBounds(0, 0, 442, 240);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel);
		contentPanel.setLayout(null);
		
		JLabel lblVisina = new JLabel("Visina");
		lblVisina.setBounds(10, 24, 121, 25);
		contentPanel.add(lblVisina);
		
		JLabel lblSirina = new JLabel("Sirina");
		lblSirina.setBounds(10, 63, 121, 25);
		contentPanel.add(lblSirina);
		
		JLabel lblBoja = new JLabel("Boja");
		lblBoja.setBounds(10, 99, 121, 25);
		contentPanel.add(lblBoja);
		
		txtVisina = new JTextField();
		txtVisina.setBounds(141, 26, 86, 20);
		contentPanel.add(txtVisina);
		txtVisina.setColumns(10);
		
		txtSirina = new JTextField();
		txtSirina.setColumns(10);
		txtSirina.setBounds(141, 65, 86, 20);
		contentPanel.add(txtSirina);
		
		final JComboBox cbxBoja = new JComboBox();
		cbxBoja.setModel(new DefaultComboBoxModel(new String[] {"Crna", "Bela", "Zuta", "Plava"}));
		cbxBoja.setSelectedIndex(1);
		cbxBoja.setBounds(141, 100, 86, 22);
		contentPanel.add(cbxBoja);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBounds(0, 240, 442, 33);
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						visina = txtVisina.getText();
						sirina = txtSirina.getText();
						boja = cbxBoja.getSelectedItem().toString();
						
						if(visina.length() > 0){
							try{
								Double.parseDouble(visina);
								JOptionPane.showMessageDialog(null, 
										"Visina: "+txtVisina.getText()+"\nSirina: "+txtSirina.getText()+"\nBoja: "+cbxBoja.getSelectedItem().toString(), 
										"Pravougaonik", JOptionPane.INFORMATION_MESSAGE);
								setVisible(false);
							}
							catch(NumberFormatException e1){
								JOptionPane.showMessageDialog(null, "Morate uneti broj za visinu", "Greska", JOptionPane.ERROR_MESSAGE);
							}
						}
						else
							JOptionPane.showMessageDialog(null, "Niste uneli visinu!", "Greska", JOptionPane.ERROR_MESSAGE);
						
						if(sirina.length() > 0){
							try{
								Double.parseDouble(sirina);
							}
							catch(NumberFormatException e1){
								JOptionPane.showMessageDialog(null, "Morate uneti broj za sirinu", "Greska", JOptionPane.ERROR_MESSAGE);
							}
						}
						else
							JOptionPane.showMessageDialog(null, "Niste uneli sirinu", "Greska", JOptionPane.ERROR_MESSAGE);
								
										
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
