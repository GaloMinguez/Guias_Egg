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
public class Ejemplo_9 {
    
    public static void main(String[] args) {
       
        //se declara el scanner
        Scanner leer = new Scanner(System.in);
      
        //Se declaran las variables
        double cantidad = 5;
        String numCadena = "";
        String num;
        double valorCadena;
    
        for (double j = 0; j < cantidad; j++) {
            System.out.println("Ingrese un número");
            num = leer.next();
            numCadena += num;
            
        }
        
        for (int i = 0; i < cantidad; i++) {
            
            System.out.print(Integer.valueOf(numCadena.substring(i, i+1)));
            
            for (double j = 0; j < Integer.valueOf(numCadena.substring(i, i + 1)) ; j++) {
               
            System.out.print("*");
            }
            
            System.out.println();
        }
        
    }
   
}
