package geometrija;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Iterator;

public class Polilinija2 {

	private ArrayList <Linija> segmenti;

	public Polilinija2(){
		segmenti = new ArrayList<Linija>();
	}
	
	public void crtajSe(Graphics g){
		Iterator it = segmenti.iterator();
		while(it.hasNext()){
			Linija sledeca = (Linija)it.next();
			sledeca.crtajSe(g);
		}
	}
	
	public void ukloniSegment(){
		if(segmenti.isEmpty()){
			System.out.println("Lista je prazna!!!");
		}
		else
			segmenti.remove(segmenti.size()-1);
	}

	public void dodajSegment(Linija segment){
		if (segmenti.size()<1){
			segmenti.add(segment);
		}
		else if (segmenti.get(segmenti.size()-1).getKrajnja().equals(segment.getPocetna())){
			segmenti.add(segment);
			
		}

		else 
			System.out.println("Linija se ne moze dodati u poliliniju!");
	}

}
