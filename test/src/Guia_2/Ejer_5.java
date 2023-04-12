package Guia_2;

import java.util.Scanner;

/**
 * @author Galo Minguez
 */
public class Ejer_5 {
    
    public static void main(String[] args) {
        
       Scanner leer = new Scanner(System.in);
               
       System.out.println("ingrese el limite de la suma de los numeros a ingresar");
       
       int Limite;
        Limite = leer.nextInt();
       
        int suma;
       suma=0;
       
        for (int i = 0; i < Limite;) {
            
            System.out.println("ingrese numeros a sumar");
            int num = leer.nextInt();
            
            i = i + num;
           
           suma = i;
        }
        
        System.out.println("la suma total de los numeros es = " + suma);
       
    }
    
}
