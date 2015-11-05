package geometrija;

public class Kvadrat {
	private Tacka goreLevo;
	private int stranica;
	private String boja;

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

	public String getBoja() {
		return boja;
	}

	public void setBoja(String boja) {
		this.boja = boja;
	}



}
