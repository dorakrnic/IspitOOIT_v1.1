package geometrija;

public class Tacka {
	private int x;
	private int y;
	private String boja;
	
	public Tacka(){
		
	}
	
	public Tacka(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public Tacka(int x, int y, String boja){
		this.x = x;
		this.y = y;
		this.boja = boja;
	}
	
	public String toString(){
		return "("+getX()+","+getY()+")";
		 		
	}
	
	public void pomeriNa(int naX, int naY){
		x = naX;
		y = naY;

	}
	
	public void pomeriZa(int zaX,int zaY){
		x = x + zaX;
		y = y + zaY;
	}
	
	public double udaljenost(Tacka t){
		int dx = x - t.getX();
		int dy = y - t.y;
		double d = Math.sqrt(dx*dx+dy*dy);
		return d;
	}
	
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}
	
	public void setX(int novoX){
		x = novoX;
	}
	
	public void setY(int novoY){
		y = novoY;
	}

	public String getBoja() {
		return boja;
	}

	public void setBoja(String boja) {
		this.boja = boja;
	}

}
