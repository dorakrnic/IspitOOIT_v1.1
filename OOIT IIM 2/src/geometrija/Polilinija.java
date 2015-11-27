package geometrija;

public class Polilinija {
	private Linija [] segmenti;
	private int index = 0;
	
	public Polilinija(int brojSegmenata){
		segmenti = new Linija [brojSegmenata];
	}
	
	public double duzina (){
		double duzina=0.0;
		for (int i = 0; i<segmenti.length; i++){
			duzina = duzina + segmenti[i].duzina();
		}
		return duzina;
	}
	
	
	public void ukloniSegment(){
		if (index>0){
			index--;
			segmenti[index] = null;
		}
		else
			System.out.println("Ne postoji nijedan segment!");
	}
	
	public void dodajSegment(Linija segment){
		if(index<segmenti.length){
			if (index == 0){
				segmenti[index] = segment;
				index++;
			}
			else
				if(segmenti[index-1].getKrajnja().equals(segment.getPocetna())){
					segmenti[index] = segment;
					index++;
				}
				else
					System.out.println("Uneta linija ne moze da se poveze u poliliniju!");
			
		}
		else
			System.out.println("Niz je pun!");
	}

	public Linija[] getSegmenti() {
		return segmenti;
	}

	public void setSegmenti(Linija[] segmenti) {
		this.segmenti = segmenti;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}
	
}
