package complejo;

import java.util.Arrays;

public class Complejo implements Comparable<Complejo> {

	private static final int ES_MAYOR = 1;
	private static final int ES_MENOR = -1;
	private static final int ES_IGUAL = 0;
	private double real;
	private double imaginario;

	public Complejo() {
		this(0, 0);
	}

	public Complejo(double real, double imaginario) {
		setReal(real);
		setImaginario(imaginario);
	}

	@Override
	public int compareTo(Complejo o) {
		Complejo numero = (Complejo) o;
		if (this.calcularModulo() > numero.calcularModulo())
			return ES_MAYOR;
		else if (this.calcularModulo() < numero.calcularModulo())
			return ES_MENOR;
		else
			return ES_IGUAL;
	}

	public double getReal() {
		return real;
	}

	public void setReal(double real) {
		this.real = real;
	}

	public double getImaginario() {
		return imaginario;
	}

	public void setImaginario(double imaginario) {
		this.imaginario = imaginario;
	}

	public String getComplejo() {
		return "(" + this.real + " , " + this.imaginario + "i)";
	}

	public Complejo suma(Complejo sumado) {
		return new Complejo(sumado.getReal() + this.real, sumado.getImaginario() + this.getImaginario());
	}

	public Complejo suma(double real, double img) {
		return new Complejo(real + this.real, img + this.getImaginario());
	}

	public double calcularModulo(Complejo numero) {
		return Math.sqrt(Math.pow(numero.getReal(), 2) + Math.pow(numero.getImaginario(), 2));
	}

	public double calcularModulo() {
		return Math.sqrt(Math.pow(this.getReal(), 2) + Math.pow(this.getImaginario(), 2));
	}

	@Override
	public String toString() {
		return "(" + String.valueOf(getReal()) + ", " + String.valueOf(getImaginario()) + "i)";

	}

	public static void main(String[] args) {
		Complejo numero1 = new Complejo(3, 4);
		Complejo numero2 = new Complejo(4, 5);
		Complejo numero3 = new Complejo(8, 5);
		Complejo numero4 = new Complejo(3, 4);
		Complejo numero5 = new Complejo(4, 51);
		Complejo numero6 = new Complejo(8.16, 5.98);

		System.out.println("Muestro todos los metodos get del numero 1");
		System.out.println(numero1.getComplejo());
		System.out.println(numero1.getImaginario());
		System.out.println(numero1.getReal());
		
		System.out.println("Calculo  modulo del numero 1 usando los dos metodos");
		System.out.println(numero1.calcularModulo());
		System.out.println(numero1.calcularModulo(numero1));
		
		System.out.println("Sumo el numero 1 y el 2");
		System.out.println(numero1.suma(numero2));
		System.out.println(numero1.suma(4, 5));
		
		System.out.println("Cargo el array y lo muestro");
		Complejo[] lista = new Complejo[6];
		lista[0] = numero1;
		lista[1] = numero2;
		lista[2] = numero3;
		lista[3] = numero4;
		lista[4] = numero5;
		lista[5] = numero6;

		for (Complejo number : lista)
			System.out.println(number.calcularModulo());

		System.out.println("-----");
		try {
			Arrays.sort(lista);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Muestro el array ordenado");
		for (Complejo number : lista)
			System.out.println(number.calcularModulo());
	}
}
