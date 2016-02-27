package ispit;

import geometrija.Oblik;
import geometrija.Tacka;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JToggleButton;

import java.awt.Color;

import javax.swing.ButtonGroup;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JLabel;

import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;

import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;

import java.awt.SystemColor;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JTextField;

public class FrmPaint extends JFrame {

	private JPanel contentPane;
	
	
	public static String actionStr;
	public static Color boja;
	public static String bojaStr="roza";
	public static String bojaUnutr="zuta";
	
	private final ButtonGroup btnGroupOblici = new ButtonGroup();
	private final ButtonGroup btnGroupAkcija = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmPaint frame = new FrmPaint();
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
	public FrmPaint() {
		setResizable(false);
		
		final PnlCrtez crtez=new PnlCrtez(this);
		crtez.setBorder(new LineBorder(new Color(216, 191, 216)));
		JToggleButton tglbtnTacka = new JToggleButton("TACKA");
		JToggleButton tglbtnLinija = new JToggleButton("LINIJA");
		JLabel lblX = new JLabel("X:");
		lblX.setForeground(new Color(204, 204, 255));
		final JLabel lblXkoo = new JLabel("");
		lblXkoo.setForeground(new Color(204, 204, 255));
		JLabel lblY = new JLabel("Y:");
		lblY.setForeground(new Color(204, 204, 255));
		final JLabel lblYkoo = new JLabel("");
		lblYkoo.setForeground(new Color(204, 204, 255));
		final JLabel lblInfo = new JLabel("");
		lblInfo.setBorder(null);
		JToggleButton tglbtnKrug = new JToggleButton("KRUG");
		JButton btnBoja = new JButton("BOJA");
		btnGroupOblici.add(btnBoja);
		JToggleButton tglbtnKvadrat = new JToggleButton("KVADRAT");
		btnGroupOblici.add(tglbtnKvadrat);
		JToggleButton tglbtnPravougaonik = new JToggleButton("PRAVOUGAONIK");
		final JToggleButton tglbtnPopuni = new JToggleButton("POPUNI");
		btnGroupOblici.add(tglbtnPopuni);
		JToggleButton tglbtnSelekcija = new JToggleButton("SELEKCIJA");
		btnGroupOblici.add(tglbtnSelekcija);
		JToggleButton tglbtnIzbrisi = new JToggleButton("IZBRISI");
		btnGroupOblici.add(tglbtnIzbrisi);
		JToggleButton tglbtnModifikacija = new JToggleButton("MODIFIKACIJA");
		btnGroupOblici.add(tglbtnModifikacija);
		JToggleButton tglbtnIzbrisiSve = new JToggleButton("IZBRISI SVE");
		
		
		crtez.setBackground(Color.WHITE);
		crtez.setBounds(164, 11, 670, 460);
		
		setTitle("Draw");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 850, 550);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.controlDkShadow);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnGroupOblici.add(tglbtnTacka);
		btnGroupOblici.add(tglbtnPravougaonik);
		tglbtnTacka.setBounds(10, 11, 144, 23);
		contentPane.add(tglbtnTacka);
		btnGroupOblici.add(tglbtnLinija);
		tglbtnLinija.setBounds(10, 45, 144, 23);
		contentPane.add(tglbtnLinija);
		//crtez.removeContainerListener(null);
		contentPane.add(crtez);
		crtez.setLayout(null);
		lblX.setBounds(174, 488, 15, 23);
		contentPane.add(lblX);

		lblXkoo.setBounds(188, 488, 42, 23);
		contentPane.add(lblXkoo);

		lblY.setBounds(261, 488, 15, 23);
		contentPane.add(lblY);

		lblYkoo.setBounds(279, 488, 42, 23);
		contentPane.add(lblYkoo);
		
		
		lblInfo.setForeground(new Color(204, 204, 255));
		lblInfo.setBounds(390, 488, 444, 23);
		contentPane.add(lblInfo);
		
		
		
		btnGroupOblici.add(tglbtnKrug);
		tglbtnKrug.setBounds(10, 79, 144, 23);
		contentPane.add(tglbtnKrug);
		
		
		
		btnBoja.setBounds(10, 288, 144, 23);
		contentPane.add(btnBoja);
		
		
	
		tglbtnKvadrat.setBounds(10, 113, 144, 23);
		contentPane.add(tglbtnKvadrat);
		
		

		tglbtnPravougaonik.setBounds(10, 147, 144, 23);
		contentPane.add(tglbtnPravougaonik);
		

		tglbtnPopuni.setBounds(10, 322, 144, 23);
		contentPane.add(tglbtnPopuni);
		
		
		tglbtnSelekcija.setBounds(10, 205, 144, 23);
		contentPane.add(tglbtnSelekcija);
		
		
	
		tglbtnIzbrisi.setBounds(10, 377, 144, 23);
		contentPane.add(tglbtnIzbrisi);
		
		
		tglbtnModifikacija.setBounds(10, 448, 144, 23);
		contentPane.add(tglbtnModifikacija);
		
		
	
		btnGroupOblici.add(tglbtnIzbrisiSve);
		tglbtnIzbrisiSve.setBounds(10, 411, 144, 23);
		contentPane.add(tglbtnIzbrisiSve);
		
