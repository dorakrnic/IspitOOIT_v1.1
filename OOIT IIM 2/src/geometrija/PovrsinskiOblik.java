package geometrija;

import java.awt.Graphics;

public abstract class PovrsinskiOblik extends Oblik{
	protected String bojaUnutrasnjosti = "zelena";
	
	public abstract void popuni(Graphics g);
	private boolean popunjen;
	public abstract boolean sadrzi(int x, int y);
	public abstract double obim();
	public abstract double povrsina();

	public String getBojaUnutrasnjosti() {
		return bojaUnutrasnjosti;
	}

	public void setBojaUnutrasnjosti(String bojaUnutrasnjosti) {
		this.bojaUnutrasnjosti = bojaUnutrasnjosti;
	}
	
	public boolean isPopunjen(){
		return popunjen;
	}
	
	public void setPopunjen(boolean popunjen){
		this.popunjen=popunjen;
	}
	
}
