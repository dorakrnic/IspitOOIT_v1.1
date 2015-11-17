package geometrija;

public class Linija extends Oblik{
	private Tacka pocetna;
	private Tacka krajnja;
	
	
	
	public Linija(){

	}

	public Linija(Tacka pocetna, Tacka krajnja){
		this.pocetna = pocetna;
		this.krajnja = krajnja;
	}

	public Linija(Tacka pocetna, Tacka krajnja, String boja){
		this.pocetna = pocetna;
		this.krajnja = krajnja;
		this.boja = boja;
	}
	
	public String toString(){
		return "("+pocetna.getX()+","+pocetna.getY()+")-->("+krajnja.getX()+","+krajnja.getY()+")";
	}
	
	public Tacka sredinaLinije(){
		int sredinaX = ( getPocetna().getX() + getKrajnja().getX() ) / 2;
		int sredinaY = ( pocetna.getY() + krajnja.getY() ) / 2;
		return new Tacka(sredinaX, sredinaY);
		
	}

	public void pomeriZa(int zaX, int zaY){
		pocetna.pomeriZa(zaX, zaY);
		krajnja.pomeriZa(zaX, zaY);
	}

	public double duzina(){
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

	



}
