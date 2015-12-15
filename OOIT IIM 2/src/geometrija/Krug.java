package geometrija;

import java.awt.Graphics;

public class Krug extends PovrsinskiOblik{
	private Tacka centar;
	private int radius;


	public Krug(){

	}

	public Krug(Tacka centar, int radius){
		this.centar = centar;
		this.radius = radius;
	}

	public Krug(Tacka centar, int radius, String boja){
		this.centar = centar;
		this.radius = radius;
		this.boja = boja;

	}


	public void popuni(Graphics g) {
		g.setColor(pronadjiBoju(getBojaUnutrasnjosti()));
		g.fillOval(getCentar().getX()-radius+1, getCentar().getY() - radius+1, radius*2-2, 2*radius-2 );

	}


	public boolean sadrzi(int x, int y) {

		Tacka nova = new Tacka(x, y);


		if(nova.udaljenost(getCentar()) <= radius)
			return true;
		else
			return false;
	}

	public void crtajSe(Graphics g){
		g.setColor(pronadjiBoju(getBoja()));
		g.drawOval(getCentar().getX()-radius, getCentar().getY() - radius, radius*2, 2*radius );
	}


	public boolean equals (Object obj){
		if (obj instanceof Object){
			Krug pomocni = (Krug) obj;
			if(this.centar.equals(pomocni.centar) && this.radius == pomocni.radius)
				return true;
			else
				return false;
		}
		else
			return false;
	}
	public String toString(){
		return "Centar = (" + getCentar().getX() + "," + getCentar().getY() +"), poluprecnik = " +  radius;
	}




	public void pomeriNa(int x,int y){
		centar.pomeriNa(x, y);
	}

	public void pomeriZa(int x,int y){
		centar.pomeriZa(x, y);
	}

	public double povrsina(){
		return radius * radius * Math.PI;
	}

	public double obim(){
		return 2 * radius * Math.PI;
	}

	public Tacka getCentar() {
		return centar;
	}

	public int getRadius() {
		return radius;
	}

	public void setCentar(Tacka centar) {
		this.centar = centar;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}




}
