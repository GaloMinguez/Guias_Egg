package Clases;

import java.util.Scanner;

public class Operaciones {

    private double numero1;
    private double numero2;

    public Operaciones(int numero1, int numero2) {

        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public Operaciones() {

    }

    public int getNumero1() {
        return (int) numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return (int) numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public void crearOperacion(int num1, int num2, Scanner sc) {
        System.out.println("ingrese el primer numero");
        num1 = sc.nextInt();
        System.out.println("ingrese el segundo numero");
        num2 = sc.nextInt();
        numero1 = num1;
        numero2 = num2;

    }

    public int sumar() {
        return (int) (numero1 + numero2);
    }

    public int restar() {
        return (int) (numero1 - numero2);
    }

    public int multiplicar() {
        if (numero2 == 0 || numero1 == 0) {
            System.out.println("no se puede multiplicar por cero");
            return 0;
        } else {
            return (int) (numero1 * numero2);
        }

    }

    public double dividir() {
        if (numero2 == 0 || numero1 == 0) {
            System.out.println("no se puede dividir por cero");
            return 0;
        } else {
            return numero1 / numero2;
        }

    }

}
