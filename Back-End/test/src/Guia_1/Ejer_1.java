package Guia_1;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Galo Minguez
 */
public class Ejer_1 {

    public static void main(String[] args) {
        
        Scanner leer;
        leer = new Scanner(System.in);
        
         int num1;
         int num2;
         int sum;
         
         System.out.println("ingresar num1");
         num1 = leer.nextInt();
         
         System.out.println("ingresar num2");
         num2 = leer.nextInt();
         
         sum = num1 + num2;
              ;
          System.out.println("la suma de los numeros ingresados es = " + sum);
    }
   
    
}
