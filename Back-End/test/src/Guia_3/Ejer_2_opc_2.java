
package Guia_3;

import java.util.Scanner;

/**
 * Diseñe una función que pida el nombre y la edad de N personas e imprima los
 * datos de las personas ingresadas por teclado e indique si son mayores o
 * menores de edad. Después de cada persona, el programa debe preguntarle al
 * usuario si quiere seguir mostrando personas y frenar cuando el usuario
 * ingrese la palabra “No”.
 *
 * @author user
 */
public class Ejer_2_opc_2 {

    public static void main(String[] args) {

        String seguir = "yes";

        while (!seguir.equalsIgnoreCase("no")) {

            evaluar();

            Scanner read = new Scanner(System.in);
            System.out.println("Desea continuar? (si/no)");
            seguir = read.next();

        }

    }

    /**
     *
     */
    public static void evaluar() {

        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la persona");
        String name = read.next();
        System.out.println("Ingrese la edad");
        int age = read.nextInt();

        if (age > 17) {
            System.out.println(name + " es mayor de edad.");
        } else {
            System.out.println(name + " es menor de edad.");
        }

    }
    
}