package punto;

public class Punto {

	private double x;
	private double y;

	public Punto() {
		this(0, 0);
	}

	public Punto(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public Punto(double xy) {
		this.x = xy;
		this.y = xy;
	}

	public Punto(Punto punto) {
		this.x = punto.getX();
		this.y = punto.getY();
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double calcularDistancia(Punto pnt1, Punto pnt2) {
		return Math.sqrt(Math.pow(pnt1.getX() - pnt2.getX(), 2) + Math.pow(pnt1.getY() - pnt2.getY(), 2));
	}
}
