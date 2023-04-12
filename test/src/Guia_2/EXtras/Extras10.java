package Guia_2.EXtras;

import java.util.Scanner;

public class Extras10 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int num1;
        num1 = (int) (Math.random() * 11);
        int num2;
        num2 = (int) (Math.random() * 11);
        int mult = num1 * num2;
        int num;
        
        System.out.println(mult);

        System.out.println("ADIVINE EL NUMERO");

        do {

            num = leer.nextInt();

            if (num != mult) {
                System.out.println("INCORRECTO \n Intente nuevamente");

            }

        } while (num != mult);
        
        System.out.println("ACERTO \n FELICIDADES");
    }
}
