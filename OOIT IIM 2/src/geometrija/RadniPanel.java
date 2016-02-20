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

	public RadniPanel(){
		setBorder(new BevelBorder(BevelBorder.LOWERED, Color.BLACK, Color.LIGHT_GRAY, null, null));

	}

public void paint (Graphics g){
		
		Iterator it = oblici.iterator();
		while(it.hasNext()){
			Oblik o = (Oblik) it.next();
			o.crtajSe(g);
			
		}
		repaint();
}
}
