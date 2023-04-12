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


public class IfSimple {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la edad del usuario");
        int edad = leer.nextInt();
        
        if(edad > 18){
            
            System.out.println("Es mayor de edad");
            
            
        }

        
    }

}