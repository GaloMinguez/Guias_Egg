package Extras;

import Clases.Cancion;
import java.util.Scanner;


public class EXTRA_1 {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Cancion cancion1 = new Cancion();
        Cancion cancion2 = new Cancion();
        
        
        String titulo;
        String autor;
        
        //para cancion-1
        System.out.print("ingrese titulo de la cancion-1 : ");
        titulo = leer.next();
        System.out.print("ingrese autor de la cancion-1 : ");
        autor = leer.next();
        
        cancion1.setAutor(autor);
        cancion1.setTitulo(titulo);
         
        //para cancion-2
          System.out.print("ingrese titulo de la cancion-2 : ");
        titulo = leer.next();
        System.out.print("ingrese autor de la cancion-2 : ");
        autor = leer.next();
        
        cancion2.setAutor(autor);
        cancion2.setTitulo(titulo);
        
        
                
        System.out.println("primer cancion= " + cancion1.toString());
        
        System.out.println("segunda cancion= " + cancion2.toString());
        
   
        
    }
    
    
    
}
