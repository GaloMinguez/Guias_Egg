/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia_2;

import java.util.Scanner;

/**
 *
 * @author Galo Minguez
 */
public class Ejemplo_8 {
    
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int contador = 0;
        int num;
        int sumador = 0;
        do {
            System.out.println("Ingresa un número");
            num = leer.nextInt();
            contador++;
            if(num<0){
                continue;
            }
            sumador += num;
            if (num == 0) {
                System.out.println("Se capturó un 0");
                break;
            }
        } while (contador < 20);
        System.out.println(sumador);

    }
}