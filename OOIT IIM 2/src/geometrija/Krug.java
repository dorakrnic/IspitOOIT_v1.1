package geometrija;

public class Krug extends Oblik{
	private Tacka centar;
	private int radius;
	

	public Krug(){

	}

	public Krug(Tacka centar, int radius){
		this.centar = centar;
		this.radius = radius;
	}
	
	public Krug(Tacka centar, int radius, String boja){
		this.centar = centar;
		this.radius = radius;
		this.boja = boja;
	
	}
	public String toString(){
		return "Centar = (" + getCentar().getX() + "," + getCentar().getY() +"), poluprecnik = " +  radius;
	}
	
	
	

	public void pomeriNa(int x,int y){
		centar.pomeriNa(x, y);
	}

	public void pomeriZa(int x,int y){
		centar.pomeriZa(x, y);
	}

	public double povrsina(){
		return radius * radius * Math.PI;
	}

	public double obim(){
		return 2 * radius * Math.PI;
	}

	public Tacka getCentar() {
		return centar;
	}

	public int getRadius() {
		return radius;
	}

	public void setCentar(Tacka centar) {
		this.centar = centar;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	
}
