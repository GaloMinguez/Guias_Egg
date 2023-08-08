package Caminata;

import Perros.Perro;
import java.util.Scanner;


public class CaminataPerruna {

   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Perro perro1 = new Perro();
        
        System.out.println("ingrese el nombre del perro");
        String nombre=leer.next();
        perro1.setNombre(nombre);
        
        int energia=(int) ( Math.random()*700+300);
        perro1.setEnergia(energia);
        System.out.println("energia="+energia);
        
        int caminar=(int) ( Math.random()*50+50);
        perro1.setCaminar(caminar);
        System.out.println("caminar cuesta = "+caminar+" de energia");
        
        
        
        
        
        
        
        
        
    }
    
    
   
        
        
        
        
    }
