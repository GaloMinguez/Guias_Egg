package Guia_4;

import java.util.Scanner;


public class Extras_1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("ingrese la dimension del vector");
        int N = leer.nextInt();
        int vector[] = new int[N];
        int suma=0;
        
        System.out.println("\n rellene el vector con numeros enteros");
        for (int i=0 ; i<N ; i++){
            vector[i]=leer.nextInt();
        }
        
        for (int i=0 ; i<N ; i++){
            suma += vector[i];
        }
        
        System.out.println("\n");
        for (int i = 0; i < N; i++) {
            
            System.out.print("[" + vector[i] + "]");
            
        }
        System.out.println(" ");
        
        System.out.println("la suma de los elementos del vector es: " + suma);
        
        System.out.println(" ");
    }
}
