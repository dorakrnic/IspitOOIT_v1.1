package geometrija;

public class PrviTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub



		Kvadrat k = new Kvadrat(new Tacka (10, 5) , 7);
		Krug kr = new Krug(new Tacka(2, 4), 8);
		Linija lin = new Linija(new Tacka (3, 7), new Tacka(9,  4));
		Pravougaonik p = new Pravougaonik(new Tacka(15, 20), 25, 30);
		Tacka t2 = new Tacka(5, 8);
		// 5. grupa 

		//1. zadatak

		k.getGoreLevo().setY(kr.getRadius() - lin.getPocetna().getX());

		//2.zadatak

		/*
			public Pravougaonik (Tacka goreLevo, int sirina, int visina){
			super ( goreLevo, sirina);
			this.visina = visina;
		}
		 */

		/* 3. zadatak
		 * 
		 public class Automobil{

		 private boolean u;
		 private int brzina;
		 private int jacinaGasa;

		 public boolean getU(){
		 	return u;
		 }

		 public void uvecajJacinaGasa(){
		 if (jacinaGasa<100)
		 jacinaGasa++;
		 	else 
		 		System.out.println("Gas do daske");
		}
		 */

		//VI grupa

		//1. zadatak

		lin.getKrajnja().setX(p.getStranica() + lin.getPocetna().getY());

		//2. zadatak

		/*
		public Pravougaonik(Tacka goreLevo, int sirina, int visina, String boja){
			super(goreLevo, sirina, boja);
			this.visina = visina;
		}

		//3. zadatak

		public class Automobil{
			private boolean upaljen;
			private int brzina;
			private int jacinaGasa;

			public int getBrzina(){
				return brzina;
			}

			public void smanjiBrzinu(){
				if(brzina>0){
					brzina--;
				}
				else
					System.out.println("Vec stojimo!");
			}
		 */ 
		//7. Zadatak
		lin.getKrajnja().setX(p.getGoreLevo().getX() + t2.getY());

		//8.Zadatak

		/*
				 public Krug(Tacka centar , int radius , String boja){
				 Super(boja);
				 this.radius = radius;
				 this.centar = centar;
				 }
		 */

		//9.zadatak
		/*
				public class Televizor{
				private boolean ukljucen;
				private int kanal;
				private int jacinaTona;

				private boolean isUkljucen(){
				return ukljucen;
				}

				public void uvecajKanal(){
					if(kanal<99){
						kanal++;
				}
					else
						kanal = 1;

				}

				}
		 */
}
}


