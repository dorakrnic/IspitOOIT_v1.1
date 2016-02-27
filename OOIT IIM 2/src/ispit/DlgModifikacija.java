package ispit;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JSeparator;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JCheckBox;
import javax.swing.ButtonGroup;

public class DlgModifikacija extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtNovaSirina;
	private JTextField txtNovaVisina;
	private JTextField txtPomeriNaX;
	private JTextField txtPomeriNaY;
	private JTextField txtPomeriZaX;
	private JTextField txtPomeriZaY;
	
	public String type=PnlCrtez.selektovan.typeToString();
	public int sirina;
	public int visina;
	public String boja;
	public String bojaUnutrasnjosti;
	public int pozicijaX;
	public int pozicijaY;
	boolean isNumb=true;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DlgModifikacija dialog = new DlgModifikacija();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DlgModifikacija() {
		setModal(true);
		setTitle("Modifikacija");
		setBounds(100, 100, 293, 438);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		
		JLabel lblSirina = new JLabel("Sirina:");
		lblSirina.setBounds(16, 140, 88, 14);
		lblSirina.setHorizontalAlignment(SwingConstants.RIGHT);
		
		JLabel lblVisina = new JLabel("Visina:");
		lblVisina.setBounds(16, 186, 88, 14);
		lblVisina.setHorizontalAlignment(SwingConstants.RIGHT);
		
		JButton btnNewButton = new JButton("Boja ivice");
		btnNewButton.setBounds(66, 37, 157, 23);
		
		JButton btnBojaUnutrasnjosti = new JButton("Boja unutrasnjosti");
		btnBojaUnutrasnjosti.setBounds(66, 86, 157, 23);
		
		txtNovaSirina = new JTextField();

		
		txtNovaSirina.setBounds(137, 137, 86, 20);
		txtNovaSirina.setColumns(10);
		
		txtNovaVisina = new JTextField();
		
		txtNovaVisina.setBounds(135, 183, 88, 20);
		txtNovaVisina.setColumns(10);
		
		JLabel label = new JLabel("");
		label.setBounds(99, 232, 0, 0);
		
		JLabel lblX = new JLabel("X:");
		lblX.setBounds(135, 235, 27, 14);
		
		JLabel lblY = new JLabel("Y:");
		lblY.setBounds(135, 263, 27, 14);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(15, 288, 208, 9);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(15, 212, 208, 9);
		
		JLabel label_1 = new JLabel("X:");
		label_1.setBounds(135, 308, 27, 14);
		
		JLabel label_2 = new JLabel("Y:");
		label_2.setBounds(135, 340, 10, 14);
		
		txtPomeriNaX = new JTextField();
		txtPomeriNaX.setBounds(172, 232, 51, 20);
		txtPomeriNaX.setColumns(10);
		contentPanel.setLayout(null);
		contentPanel.add(separator);
		contentPanel.add(separator_1);
		contentPanel.add(label_1);
		contentPanel.add(label_2);
		contentPanel.add(txtPomeriNaX);
		contentPanel.add(label);
		contentPanel.add(btnBojaUnutrasnjosti);
		contentPanel.add(btnNewButton);
		contentPanel.add(txtNovaSirina);
		contentPanel.add(lblX);
		contentPanel.add(txtNovaVisina);
		contentPanel.add(lblY);
		contentPanel.add(lblVisina);
		contentPanel.add(lblSirina);
		
		txtPomeriNaY = new JTextField();
		txtPomeriNaY.setColumns(10);
		txtPomeriNaY.setBounds(172, 257, 51, 20);
		contentPanel.add(txtPomeriNaY);
		
		txtPomeriZaX = new JTextField();
		txtPomeriZaX.setColumns(10);
		txtPomeriZaX.setBounds(172, 305, 51, 20);
		contentPanel.add(txtPomeriZaX);
		
		txtPomeriZaY = new JTextField();
		txtPomeriZaY.setColumns(10);
		txtPomeriZaY.setBounds(172, 337, 51, 20);
		contentPanel.add(txtPomeriZaY);
		
		JLabel lblNoveVrednosti = new JLabel("Nove vrednosti");
		lblNoveVrednosti.setHorizontalAlignment(SwingConstants.CENTER);
		lblNoveVrednosti.setBounds(50, 11, 183, 14);
		contentPanel.add(lblNoveVrednosti);
		
		if(type=="Kvadrat"|| type=="Pravougaonik"){
			txtNovaSirina.setText(String.valueOf(PnlCrtez.selektovan.getStranica()));
			sirina=PnlCrtez.selektovan.getStranica();
			if(type=="Kvadrat"){
				txtNovaVisina.setVisible(false);
				lblVisina.setVisible(false);
			}else{
				txtNovaVisina.setVisible(true);
				lblVisina.setVisible(true);
				txtNovaVisina.setText(String.valueOf(PnlCrtez.selektovan.getVisina()));
				visina=PnlCrtez.selektovan.getVisina();
			}
				
		}else if(PnlCrtez.selektovan.typeToString()=="Krug"){
			txtNovaSirina.setText(String.valueOf(PnlCrtez.selektovan.getRadius()));
			txtNovaVisina.setVisible(false);
			lblSirina.setText("Radius");
			lblVisina.setVisible(false);
			txtNovaVisina.setVisible(false);
			sirina=PnlCrtez.selektovan.getRadius();
			
		}
		txtPomeriNaX.setText("0");
		txtPomeriNaY.setText("0");
		txtPomeriZaX.setText("0");
		txtPomeriZaY.setText("0");
		
		final JCheckBox chbPomeriNa = new JCheckBox("Pomeri na:");
		buttonGroup.add(chbPomeriNa);
		
		chbPomeriNa.setBounds(15, 228, 97, 23);
		contentPanel.add(chbPomeriNa);
		
		final JCheckBox chbPomeriZa = new JCheckBox("Pomeri za:");
		
		buttonGroup.add(chbPomeriZa);
		chbPomeriZa.setBounds(15, 304, 97, 23);
		contentPanel.add(chbPomeriZa);
		
		
		////events////
		//proveravaju se sva polja na focus out da li su brojevi
		txtNovaSirina.addFocusListener(new FocusAdapter() {
			public void focusLost(FocusEvent e) {
				isNumb=isNumb & isNumber(txtNovaSirina.getText());
				if(txtNovaSirina.getText().length()==0){
					JOptionPane.showMessageDialog(null, "Vrednost ce ostati nepromenjena", "Potrda", JOptionPane.INFORMATION_MESSAGE);
					txtNovaSirina.setText(String.valueOf(sirina));
				}
			}
		});
		txtNovaVisina.addFocusListener(new FocusAdapter() {
			public void focusLost(FocusEvent e) {
				isNumb=isNumb & isNumber(txtNovaVisina.getText());
				if(txtNovaVisina.getText().length()==0){
					JOptionPane.showMessageDialog(null, "Visina ce ostati nepromenjena", "Potrda", JOptionPane.INFORMATION_MESSAGE);
					txtNovaVisina.setText("0");
				}
			}
		});
		
		chbPomeriNa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chbPomeriNa.isSelected()){
					txtPomeriZaX.setEnabled(false);
					txtPomeriZaY.setEnabled(false);
				}
			}
		});
		
		chbPomeriZa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chbPomeriZa.isSelected()){
					txtPomeriNaX.setEnabled(false);
					txtPomeriNaY.setEnabled(false);
				}
			}
		});

		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
				if(!isNumb)
					okButton.setEnabled(false);
				else
					okButton.setEnabled(true);
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						//sirina ce biti za kvadrat i pravougaonik, za krug ce radius uzeti ovu sirinu, za liniju sirina ce biti duzina
						//za tacku ne treba da postoji ni sirina ni visina
						if(!isNumb){
							JOptionPane.showMessageDialog(null, "Morate uneti brojeve", "Greska", JOptionPane.ERROR_MESSAGE);
						}
						//ako imamo brojeve setujemo vrednosti i prihvatamo ok
						else{
							if(type!="Tacka"){
								sirina=Integer.parseInt(txtNovaSirina.getText());
								
							}
							if(type=="Pravougaonik"){
								visina=Integer.parseInt(txtNovaVisina.getText());
							}
							dispose();
						}

							
						
					}
				});

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
	
	public static boolean isNumber(String s){
		try{
			int n=Integer.parseInt(s);
			return true;
		}catch(NumberFormatException e){
			return false;
		}
	}
}
