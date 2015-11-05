package geometrija;

public class Krug {
	private Tacka centar;
	private int radius;
	private String boja;

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

	public String getBoja() {
		return boja;
	}

	public void setBoja(String boja) {
		this.boja = boja;
	}
}
