package Guia_2;

import java.util.Scanner;

/**
 *
 * @author Galo Minguez
 */
public class Ejer_7_codigo_FDE {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        
        String cadena;
        String x;
        x ="x";
        String o;
        o = "o";
        String sal;
        sal = "&&&&&";
        int CantCorrect;
        CantCorrect=0;
        int CantIncorrect;
        CantIncorrect=0;
        int longitud;
        boolean Bandera;
        Bandera = true;
        
        do{
            System.out.println("Ingrese el CODIGO");
            cadena = leer.next();
            if((longitud = cadena.length()) == 5){
                
                if((cadena.substring(0 ,1).equals(x)) && cadena.substring(4,5).equals(o)){
                    
                   System.out.println("CORRECTO");
                   CantCorrect++;
                    
                   System.out.println("\n\n\n\n\n");
                   
                }else if(cadena.substring(0 ,5).equals(sal)){
                    System.out.println("\n\n\n\n\n");
                    System.out.println("ADIOS");
                     Bandera = false;
                      
                     //break;
                } else{
                    System.out.println("\n\n\n\n\n");
                   
                    System.out.println("CODIGO INCORRECTO");
                    CantIncorrect++;
                 } 
                
            } else{
                System.out.println("\n\n\n\n\n");
                System.out.println("INCORRECTO solo se permiten 5 digitos");
                
                 } 
            
        }while(Bandera);
        
        System.out.println("La cantidad de veces ingresado correctamente el codigo es =" + CantCorrect);
        System.out.println("La cantidad de veces ingresado incorrectamente el codigo es =" + CantIncorrect);
    }
    
}
