package Guia_4;

import java.util.Scanner;

public class Extras_7 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("ingrese cuantos espacios tendra el vector y se rellenaran con numeros fibonacci");
        int N = leer.nextInt();
        int fibo ;
        int fibo1 = 1;
        int fibo2 = 0;
        int vector[] = new int[N];

        for (int i = 0; i < N; i++) {
            if (i == 0) {
                fibo = 1;
            } else {
                fibo = fibo1 + fibo2;
                fibo2 = fibo1;
                fibo1 = fibo;

            }
            
            vector [i]=fibo;
        }

        for (int i = 0; i < N; i++) {

          
            System.out.print("[" + vector[i] + "]");

        }

        System.out.println(" ");
        
    }

}
