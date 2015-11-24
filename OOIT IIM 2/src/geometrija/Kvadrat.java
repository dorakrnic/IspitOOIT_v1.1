package geometrija;

import java.awt.Graphics;

public class Kvadrat extends Oblik {
	private Tacka goreLevo;
	private int stranica;


	public Kvadrat(){

	}

	public Kvadrat(Tacka goreLevo, int stranica){
		this.goreLevo = goreLevo;
		this.stranica = stranica;
	}

	public Kvadrat(Tacka goreLevo, int stranica,String boja){
		this.goreLevo = goreLevo;
		this.stranica = stranica;
		this.boja = boja;

	}
	
	public void crtajSe(Graphics g){
		g.drawRect(getGoreLevo().getX(), getGoreLevo().getY(), getStranica(), stranica);
	}
	
	public boolean equals(Object obj){
		if (obj instanceof Kvadrat){
			Kvadrat pomocni = (Kvadrat) obj;
			if (this.goreLevo.equals(pomocni.goreLevo) && this.stranica == pomocni.stranica)
				return true;
			else 
				return false;
		}
		else 
			return false;
	}

	public Linija dijagonalaKvadrata(){
		return new Linija(goreLevo, new Tacka(goreLevo.getX() + stranica,goreLevo.getY() + stranica));
	}

	public Tacka centarKvadrata(){
		return dijagonalaKvadrata().sredinaLinije();
	}

	public int povrsina(){
		return stranica*stranica;
	}

	public int obim(){
		return 4*stranica;
	}

	public void pomeriNa(int x,int y){
		goreLevo.pomeriNa(x, y);
	}

	public void pomeriZa(int x,int y){
		goreLevo.pomeriZa(x, y);
	}

	public Tacka getGoreLevo() {
		return goreLevo;
	}
	public int getStranica() {
		return stranica;
	}
	public void setGoreLevo(Tacka goreLevo) {
		this.goreLevo = goreLevo;
	}
	public void setStranica(int stranica) {
		this.stranica = stranica;
	}


	public String toString(){
		String kvadrat = "Gornji levi ugao = (" + goreLevo.getX() + "," + goreLevo.getY() + "), stranica = " + getStranica();
		return kvadrat;
	}

}
