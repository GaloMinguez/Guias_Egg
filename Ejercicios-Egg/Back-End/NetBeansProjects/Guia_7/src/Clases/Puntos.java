package Clases;

import java.util.Scanner;

public class Puntos {

    private double x1, x2;
    private double y1, y2;

    public Puntos() {

    }

    public void crearPuntos(Scanner sc) {
        System.out.println("ingrese el primer punto");
        x1 = sc.nextDouble();
        y1 = sc.nextDouble();
        System.out.println("ingrese el segundo punto");
        x2 = sc.nextDouble();
        y2 = sc.nextDouble();
    }

    public double distancia() {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

}
