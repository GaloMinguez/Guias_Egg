/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Scanner;

/**
 *
 * @author Galo Minguez
 */
public class Test {

public static void main(String[] args) {
    int numero = 10;
      
   
   int num;
   
   num = numero++;
   
   System.out.println("Hola Mundo");
   System.out.print("Hola ");
   System.out.print("Mundo      ");
   
   
   System.out.println("La variable tiene el valor de: " + num);
    System.out.println(numero);
  // sout + tab = System.out.println("");
  
  Scanner leer = new Scanner(System.in);
          
          String nombre;
          
          System.out.println("ingresa nombre");
          
          nombre = leer.next ();
          
          System.out.println("hola mundo! soy " + nombre + " y todos me la pelan ");

          
}
}