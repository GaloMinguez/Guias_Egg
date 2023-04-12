package Guia_3;

import java.util.Scanner;


/**
 * Crea una aplicación que a través de una función nos convierta una cantidad de
 * euros introducida por teclado a otra moneda, estas pueden ser a dólares,
 * yenes o libras. La función tendrá como parámetros, la cantidad de euros y la
 * moneda a convertir que será una cadena, este no devolverá ningún valor y
 * mostrará un mensaje indicando el cambio (void). El cambio de divisas es: i. *
 * 0.86 libras es un 1 € ii. * 1.28611 $ es un 1 € iii. * 129.852 yenes es un 1
 * €
 *
 * @author user
 */
public class Ejer_3 {
    
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de euros");
        double monto = read.nextDouble();
        
        System.out.println("");
        System.out.println("MENU");
        System.out.println("");
        System.out.println("1- cambiar a libras");
        System.out.println("2- cambiar a dólares");
        System.out.println("3- cambiar a yenes");
        System.out.println("");
        
        int opcion = read.nextInt();
        
        String moneda="";
        switch (opcion){
            
            case 1:
                moneda="libras";
                break;
            case 2:
                moneda="dolares";
                break;
            case 3:
                moneda = "yenes";
                break;
            default:
                System.out.println("La opcion ingresada no es correcta");
            
        }
        
        cambio(monto , moneda);
        
        
    }
   
    public static void cambio(double monto, String moneda){
        
        switch(moneda){
            case "libras":
                System.out.println(monto+" euros, equivalen a " + (monto*0.86)+" "+moneda );
            break;
            case "dolares":
                System.out.println(monto+" euros, equivalen a " + (monto*1.28611)+" "+moneda );
            break;
            case "yenes":
                System.out.println(monto+" euros, equivalen a " + (monto*129.852)+" "+moneda );
            break;
                        
        }
                
    }
        
}