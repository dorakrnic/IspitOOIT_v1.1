package ispit;

import geometrija.Oblik;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JColorChooser;
import javax.swing.JFrame;
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

import javax.swing.JTextField;

public class FrmPaint extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	
	public static String actionStr;
	public static Color boja;
	public static String bojaStr="roza";

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
		
		PnlCrtez crtez=new PnlCrtez(this);
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
		JToggleButton tglbtnKrug = new JToggleButton("KRUG");
		JToggleButton tglbtnBoja = new JToggleButton("BOJA");
		JToggleButton tglbtnKvadrat = new JToggleButton("KVADRAT");
		buttonGroup.add(tglbtnKvadrat);
		JToggleButton tglbtnPravougaonik = new JToggleButton("PRAVOUGAONIK");
		buttonGroup.add(tglbtnPravougaonik);
		
		crtez.setBackground(Color.WHITE);
		crtez.setBounds(144, 11, 670, 460);
		
		setTitle("Draw");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 850, 550);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.controlDkShadow);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		buttonGroup.add(tglbtnTacka);
		tglbtnTacka.setBounds(10, 11, 121, 23);
		contentPane.add(tglbtnTacka);
		buttonGroup.add(tglbtnLinija);
		tglbtnLinija.setBounds(10, 45, 121, 23);
		contentPane.add(tglbtnLinija);
		//crtez.removeContainerListener(null);
		contentPane.add(crtez);
		crtez.setLayout(null);
		lblX.setBounds(144, 488, 15, 23);
		contentPane.add(lblX);

		lblXkoo.setBounds(158, 488, 42, 23);
		contentPane.add(lblXkoo);

		lblY.setBounds(231, 488, 15, 23);
		contentPane.add(lblY);

		lblYkoo.setBounds(249, 488, 42, 23);
		contentPane.add(lblYkoo);
		
		
		lblInfo.setForeground(new Color(204, 204, 255));
		lblInfo.setBounds(310, 356, 372, 23);
		contentPane.add(lblInfo);
		
		
		
		buttonGroup.add(tglbtnKrug);
		tglbtnKrug.setBounds(10, 79, 121, 23);
		contentPane.add(tglbtnKrug);
		
		
		
		tglbtnBoja.setBounds(10, 222, 121, 23);
		contentPane.add(tglbtnBoja);
		
		
	
		tglbtnKvadrat.setBounds(10, 113, 121, 23);
		contentPane.add(tglbtnKvadrat);
		
		

		tglbtnPravougaonik.setBounds(10, 147, 121, 23);
		contentPane.add(tglbtnPravougaonik);
		
		/**
		 * Motion Listener - ispisuje labele za x i y koordinate
		 */
		crtez.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				lblXkoo.setText(String.valueOf(e.getX()));
				lblYkoo.setText(String.valueOf(e.getY()));
			}
		});
		
		tglbtnTacka.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionStr=e.getActionCommand();
			}
		});
		
		
		tglbtnLinija.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionStr=e.getActionCommand();
			}
		});
		
		tglbtnKrug.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionStr=e.getActionCommand();
			}
		});
		
		tglbtnKvadrat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionStr=e.getActionCommand();
			}
		});
		
		tglbtnPravougaonik.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionStr=e.getActionCommand();
			}
		});
		
		/**
		 * JColorChooser - setovanje boje
		 * ColorUtils - pretvara u string
		 */
		tglbtnBoja.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boja=JColorChooser.showDialog(contentPane, "Izaberi boju", Color.WHITE);
				ColorUtils cUtil=new ColorUtils();
				bojaStr=cUtil.getColorNameFromColor(boja);
			}
		});
		
		
		
		
	}
}
