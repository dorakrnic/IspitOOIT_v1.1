package geometrija;

public class Pravougaonik extends Kvadrat {
	private int visina;


	public Pravougaonik(){

	}

	public Pravougaonik(Tacka goreLevo, int sirina, int visina){
		super(goreLevo, sirina);
		this.visina = visina;

	}

	public Pravougaonik(Tacka goreLevo, int sirina, int visina, String boja){
		this(goreLevo, sirina, visina);
		setBoja(boja);

	}

	public boolean equals (Object obj){
		if (obj instanceof Pravougaonik) {
			Pravougaonik pocetni = (Pravougaonik) obj;
			if (this.getGoreLevo().equals(pocetni.getGoreLevo()) && this.visina == pocetni.visina && this.getStranica() == pocetni.getStranica())
				return true;
				else
					return false;
		}else
			return false;
	}
	
	public String toString(){
		return "Gornji levi ugao = "+this.getGoreLevo()+", sirina = "+getStranica()+". visina = "+getVisina();
	}

	public Linija dijagonala(){
		int xDoleDesno=getGoreLevo().getX() + getStranica();
		int yDoleDesno=getGoreLevo().getY() + visina;
		Tacka doleDesno= new Tacka(xDoleDesno,yDoleDesno);
		Linija d = new Linija(getGoreLevo(), doleDesno);
		return d;
		// moze i ovako:
		// return new Linija(goreLevo, new Tacka(goreLevo.getX() + sirina,goreLevo.getY() + visina));
	}

	public Tacka centarPravougaonika(){
		return dijagonala().sredinaLinije();
	}

	public int povrsina(){
		int p = getStranica() * visina;
		return p;
	}

	public int obim(){
		int o = 2*getStranica() + 2*visina;
		return o;
	}

	public void pomeriNa(int x,int y){
		getGoreLevo().pomeriNa(x, y);
	}

	public void pomeriZa(int x,int y){
		getGoreLevo().pomeriZa(x, y);
	}


	
	public int getVisina(){
		return visina;
	}


	public void setVisina(int novaVisina){
		visina = novaVisina;


	}



}
