package Guia_2.EXtras;

import java.util.Scanner;

public class Extras_7 {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int N;
        int num;
        int max;
        max=0;
        int min;
        min=999999999;
        float prom;
        prom=0;
        int i;
        i=0;
        
        System.out.println("cuantos numeros ingresara?");
        N=leer.nextInt();
        
        while(i < N){
            System.out.println("\n"+"Ingresar el numero");
            num = leer.nextInt();
            
            if (num<min){
                min=num;
            }
            if (num > max){
                max=num;
            }
            prom = prom + num;
            
        i++;    
        }
        
        System.out.println("El maximo numero ingresado es= " + max +"\n");
        System.out.println("El minimo numero ingresado es= " + min +"\n");
        prom = prom / N;
        System.out.println("el promedio de los numeros ingresados es= " + prom );

    }
    
}
