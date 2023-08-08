package Clases;

import java.util.Scanner;


public class Cocina {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public String[][] receta= new String[100][5];
    
    
    
    public void AgregarReceta (){
         String opcion;
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 5; j++) {
                
                
                
            }
            
            if (receta[i][0]==null){
                
                System.out.println("desea agregar una nueva receta?");
                opcion=leer.next();
                if (opcion.equalsIgnoreCase("si") ){
                    receta[i][0]=leer.next();
                }
                else{
                    break;
                }
            }
        }
    }


    
    
    
}
