/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplos_de_Estructura_Repetitivas;

/**
 *
 * @author Galo Minguez
 */
import java.util.Scanner;

public class IfAnidado {

    public static void main(String[] args) {
        
         //Nos interesa que el usuario ingrese un numero y saber si es 0 o par o impar
        
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        int numero = leer.nextInt();

        if (numero == 0) {

            System.out.println("Es cero");

        } else if(numero % 2 == 0) {

            System.out.println("Es par");

        }else{
            
            System.out.println("Es impar");
            
        }

    }

}