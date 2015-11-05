package rekapitulacija;

public class KontrolaToka {

	public static void main(String[] args) {
		int a = -2;
		if (a > 0)
			System.out.println("Broj je pozitivan!");
		if (a == 0)
			System.out.println("Broj je nula!");
		if (a < 0)
			System.out.println("Broj je negativan!");

		if (a > 0)
			System.out.println("Broj je pozitivan!");
		else if (a == 0)
			System.out.println("Broj je nula!");
		else 
			System.out.println("Broj je negativan!");

		int mesec = 4;
		if (mesec == 1)  
			System.out.println("Januar"); 
		else if (mesec == 2)  
			System.out.println("Februar"); 
		else if (mesec == 3)  
			System.out.println("Mart"); 
		else if (mesec == 4)  
			System.out.println("April"); 
		else if (mesec == 5)  
			System.out.println("Maj"); 
		else if (mesec == 6)  
			System.out.println("Jun"); 
		else if (mesec == 7)  
			System.out.println("Jul"); 
		else if (mesec == 8)  
			System.out.println("Avgust"); 
		else if (mesec == 9) 
			System.out.println("Septembar"); 
		else if (mesec == 10)  
			System.out.println("Oktobar"); 
		else if (mesec == 11)  
			System.out.println("Novembar"); 
		else if (mesec == 12)  
			System.out.println("Decembar"); 
		else  
			System.out.println("Uneli ste ne postojeci mesec!");

		System.out.println("Ispis prvih 10 prirodnih brojeva pomocu while petlje");
		int i = 0;
		while (i<=10){
			System.out.println(i);
			i = i + 1;
		}
		i = 10;
		while (i>=0){
			System.out.println(i--);

		}
		System.out.println("Ispis brojeva od 3 do 8 pomocu while petlje");
		i = 3;
		while (i < 9)
			System.out.println(i++);
		System.out.println("ispis prirodnih brojeva od 8 do 3 WHILE petljom");

		i = 8;
		while (i > 2){
			System.out.println(i);
			i--;
		}

		System.out.println("suma prvih 5 prirodnih brojeva WHILE petljom");
		int suma = 0;
		i = 1;
		while (i <= 5 ){
			suma = suma + i;
			i++;
		}
		System.out.println("Suma je: "+suma);
		System.out.println("racunanje i  ispis kvadrata prirodnih brojeva od 1 do 5 WHILE petljom");
		i = 1;
		int rezultat;
		while (i < 6){
			rezultat = i * i;
			System.out.println("Kvadrat broja " + i + " je " + rezultat);
			i++;
		}
		System.out.println("faktorijel broja 5 pomocu WHILE petlje");
		
		int rez = 1;
		i = 0;
		while (i >= 1){
			rez = rez * i;
			i--;
		}
		System.out.println("5! = " + rez);
		
		
		System.out.println("faktorijel broja 5 pomocu DO - WHILE petlje");
		rez = 1;
		i = 0;
		do {
			rez = rez * i;
			i--;
		}
		while (i >= 1);
		System.out.println("5! = " + rez);
		
		System.out.println("pomocu while petlje trazi broj 6 (u intervalu od 10 do 1) kad ga nadje, ispis i izlaz iz petlje (break)");
		i=10;
		while ( i > 0){
			
			if (i == 6){
				System.out.println("Nasao sam! " + i + " = 6");
				break;
			}
			System.out.println("Trazim! " + i + " je razlicit od 6");
			i--;
		}
		
		System.out.println("pomocu while petlje ispisati samo neparne brojeve (u intervalu od 1 do 10, continue)");
		i=0;
		while ( i < 10){
			i++;
			if (i % 2 == 0)
				continue;
			System.out.println("Broj " + i + " je neparan!");
		}
		
		System.out.println("Ispis brojeva od 1 do 5 for petljom: ");
		for (i=1; i<= 5; i++){
			System.out.println(i);
		}
		
		System.out.println("Ispis brojeva od 3 do 8 for petljom: ");
		for (i=3; i<= 8; i++){
			System.out.println(i);
		}
		System.out.println("Ispis brojeva od 8 do 3 for petljom: ");
		for (i=8; i>= 3; i--) 
			System.out.println(i);
		
		System.out.println("pomocu for i if ispisati sve parne brojeve od 1 do 50");
		for(i=1; i <= 50; i++){
			if( i % 2 == 0) 
				System.out.println(i);
		}
		
		int niz [] = new int [4];
		niz[0] = 10; 
		niz[1] = 20;
		niz[2] = 30;
		niz[3] = 40;
		//niz[4] = 50;
		
		System.out.println("Cetvrti elemenat niza je: "+niz[3]);
		
		for(i = 0; i<niz.length; i++){
			System.out.println(niz[i]);
		}
		
		
		
	}
}

