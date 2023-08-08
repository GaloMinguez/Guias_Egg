package Extras;

import Clases.Rectangulo_7;
import java.util.Scanner;

public class Extras_7 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Rectangulo_7 rectangulo = new Rectangulo_7();
        
        System.out.println("ingrese los lados del rectangulo para calcular el Area");
        System.out.print("Lado 1 = ");
        rectangulo.setLado1(leer.nextInt());
        System.out.print("Lado 2 = ");
        rectangulo.setLado2(leer.nextInt());
        
        System.out.println("el area es = " + rectangulo.calcularArea());
        
    }
    
}
