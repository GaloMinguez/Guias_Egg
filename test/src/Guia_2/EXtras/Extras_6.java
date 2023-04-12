package Guia_2.EXtras;

import java.util.Scanner;


public class Extras_6 {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int N;
        N=0;
        float personas;
        personas=0;
        int cantBajas;
        cantBajas=0;
        float promAltBajas;
        promAltBajas=0;
        float promGeneral;
        promGeneral=0;
        
        System.out.println("Ingrese la cantidad de personas");
        N = leer.nextInt();
        
        System.out.println("\n\n\n");
        
        for (int i = 0; i < N; i++) {
            
            System.out.println("Ingrese la altura de las personas en Mts");
            personas = leer.nextFloat();
            
            if(personas < 1.6){
                cantBajas++;
                promAltBajas = promAltBajas + personas;
            }
            
            promGeneral = promGeneral + personas;
        }
        
        promAltBajas = promAltBajas / cantBajas;
        System.out.println("el promedio de altura de las personas por debajo de 1.6Mts es = " + promAltBajas);
        
        promGeneral= promGeneral / N;
        System.out.println("el promedio de las N alturas ingresadas es = " + promGeneral);
        
        
    }
    
}
