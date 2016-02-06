package stek;

import geometrija.Krug;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.FlowLayout;

import net.miginfocom.swing.MigLayout;

import javax.swing.JButton;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JList;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;
import javax.swing.JScrollPane;

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
		btnDodaj.setBounds(30, 171, 158, 55);
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
		btnUkloni.setBounds(198, 171, 158, 55);
		contentPane.add(btnUkloni);

	}
}
