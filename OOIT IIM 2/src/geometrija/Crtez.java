package geometrija;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Crtez extends JPanel{

	public static void main(String[] args) {
		JFrame prozor = new JFrame();
		prozor.setSize(800, 600);
		prozor.setVisible(true);
		prozor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		prozor.setTitle("Vidi prozor!!!");
		Crtez c = new Crtez();
		prozor.getContentPane().add(c);
		c.setBackground(Color.black);
			
	}
	
	public void paint (Graphics g){/*
		g.drawString("Neki text na poziciji 150 150", 150, 150);
		Tacka t1 = new Tacka(50, 50);
		t1.crtajSe(g);
		Tacka t2 = new Tacka(75, 75);
		
		
		t2.crtajSe(g);
		t2.pomeriNa(10, 10);
		t2.crtajSe(g);
		repaint();
		Linija l1= new Linija(new Tacka(300, 300), new Tacka(350, 350));
		l1.crtajSe(g);
		Pravougaonik p1 = new Pravougaonik(new Tacka(500, 500), 100, 50);
		p1.crtajSe(g);
		Kvadrat k1 = new Kvadrat(new Tacka(250, 100), 100);
		k1.crtajSe(g);
		Krug kr1 = new Krug(new Tacka(400, 100), 50 );
		kr1.crtajSe(g);
		kr1.getCentar().crtajSe(g);
		//p1.dijagonala().crtajSe(g);
		k1.dijagonalaKvadrata().crtajSe(g);
		p1.centarPravougaonika().crtajSe(g);
		p1.getGoreLevo().crtajSe(g);
	*/
		Tacka t10 = new Tacka(2, 200);
		Tacka t11 = new Tacka(200, 400);
		Tacka t12 = new Tacka(400, 800);
		Tacka t13 = new Tacka(800, 1000);

		Linija l10  = new Linija(t10,t11);
		Linija l11  = new Linija(t11,t12);
		Linija l12  = new Linija(t12,t13);

		Polilinija2 poli = new Polilinija2();

		poli.dodajSegment(l10);
		poli.dodajSegment(l11);
		poli.dodajSegment(l12);
		poli.crtajSe(g);
	}

}
