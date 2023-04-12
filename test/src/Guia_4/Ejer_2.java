package Guia_4;

import java.util.Scanner;

public class Ejer_2 {
    public static void main(String[] args) {

		int numero;
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese el Tamnio de la vector");
		numero = sc.nextInt();
		int[] vector = new int[numero];
		for (int i = 0; i < vector.length; i++) {
			vector[i] = (int) (Math.random() * 10 + 1);
		}
		System.out.println("Ingrese un numero a buscar entre 1 y 10");
		int buscador = sc.nextInt();
		int contador = 0;
		for (int i = 0; i <vector.length; i++ ) {
			if (buscador == vector[i]) {
				contador ++;
				System.out.println("Se encontro el numero en la posision : " + i);
			}
		}
		if (contador == 0) {
			System.out.println("No se encontro el numero");
		}else {
			System.out.println("\n");
			System.out.printf("El numero esta repetido %d veces", contador);
			System.out.println("");
		}
		
		sc.close();
	}
        
    }
