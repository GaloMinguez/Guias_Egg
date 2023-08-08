package Guia_3;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class Ejer_4 {

    /**
     * Crea una aplicación que nos pida un número por teclado y con una función
     * se lo pasamos por parámetro para que nos indique si es o no un número
     * primo, debe devolver true si es primo, sino false. Un número primo es
     * aquel que solo puede dividirse entre 1 y sí mismo. Por ejemplo: 25 no es
     * primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo.
     *
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        int num = leer.nextInt();

        System.out.println(" el numero ingresado es primo ? : " + primo(num));       

    }

    public static boolean primo(int num) {
        boolean aux;
        if ((num == 1) || (num == 2) || (num == 3)) {
            aux = true;
        } else if ((num % 2 == 0) || (num % 3 == 0)) {
            aux = false;
        } else {
            aux = true;
        }
        return aux;
    }

}

/*
public static boolean esPrimo(int num) {
    if (num <= 1) {
        return false;
    }
    if (num == 2) {
        return true;
    }
    if (num % 2 == 0) {
        return false;
    }
    int raiz = (int) Math.sqrt(num);
    for (int i = 3; i <= raiz; i += 2) {
        if (num % i == 0) {
            return false;
        }
    }
    return true;
}
Este método devuelve true si el número es primo y false en caso contrario.
*/