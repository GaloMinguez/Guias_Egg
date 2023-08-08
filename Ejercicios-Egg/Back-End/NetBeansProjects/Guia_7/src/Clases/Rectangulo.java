package Clases;


import java.util.Scanner;


public class Rectangulo {

	private double base;
	private double altura;

	public Rectangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	public Rectangulo() {
		
	}

	public void crearRectangulo(Scanner sc) {
		System.out.println("ingrese la base del rectangulo");
		base=sc.nextDouble();
		System.out.println("ingrese la altura del rectangulo");
		altura=sc.nextDouble();	
	}
	
	public double calcularSuperficie() {
		return base*altura;
	}
	public double calcularPerimetro() {
		return (base+altura)*2;
	}
	
	public void asteriscos() {
		for (int i = 0; i < altura; i++) {
			for (int j = 0; j < base; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}