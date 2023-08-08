package Guia_2;

import java.util.Scanner;

/**
 * @author Galo Minguez
 */
public class Ejer_6 {
     
    public static void main(String[] args) {
        
         Scanner leer = new Scanner(System.in);
        
        System.out.println("ingrese 2 numeros a trabajar");
        System.out.println("1er Numero");
        int num1 = leer.nextInt();
        System.out.println("2do Numero");
        int num2 = leer.nextInt();
        int opcion;
        String confirma;
        boolean Bandera = true;
        
        
        do{
        
        System.out.println("Menu");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");
        
        System.out.println("");
        
        System.out.println("Elija opcion");
        
        opcion = leer.nextInt();
        
        switch  (opcion){
            
            case 1:
                //suma
                int suma = num1 + num2;
                System.out.println("la suma de los numeros ingresados es = " + suma);
                
                break;
            case 2:
                //resta
                int resta = num1 - num2;
                System.out.println("la resta de los numeros ingresados es = " + resta);
                
                break;
            case 3:
                //multiplicación
                int mult = num1 * num2;
                System.out.println("la multiplicación de los numeros ingesados es = " + mult);
                
                break;
            case 4:
                //division
                int div = num1 / num2;
                System.out.println("el división de los numeros ingresados en = " + div);
                
                break;
            case 5:
                //salir
                System.out.println("Esta seguro que desea salir? (s/n)");
                confirma = leer.next();
                
                if ("s".equals(confirma)){
                    Bandera = false;
                    
                }
            
            }
            
        } while(Bandera);
            
     } 
    
 }   

        
        
        
    
       
