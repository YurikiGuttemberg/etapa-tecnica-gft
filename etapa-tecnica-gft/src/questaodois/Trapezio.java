package questaodois;

public class Trapezio implements CalculosGerais{
	private double area;
	private double baseMaior;
	private double baseMenor;
	private double altura;
	public Trapezio(double area, double baseMaior, double baseMenor, double altura) {
		this.area = area;
		this.baseMaior = baseMaior;
		this.baseMenor = baseMenor;
		this.altura = altura;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public double getBaseMaior() {
		return baseMaior;
	}
	public void setBaseMaior(double baseMaior) {
		this.baseMaior = baseMaior;
	}
	public double getBaseMenor() {
		return baseMenor;
	}
	public void setBaseMenor(double baseMenor) {
		this.baseMenor = baseMenor;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
}
