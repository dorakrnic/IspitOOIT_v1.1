package geometrija;

import java.awt.Graphics;

public class Tacka extends Oblik {
	private int x;
	private int y;


	public Tacka(){

	}

	public Tacka(int x, int y){
		this.x = x;
		this.y = y;
	}

	public Tacka(int x, int y, String boja){
		this.x = x;
		this.y = y;
		this.boja = boja;
	}

	public void crtajSe(Graphics g){
		g.drawLine(x-2, y, x+2, y);
		g.drawLine(x, y-2, x, y+2);		
	}

	public boolean equals(Object obj){
		if (obj instanceof Tacka){
			Tacka pomocna = (Tacka) obj;
			if (this.x == pomocna.x && this.y == pomocna.y )
				return true;
			else
				return false;

		}
		else
			return false;
	}

	public String toString(){
		return "("+getX()+","+getY()+")";

	}

	public void pomeriNa(int naX, int naY){
		this.x = naX;
		this.y = naY;

	}

	public void pomeriZa(int zaX,int zaY){
		x = x + zaX;
		y = y + zaY;
	}

	public double udaljenost(Tacka t){
		int dx = x - t.getX();
		int dy = y - t.y;
		double d = Math.sqrt(dx*dx+dy*dy);
		return d;
	}

	public int getX(){
		return x;
	}

	public int getY(){
		return y;
	}

	public void setX(int novoX){
		x = novoX;
	}

	public void setY(int novoY){
		y = novoY;
	}



}
