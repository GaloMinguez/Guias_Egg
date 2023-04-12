package Guia_2.EXtras;

import static com.sun.tools.javac.util.StringUtils.toUpperCase;
import java.util.Scanner;
//import static jdk.nashorn.internal.objects.NativeString.toUpperCase;


public class Extras_3 {
    public static void main(String[] args) {
    
        Scanner leer = new Scanner(System.in);
                
        String letra;
        System.out.println("Ingrese una letra para verificar si es una vocal");
        letra = leer.next();
        
        letra=toUpperCase(letra);
        
        
        switch(letra){
            
            case "A":
                System.out.println("La letra ingresada es una vocal");
            break;
            
            case "E":
                System.out.println("La letra ingresada es una vocal");
                break;
            
            case "I":
                System.out.println("La letra ingresada es una vocal");
                break;
            
            case "O":
                System.out.println("La letra ingresada es una vocal");
                break;
            
            case "U":
                System.out.println("La letra ingresada es una vocal");
                break;
            
            default:
                
                System.out.println("La letra ingresada no es una vocal");
            
        }
       
    }
    
}
