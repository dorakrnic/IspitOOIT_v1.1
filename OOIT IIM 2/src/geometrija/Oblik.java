package geometrija;

import java.awt.Color;
import java.awt.Graphics;

public abstract class Oblik {
	
	protected String boja;
	private boolean selektovan;
	
	public abstract void crtajSe(Graphics g);
	
	public static Color pronadjiBoju(String boja){
		if(boja.equalsIgnoreCase("bela"))
			return Color.white;
		else if(boja.equalsIgnoreCase("zuta"))
			return Color.yellow;
		else if(boja.equalsIgnoreCase("zelena"))
			return Color.green;
		else if(boja.equalsIgnoreCase("crvena"))
			return Color.red;
		else if(boja.equalsIgnoreCase("plava"))
			return Color.blue;
		else if(boja.equalsIgnoreCase("roza"))
			return Color.magenta;
		else
			return Color.black;
	}

	public String getBoja() {
		return boja;
	}

	public void setBoja(String boja) {
		this.boja = boja;
	}

	public boolean isSelektovan() {
		return selektovan;
	}

	public void setSelektovan(boolean selektovan) {
		this.selektovan = selektovan;
	}
	

}
