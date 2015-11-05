package geometrija;

public class Pravougaonik {

	private  Tacka goreLevo;
	private int sirina;
	private int visina;
	private String boja;

	public int povrsina(){
		int p = sirina * visina;
		return p;
	}

	public int obim(){
		int o = 2*sirina + 2*visina;
		return o;
	}

	public void pomeriNa(int x,int y){
		goreLevo.pomeriNa(x, y);
	}

	public void pomeriZa(int x,int y){
		goreLevo.pomeriZa(x, y);
	}

	public Tacka getGoreLevo(){
		return  goreLevo;
	}
	public int getSirina(){
		return sirina;
	}

	public int getVisina(){
		return visina;
	}

	public void setGoreLevo(Tacka t){
		goreLevo = t;
	}

	public void setSirina(int sirina){
		this.sirina = sirina;
	}
	public void setVisina(int novaVisina){
		visina = novaVisina;


	}

	public String getBoja() {
		return boja;
	}

	public void setBoja(String boja) {
		this.boja = boja;
	}


}
