package stek;

import geometrija.Krug;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.FlowLayout;

import javax.swing.JButton;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JList;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;
import javax.swing.JScrollPane;
import javax.swing.UIManager;

public class JFStek extends JFrame {

	
	private JPanel contentPane;
	DefaultListModel<Krug> dlm=new DefaultListModel();
	int i;
	/**
	 * 
	 * @author Isidora
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFStek frame = new JFStek();
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
	public JFStek() {
		setTitle("Stek");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 401, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(30, 36, 328, 124);
		contentPane.add(scrollPane);
		
		JList lstKrugovi = new JList();
		scrollPane.setViewportView(lstKrugovi);
		lstKrugovi.setModel(dlm);
		
		
		JButton btnDodaj = new JButton("Dodaj");
		btnDodaj.setFont(UIManager.getFont("Button.font"));
		btnDodaj.setBounds(30, 171, 158, 34);
		contentPane.add(btnDodaj);
		btnDodaj.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DlgKrug dijalogDodaj=new DlgKrug();
				dijalogDodaj.setVisible(true);
				dlm.add(0, dijalogDodaj.krug);
			}
		});
		
		JButton btnUkloni = new JButton("Ukloni");
		btnUkloni.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(dlm.getSize()>0){
					Krug k=dlm.elementAt(0);
					DlgKrug dijalogOduzmi=new DlgKrug(k);
					dijalogOduzmi.setVisible(true);
					if(dijalogOduzmi.action=="OK")
						dlm.remove(0);
				}

			}
		});
		btnUkloni.setBounds(198, 171, 158, 34);
		contentPane.add(btnUkloni);
		
		JButton btnSortirajAsc = new JButton("Sortiraj listu na dole");
		btnSortirajAsc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Krug> listaKrugova = new ArrayList<Krug>();
		        for (int i = 0; i < dlm.getSize() ; i++){
		            listaKrugova.add((Krug)dlm.getElementAt(i));
		        }
		        Collections.sort(listaKrugova);
		        dlm.removeAllElements();
		        for (int i = 0; i<listaKrugova.size(); i++)
		            dlm.addElement(listaKrugova.get(i));
			}
		});
		btnSortirajAsc.setBounds(30, 216, 158, 35);
		contentPane.add(btnSortirajAsc);
		
		JButton btnSortirajDesc = new JButton("Sortiraj listu na gore");
		btnSortirajDesc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Krug> listaKrugova = new ArrayList<Krug>();
		        for (int i = 0; i < dlm.getSize() ; i++){
		            listaKrugova.add((Krug)dlm.getElementAt(i));
		        }
				Comparator cmp = Collections.reverseOrder();
				Collections.sort(listaKrugova,cmp);
				dlm.removeAllElements();
				 for (int i = 0; i<listaKrugova.size(); i++)
			            dlm.addElement(listaKrugova.get(i));
			}
		});
		btnSortirajDesc.setBounds(198, 216, 158, 35);
		contentPane.add(btnSortirajDesc);

	}
}
