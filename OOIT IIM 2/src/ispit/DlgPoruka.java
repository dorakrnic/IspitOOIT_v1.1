package ispit;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DlgPoruka extends JDialog {

	private final JPanel contentPanel = new JPanel();
	
	public static String btnStr;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DlgPoruka dialog = new DlgPoruka();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DlgPoruka() {
		setTitle("PORUKA");
		setModal(true);
		setBounds(100, 100, 291, 158);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblIzbrisatiSelektovaneOblike = new JLabel("Are you really really sure?");
		
		
		
		lblIzbrisatiSelektovaneOblike.setHorizontalAlignment(SwingConstants.RIGHT);
		lblIzbrisatiSelektovaneOblike.setBounds(100, 50, 165, 14);
		contentPanel.add(lblIzbrisatiSelektovaneOblike);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			JButton okButton = new JButton("OK");
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						btnStr="OK";
						dispose();
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
						btnStr="Cancel";
						dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
