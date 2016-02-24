package ispit;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.SwingConstants;

public class DlgUpit extends JDialog {

	private final JPanel contentPanel = new JPanel();
	public int radius;
	public int visina;
	public static String btnStr;
	private JTextField txtVisina;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DlgUpit dialog = new DlgUpit(FrmPaint.actionStr);
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DlgUpit(final String s) {
		
		setModal(true);
		setTitle("Dimenzije");
		setBounds(100, 100, 382, 220);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		final JTextField txtRadius = new JTextField();
		JLabel lblPoluprecnik = new JLabel("Poluprecnik:");
		lblPoluprecnik.setHorizontalAlignment(SwingConstants.RIGHT);
		

		{
			
			lblPoluprecnik.setBounds(47, 52, 123, 32);
			contentPanel.add(lblPoluprecnik);
		}
		{
			txtRadius.setBounds(180, 58, 86, 20);
			contentPanel.add(txtRadius);
			txtRadius.setColumns(10);
		}

		if(s=="KVADRAT"){
			lblPoluprecnik.setText("Duzina stranice");
		}
		if(s=="PRAVOUGAONIK"){
			JLabel lblVisina = new JLabel("Visina:");
			txtVisina = new JTextField();
			lblPoluprecnik.setText("Sirina");
			lblVisina.setHorizontalAlignment(SwingConstants.RIGHT);
			lblVisina.setBounds(47, 95, 123, 32);
			contentPanel.add(lblVisina);
			contentPanel.add(txtVisina);
			txtVisina.setColumns(10);
			txtVisina.setBounds(180, 101, 86, 20);
		}
			
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						boolean isNumb=false;
						//if(!txtVisina.isVisible() && isNumber(txtRadius.getText()))
						if(txtRadius.getText().length()>0){
							isNumb = isNumber(txtRadius.getText());
							if((s=="KRUG" || s=="KVADRAT") && isNumb){
								radius=Integer.parseInt(txtRadius.getText());
								btnStr=e.getActionCommand();
								dispose();
							}
							if(s=="PRAVOUGAONIK"){
								isNumb=isNumb & isNumber(txtVisina.getText());
								if(txtVisina.getText().length()>0 && isNumb){
									radius=Integer.parseInt(txtRadius.getText());
									visina=Integer.parseInt(txtVisina.getText());
									btnStr=e.getActionCommand();
									dispose();
								}
								
							}
	
						}
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
						btnStr=e.getActionCommand();
						dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
	
	public boolean isNumber(String s){
		try{
			int n=Integer.parseInt(s);
			return true;
		}catch(NumberFormatException e){
			JOptionPane.showMessageDialog(null, "Niste uneli broj", "Greska", JOptionPane.ERROR_MESSAGE);
			return false;
		}
	}
}
