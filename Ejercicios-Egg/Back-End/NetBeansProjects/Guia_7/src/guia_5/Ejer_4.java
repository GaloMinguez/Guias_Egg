package guia_5;


import Clases.Rectangulo;
import java.util.Locale;
import java.util.Scanner;


public class Ejer_4 {

	public static void main(String[] args) {
            
		Locale.setDefault(Locale.US);
                
		Scanner sc = new Scanner(System.in);

		Rectangulo rec = new Rectangulo();

		rec.crearRectangulo(sc);

		System.out.println("la superficie del rectangulo es de : " + rec.calcularSuperficie());
		System.out.println("el perimetro del rectangulo es de : " + rec.calcularPerimetro());

		rec.asteriscos();
                
        }
}


