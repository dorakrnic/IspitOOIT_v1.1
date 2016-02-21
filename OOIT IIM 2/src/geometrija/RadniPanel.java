package geometrija;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import wb.DlgPravougaonik;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.border.BevelBorder;

public class RadniPanel extends JPanel {
	ArrayList oblici = new ArrayList();
	
	private int clickCounter=0;
	
	public RadniPanel(Paint p){
		setBorder(new BevelBorder(BevelBorder.LOWERED, Color.BLACK, Color.LIGHT_GRAY, null, null));
		setBackground(Color.WHITE);
		
		addMouseListener(new MouseAdapter() {
			private Tacka t1;
			private Tacka t2;
			
			public void mouseClicked(MouseEvent e) {
				
				System.out.println(e.getX());
				
				if(Paint.actionStr=="TACKA"){
					int x = e.getX();
					int y = e.getY();
					Tacka t = new Tacka(x, y,"crna");
					oblici.add(t);
				}
				if(Paint.actionStr=="LINIJA"){
					clickCounter++;
					System.out.println("kliknuto na btn linija");
					int x=e.getX();
					int y=e.getY();
					System.out.println(clickCounter);
					if(clickCounter%2!=0){
						t1=new Tacka(x,y,"crna");
						oblici.add(t1);
					}else{
						t2=new Tacka(x,y,"crna");
						Linija l=new Linija(t1,t2,"crna");
						oblici.add(t2);
						oblici.add(l);
						clickCounter=0;
					}
				}
			}
		});
		

	}

public void paint (Graphics g){
		super.paint(g);
		Iterator it = oblici.iterator();
		while(it.hasNext()){
			Oblik o = (Oblik) it.next();
			o.crtajSe(g);
			
		}
		repaint();
}
}