///////////////////////////////////////events////////////////////////////////////		
		/**
		 * Motion Listener nad JPanel.crtez - ispisuje labele za x i y koordinate
		 */
		crtez.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				lblXkoo.setText(String.valueOf(e.getX()));
				lblYkoo.setText(String.valueOf(e.getY()));
			}
		});
//////////////////////////oblici//////////////////////		
		
		/**
		 * button TACKA on click
		 */
		tglbtnTacka.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionStr=e.getActionCommand();
			}
		});
		
		/**
		 * button LINIJA on click
		 */
		tglbtnLinija.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionStr=e.getActionCommand();
			}
		});
		/**
		 * btn KRUG on click
		 */
		tglbtnKrug.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionStr=e.getActionCommand();
			}
		});
		/**
		 * button KVADRAT on click
		 */
		tglbtnKvadrat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionStr=e.getActionCommand();
			}
		});
		/**
		 * button PRAVOUGAONIK on click
		 */
		tglbtnPravougaonik.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionStr=e.getActionCommand();
			}
		});
///////////////////////boja//////////////////////////////////////////		
		/**
		 * JColorChooser - setovanje boje
		 * ColorUtils - pretvara u string
		 */
		btnBoja.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//tglbtnPopuni.setFocusable(false);
				boja=JColorChooser.showDialog(contentPane, "Izaberi boju", Color.WHITE);
				ColorUtils cUtil=new ColorUtils();
				bojaStr=cUtil.getColorNameFromColor(boja);
				
			}
		});
		/**
		 * button POPUNI on click - setuje boju unutrasnjosti na poslednju setovanu
		 */
		tglbtnPopuni.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionStr=e.getActionCommand();
				lblInfo.setText("Kliknuti unutar povrsinskog oblika da se oboji");
				bojaUnutr=bojaStr;
			}
		});
/////////////////////////selekcija//////////////////////////////////	
		/**
		 * button 	SELEKCIJA on click
		 */
		tglbtnSelekcija.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionStr=e.getActionCommand();
				lblInfo.setText("Kliknuti unutar oblika ili na liniju za selekciju");
			}
		});
///////////////////brisanje////////////////////////////////////////		
		/**
		 * button IZBRISI on click
		 */
		tglbtnIzbrisi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionStr=e.getActionCommand();
				lblInfo.setText("Klik na oblik koji se brise, ako nema oblika akcija se nece izvrsiti");

			}
		});
		
		tglbtnIzbrisiSve.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(PnlCrtez.oblici.size()==0){
					JOptionPane.showMessageDialog(null, "Nema oblika za brisanje", "Poruka", JOptionPane.INFORMATION_MESSAGE);
				}
				else{
					DlgPoruka dlgP=new DlgPoruka();
					dlgP.setVisible(true);
					if(dlgP.btnStr=="OK"){	
						PnlCrtez.oblici.clear();
					}
				}
				
			}
		});
///////////////////modifikacija//////////////////////////////////////
		/**
		 * button MODIFIKACIJA on click
		 */
		tglbtnModifikacija.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionStr=e.getActionCommand();
				lblInfo.setText("Selektovati oblik koji se modifikuje");
				if(PnlCrtez.selektovan!=null){
					//otvorim dijalog panel sa setovanim vrednostima od selektovanog oblika
					DlgModifikacija dlgM=new DlgModifikacija();
					dlgM.setVisible(true);
					if(PnlCrtez.selektovan.typeToString()=="Kvadrat" || PnlCrtez.selektovan.typeToString()=="Pravougaonik"){
						PnlCrtez.selektovan.setStranica(dlgM.sirina);
					}else if(PnlCrtez.selektovan.typeToString()=="Pravougaonik"){
						PnlCrtez.selektovan.setVisina(dlgM.visina);
					}else if(PnlCrtez.selektovan.typeToString()=="Krug"){
						PnlCrtez.selektovan.setRadius(dlgM.sirina);
					}else if(PnlCrtez.selektovan.typeToString()=="Linija"){
						PnlCrtez.selektovan.setDuzina(dlgM.sirina);
					}
					
				}
			}
		});
		
		
	}
}
