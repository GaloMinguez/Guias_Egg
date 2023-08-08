package poo_ejem_1;

import Entidades.Persona;
import java.util.Scanner;



public class POO_Ejem_1 {

  
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        //getter
        Persona Persona1 = new Persona("Alex", 39, 30190234);
        
        System.out.println(" esta persona es: "+ Persona1.getNombre()+ "\n edad " + Persona1.getEdad()+ "\n DNI es: "+ Persona1.getDNI());
        
        System.out.println(" ");
        
        //para setter
        Persona Persona2 = new Persona("ayelen", 24, 42190234);
        
        System.out.println(" esta persona es: "+ Persona2.getNombre()+ "\n edad " + Persona2.getEdad()+ "\n DNI es: "+ Persona2.getDNI());
        
    }
    
    
    
}
