package Extras;

import Clases.Puntos;
import java.util.Locale;
import java.util.Scanner;


public class Extras_2 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Puntos punto1 = new Puntos();
        punto1.crearPuntos(sc);
        System.out.println("la distancia es de: " + punto1.distancia());
        sc.close();
    }

}
