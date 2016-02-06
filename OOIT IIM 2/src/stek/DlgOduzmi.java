package stek;


import geometrija.Krug;
import geometrija.Tacka;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DlgOduzmi extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtX;
	private JTextField txtY;
	private JTextField txtRadius;
	public String action;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DlgOduzmi dialog = new DlgOduzmi(null);
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DlgOduzmi(final Krug k) {
		setModal(true);
		setTitle("Dijalog ukloni");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblUputstvo = new JLabel("Uklanja se krug");
		lblUputstvo.setHorizontalAlignment(SwingConstants.CENTER);
		lblUputstvo.setBounds(57, 11, 308, 14);
		contentPanel.add(lblUputstvo);
		
		JLabel lblCentar = new JLabel("Centar");
		lblCentar.setBounds(39, 51, 46, 14);
		contentPanel.add(lblCentar);
		
		JLabel lblPoluprecnik = new JLabel("Poluprecnik");
		lblPoluprecnik.setBounds(39, 115, 103, 14);
		contentPanel.add(lblPoluprecnik);
		
		JLabel lblBoja = new JLabel("Boja");
		lblBoja.setBounds(39, 163, 46, 14);
		contentPanel.add(lblBoja);
		
		JLabel lblX = new JLabel("x:");
		lblX.setBounds(146, 51, 25, 14);
		contentPanel.add(lblX);
		
		JLabel lblY = new JLabel("y:");
		lblY.setBounds(146, 76, 25, 14);
		contentPanel.add(lblY);
		
		txtX = new JTextField();
		txtX.setText(String.valueOf(k.getCentar().getX()));
		txtX.setEnabled(false);
		txtX.setBounds(168, 48, 59, 20);
		contentPanel.add(txtX);
		txtX.setColumns(10);
		
		txtY = new JTextField();
		txtY.setText(String.valueOf(k.getCentar().getY()));
		txtY.setEnabled(false);
		txtY.setColumns(10);
		txtY.setBounds(168, 73, 59, 20);
		contentPanel.add(txtY);
		
		txtRadius = new JTextField();
		txtRadius.setText(String.valueOf(k.getRadius()));
		txtRadius.setEnabled(false);
		txtRadius.setColumns(10);
		txtRadius.setBounds(168, 112, 59, 20);
		contentPanel.add(txtRadius);
		
		final JComboBox comboBoja = new JComboBox();
		comboBoja.setEnabled(false);
		comboBoja.setModel(new DefaultComboBoxModel(new String[] {"Plava", "Crvena", "Zuta", "Crna", "Bela", "Zelena"}));
		comboBoja.setToolTipText("izaberi boju");
		comboBoja.setBounds(168, 160, 144, 20);
		comboBoja.setSelectedItem(String.valueOf(k.getBoja()));
		contentPanel.add(comboBoja);
		
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						getAction(e.getActionCommand());
						dispose();
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						/*
						 * prosledjujem naziv komande
						 */
						getAction(e.getActionCommand());
						dispose();
					}
				});
				
			}
		}
		
		
	}

	protected void getAction(String s) {		
		action=s;
	}
	/*
	 * postavlja vrednost komande u promenljivu da bi JFStek proveravao akciju na osnovu koje oduzima/ne oduzima sa liste
	 */

}
