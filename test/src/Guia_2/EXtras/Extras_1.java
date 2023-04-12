package Guia_2.EXtras;

import java.util.Scanner;

public class Extras_1 {
    /*public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int min;
        float aux1;
        float aux2;
        float horas;
        int dias;
        
        System.out.println("ingrese los minutos que desea calcular a sus equivalentes en dias y horas");
        min = leer.nextInt();
        
        aux1 = min;
        
        dias = (int) (aux1 / 1440);
        
        horas = (aux1 % 1440)/60;
        
        System.out.println(horas);
        System.out.println(dias);
    
    }*/
    

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Por favor, ingrese la cantidad de minutos");
        int min=leer.nextInt();
        int horas= (min%1440)/60;
        int dias= min/1440;
        
        
        System.out.println(" los minutos ingresados corresponden a "+dias+ " dias  y " + horas+ " horas");     
    }
    
}
    

