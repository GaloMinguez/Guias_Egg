package Guia_2;

import java.util.Scanner;

/**
 * @author Galo Minguez
 */
public class Ejer_8 {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
                
        
        int num;
        System.out.println("ingrese orden de la matriz");
        num = leer.nextInt();
        
        System.out.println("\n\n\n");
        
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
             
                if(j==1 | j == num | i==1 | i==num){
                 System.out.print(" *");
                 
             }else{
                    System.out.print("  ");
                     } 
                
            }
            System.out.println("");
        }
        
    }
    
}
