package questaodois;

public class Triangulo implements CalculosGerais{
 private double area;
 private double altura;
public Triangulo(double area, double altura) {
	super();
	this.area = area;
	this.altura = altura;
}
public double getArea() {
	return area;
}
public void setArea(double area) {
	this.area = area;
}
public double getAltura() {
	return altura;
}
public void setAltura(double altura) {
	this.altura = altura;
}

}
