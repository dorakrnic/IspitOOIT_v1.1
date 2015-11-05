package geometrija;

public class Testiranje {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tacka t1 = new Tacka();
		
		System.out.println("X koordinata t1 je: "+t1.getX());
		System.out.println("Y koordinata t1 je: "+t1.getY());
		
		t1.setX(5);
		t1.setY(15);
		
		System.out.println("nova X koordinata t1 je: "+t1.getX());
		System.out.println("nova Y koordinata t1 je: "+t1.getY());
		
		t1.pomeriNa(50, 25);
		
		System.out.println("nova X koordinata t1 nakon pomeranja NA je: "+t1.getX());
		System.out.println("nova Y koordinata t1 nakon pomeranja NA je: "+t1.getY());
		
		t1.pomeriZa(10, 7);
		
		System.out.println("nova X koordinata t1 nakon pomeranja ZA je: "+t1.getX());
		System.out.println("nova Y koordinata t1 nakon pomeranja ZA je: "+t1.getY());
		
		t1.setX(3);
		t1.setY(3);
		Tacka t2 = new Tacka();
		t2.setX(6);
		t2.setY(4);
		System.out.println("Udaljenost izmedju tacaka t1 i t2 je: "+t2.udaljenost(t1));
		
	
		
		Linija l1 = new Linija();
		l1.setPocetna(t1);
		l1.setKrajnja(t2);
		
		System.out.println("X koordinata pocetne tacke linije je: "+l1.getPocetna().getX());
		l1.getPocetna().setX(12);
		System.out.println("X koordinata pocetne tacke linije je: "+l1.getPocetna().getX());
		// postaviti X koordinatu krajnje tacke linije na vrednost Y koordinate  pocetne tacke linije
		l1.getKrajnja().setX(l1.getPocetna().getY());
		
		System.out.println("X koordinata krajnje tacke linije: "+l1.getKrajnja().getX());
		// postaviti Y koordinatu pocetne tacke linije na vrednost Y koordinate  krajnje tacke linije uvecanu za 10
		l1.getPocetna().setY(l1.getKrajnja().getY()+10);
		System.out.println("y koordinata pocetne tacke linije: " + l1.getPocetna().getY());
		
		// Postaviti X koordinatu pocetne tacke linije na vrednost proizvoda X koordinate tacke t2 i  
		// Y koordinate krajnje tacke linije umanjenog za razliku vrednosti X koordinate pocetne tacke linije i broja 2
		
		
		l1.getPocetna().setX(  (t2.getX() * l1.getKrajnja().getY() ) -  (l1.getPocetna().getX() - 2 ) );
		
		System.out.println("X koordinata pocetne tacke linije je: " +l1.getPocetna().getX() );
		
		Pravougaonik p1 = new Pravougaonik();
		p1.setVisina(15);
		p1.setSirina(30);
		p1.setGoreLevo(t1);
		System.out.println("Visina pravougaonika je: " +p1.getVisina());
		System.out.println("Sirina pravougaonika je: " +p1.getSirina());
		System.out.println("X koordinata tacke GoreLevo je: " + p1.getGoreLevo().getX());
		System.out.println("Y koordinata tacke GoreLevo je: " + p1.getGoreLevo().getY());
		
		
		Kvadrat kv1 = new Kvadrat();
		kv1.setStranica(30);
		kv1.setGoreLevo(t2);
		kv1.getGoreLevo().setX(10);
		kv1.getGoreLevo().setY(17);
		kv1.pomeriNa(10, 17);
		System.out.println("X koordinata tacke GoreLevo kvadrata je: " + kv1.getGoreLevo().getX());
		System.out.println("Y koordinta tacke GoreLevo kvadrata je: " + kv1.getGoreLevo().getY());
		System.out.println("povrsina kvadrata je: " + kv1.povrsina());
		System.out.println("obim kvadrata je: "+ kv1.obim());
		System.out.println("povrsina pravougaonika je: " + p1.povrsina());
		System.out.println("obim pravougaonika je: " + p1.obim());
		
		Krug k1 = new Krug();
		k1.setRadius(18);
		k1.setCentar(kv1.getGoreLevo());
		System.out.println("Povrsina kruga je: "+k1.povrsina());
		System.out.println("Obim kruga je: "+k1.obim());
		k1.setCentar(l1.getKrajnja());
		System.out.println("x koordinata centra je: " + k1.getCentar().getX());
		System.out.println("y koordinata centra je: " + k1.getCentar().getY());
		k1.pomeriZa(10, 15);
		System.out.println("x koordinata centra je: " + k1.getCentar().getX());
		System.out.println("y koordinata centra je: " + k1.getCentar().getY());
		
		//postaviti vrednost X koordinate tacke goreLevo pravougaonika na vrednost povrsine kruga
		
		p1.getGoreLevo().setX((int)k1.povrsina());
		System.out.println("Vrednost X koordinate tacke goreLevo pravougaonika je: "+p1.getGoreLevo().getX());
		
		
	}

}
