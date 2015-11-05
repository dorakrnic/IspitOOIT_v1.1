package rekapitulacija;

public class Test {

	public static void main(String[] args) {
		//		// TODO Auto-generated method stub
		//
		//		System.out.println("1. zadatak V grupa");
		//		int i = 7;
		//		for (i = 7;i>4;i--)
		//			System.out.println(i);
		//
		//		System.out.println("1. zadatak VI grupa");
		//		i = 1;
		//		int sum = 0;
		//		while (i<= 3) {
		//			sum = i + 1;
		//			i++;
		//		}
		//		System.out.println(sum);
		//
		//		System.out.println("2. zadatak V grupa");
		//		i = 4;
		//		if (i == 2)
		//			System.out.println("Broj je jednak 2!");
		//
		//		System.out.println("2. zadatak VI grupa");
		//		for (int p = 1; p<= 6; p++) {
		//			if (p % 2 == 0) {
		//				System.out.println("Broj " + p + " je paran.");
		//				continue;
		//			}
		//			System.out.println("Broj " + p + " je neparan.");
		//		}
		//
		//		System.out.println("3. zadatak V grupa");
		//		i = 1;
		//		while (i<= 10) {
		//			if (i == 5) {
		//				System.out.println("Nasao sam broj 5.");
		//				break;
		//			}
		//			i++;
		//		}
		//
		//		System.out.println("3. zadatak VI grupa");
		//		i = 1;
		//		while (i < 6)
		//			System.out.println(i++);
		//		
		//		System.out.println("4. zadatak V grupa");
		//		int niz [] = {10,20,30,40,50};
		//		System.out.println(niz[4]);
		//		
		//		System.out.println("4. zadatak VI grupa");
		//		i = 4;
		//		if (i<2)
		//			System.out.println("broj je manji od dva!");
		//		
		//		System.out.println("5. zadatak V grupa");
		//		i = 1;
		//		sum = 1;
		//		while (i<= 3) {
		//			sum = i + i;
		//			i++;
		//		}
		//		System.out.println(sum);
		//		
		//		System.out.println("5. zadatak VI grupa");
		//		int niz2 [] = {10,20,30,40,50};
		//		System.out.println(niz2[4]);
		//		
		//
		//
		//int zbir = sabiranje(5, 6);
		//System.out.println(zbir);
		
		System.out.println(povrsinaKruga(10));
		
		konobar();
		double racun = konobarDonesi("nes", "fanta");
		System.out.println(racun);

	}

	public static double sabiranje(double x, double y){
		double zbir = x + y;
		return zbir;
	}

	public static double povrsinaKruga(int r){
		double povrsina = r * r * Math.PI;
		return povrsina;
	}
	
	public static void konobar(){
		System.out.println("Dobar dan izvolite!");
	}
	
	public static double konobarDonesi(String kafa, String sok){
		double racun = 0;
		double nes = 80.99;
		double fanta = 150.99;
		
		if(kafa.equalsIgnoreCase("nes") && sok.equalsIgnoreCase("fanta")){
			System.out.println("U redu Vas racun ce iznositi: ");
			racun  = sabiranje(nes, fanta);
			
		}
		return racun;
	}


}
