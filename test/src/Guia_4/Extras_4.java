package Guia_4;

import java.util.Scanner;

public class Extras_4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        int arreglo[] = new int[10];
        int aprobados, desaprobados;
        aprobados = 0;
        desaprobados = 0;

        for (int i = 0; i < 10; i++) {

            int prom, nota1, nota2, nota3, nota4;

            System.out.println("ingrese la nota del primer TP del alumno " + i);
            nota1 = leer.nextInt();

            System.out.println("ingrese la nota del segundo TP del alumno " + i);
            nota2 = leer.nextInt();

            System.out.println("ingrese la nota del primer integrador del alumno " + i);
            nota3 = leer.nextInt();

            System.out.println("ingrese la nota del segundo integrador del alumno " + i);
            nota4 = leer.nextInt();

            prom = (int) (nota1 * 0.1 + nota2 * 0.15 + nota3 * 0.25 + nota4 * 0.50);

            arreglo[i] = prom;

        }

        for (int i = 0; i < 10; i++) {

            if (arreglo[i] >= 7) {
                aprobados += 1;

            } else {
                desaprobados += 1;

            }
        }

        System.out.println("la cantidad de alumnos aprobados es = " + aprobados);
        System.out.println("\nla cantidad de alumnos desaprobados es = " + desaprobados);

    }

}
