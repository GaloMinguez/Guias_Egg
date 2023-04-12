package Guia_4;

import java.util.Scanner;


public class Extras_2 {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("ingrese la dimension de los vector a rellenar");
        int N = leer.nextInt();
        
        int vector1[] = new int[N];
        int vector2[] = new int[N];
        
        System.out.println("\n rellene el vector N°1 con numeros enteros");
        for (int i=0 ; i<N ; i++){
            vector1[i]=leer.nextInt();
        }
        
        System.out.println("\n rellene el vector N°2 con numeros enteros");
        for (int i=0 ; i<N ; i++){
            vector2[i]=leer.nextInt();
        }
        
        for (int i=0 ; i<N ; i++){
            if(vector1[i]==vector2[i]){
                
            }else{
                System.out.println("se detecto la desigualdad en: " + (i+1) +"° posición");
                break;
            }
                
        }
        
        
    }
}
