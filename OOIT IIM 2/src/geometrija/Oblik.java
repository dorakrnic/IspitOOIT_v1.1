package geometrija;

import java.awt.Color;
import java.awt.Graphics;

public abstract class Oblik implements Pomerljiv {
	
	protected String boja;
	private boolean selektovan;
	protected Color color;
	public abstract boolean sadrzi(int x, int y) ;
	private int stranica;
	private int visina;
	private int radius;
	private String type;
	private double duzina;
	
	public abstract void crtajSe(Graphics g);
	
	public static Color pronadjiBoju(String boja){
		if(boja.equalsIgnoreCase("bela")||boja.equalsIgnoreCase("white"))
			return Color.white;
		else if(boja.equalsIgnoreCase("zuta")||boja.equalsIgnoreCase("yellow"))
			return Color.yellow;
		else if(boja.equalsIgnoreCase("zelena")||boja.equalsIgnoreCase("green"))
			return Color.green;
		else if(boja.equalsIgnoreCase("crvena")||boja.equalsIgnoreCase("red"))
			return Color.red;
		else if(boja.equalsIgnoreCase("plava")||boja.equalsIgnoreCase("blue"))
			return Color.blue;
		else if(boja.equalsIgnoreCase("roza")||boja.equalsIgnoreCase("magenta"))
			return Color.magenta;
		else if(boja.equalsIgnoreCase("ljubicasta")||boja.equalsIgnoreCase("violet")||boja.equalsIgnoreCase("darkviolet"))
			return Color.magenta.darker();
		else
			return Color.black;
	}

	public String getBoja() {
		return boja;
	}
	
	public void setBoja(String boja) {
		this.boja = boja;
	}
	
	public Color getColor(){
		return color;
	}

	public void setColor(Color boja){
		this.color=boja;
	}
	

	public boolean isSelektovan() {
		return selektovan;
	}

	public void setSelektovan(boolean selektovan) {
		this.selektovan = selektovan;
	}
	
	public int getStranica(){
		return stranica;
	}
	public void setStranica(int stranica){
		this.stranica=stranica;
	}
	public int getRadius(){
		return stranica;
	}
	public void setRadius(int stranica){
		this.radius=stranica;
	}
	public int getVisina(){
		return visina;
	}
	public void setVisina(int visina){
		this.visina=visina;
	}
	
	public String typeToString(){
		return type;
	}
	
	public double duzina(){
		return duzina;
	}
	public void setDuzina(int duzina){
		this.duzina=duzina;
	}

}
