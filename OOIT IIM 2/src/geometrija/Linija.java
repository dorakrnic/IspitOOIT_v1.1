package geometrija;

public class Linija {
	private Tacka pocetna;
	private Tacka krajnja;
	private String boja;
	
	public void pomeriZa(int zaX, int zaY){
		pocetna.pomeriZa(zaX, zaY);
		krajnja.pomeriZa(zaX, zaY);
	}
	
	public double duzina(String milos){
		double duzina = pocetna.udaljenost(krajnja);
		return duzina;
	}
	
	public Tacka getPocetna() {
		return pocetna;
	}
	public Tacka getKrajnja() {
		return krajnja;
	}
	public void setPocetna(Tacka novaPocetna) {
		pocetna = novaPocetna;
	}
	public void setKrajnja(Tacka novaKrajnja) {
		krajnja = novaKrajnja;
	}

	public String getBoja() {
		return boja;
	}

	public void setBoja(String boja) {
		this.boja = boja;
	}
	
	

}
