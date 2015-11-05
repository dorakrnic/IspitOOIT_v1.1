package rekapitulacija;

public class Promenljive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int prviBroj;
		prviBroj = 7;
		int drugiBroj = 5;
		int kolicnik = prviBroj / drugiBroj;
		System.out.println(kolicnik);
		double treciBroj = 7;
		double cetvrtiBroj = 2;
		double kolicnikDouble = treciBroj / cetvrtiBroj;
		System.out.println(kolicnikDouble);
		boolean prviManjiOdDrugog;
		prviManjiOdDrugog = prviBroj < drugiBroj;
		System.out.println(prviManjiOdDrugog);
		boolean uvekTrue = true;
		System.out.println(prviManjiOdDrugog && uvekTrue);
		boolean rezultatOperacijeOR = prviManjiOdDrugog || uvekTrue;
		System.out.println(rezultatOperacijeOR);
		char a  = 'a';
		System.out.println(a);
		String ime;
		ime = "Petar";
		System.out.println(ime);
		String prezime = "Petrovic";
		System.out.println(prezime);
		System.out.println(ime +' '+prezime +" Njegos");
		
		
		

	}

}
