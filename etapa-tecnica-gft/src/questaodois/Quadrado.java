package questaodois;

public class Quadrado implements CalculosGerais {
	private double area;
	private double ladoUm;
	private double ladoDois;

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public double getLadoUm() {
		return ladoUm;
	}

	public void setLadoUm(double ladoUm) {
		this.ladoUm = ladoUm;
	}

	public double getLadoDois() {
		return ladoDois;
	}

	public void setLadoDois(double ladoDois) {
		this.ladoDois = ladoDois;
	}

	public Quadrado(double area, double ladoUm, double ladoDois) {
		this.area = area;
		this.ladoUm = ladoUm;
		this.ladoDois = ladoDois;
	}

}
