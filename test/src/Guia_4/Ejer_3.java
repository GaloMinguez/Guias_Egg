package Guia_4;

import java.util.Scanner;

public class Ejer_3{
     public static void main(String[] args) {
         Scanner leer = new Scanner(System.in).useDelimiter("\n");
         int n, aux, c;
        System.out.println("Ingrese tamaño del vector: ");
        n = leer.nextInt();
        int[] vector = new int[n];
        for (int i = 0; i < n; i++) {
            /// 1 - 100000
            vector[i] = (int)Math.pow(i, Math.random()*5+1);
        }

        for (int i = 0; i < n; i++) {
            c = 0;
            aux = vector[i];
            System.out.print(vector[i]+" ");
            while (aux > 0) {  /// 100 / 10 = aux = 10/10  aux = 1 /10
                aux = aux / 10; 
                // AUX = 10 /10 = AUX = 1; AUX = 1 /10 =0,1 = 0;
                c++;
            }
            switch (c) {
                case 0:
                case 1:
                    System.out.println("El numero tiene 1 cifra");
                    break;
                case 2:
                    System.out.println("El numero tiene 2 cifra");
                    break;
                case 3:
                    System.out.println("El numero tiene 3 cifra");
                    break;
                case 4:
                    System.out.println("El numero tiene 4 cifra");
                    break;
                case 5:
                    System.out.println("El numero tiene 5 cifra");
                    break;
                default:
                    System.out.println("TIENE MAS DE 5 CIFRAS");
                    break;
            }
        }
    }
}


/*
public static void main(String[] args) {
		int numero;
		int aux;
		int contador = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese el Tamnio de la vector");
		numero = sc.nextInt();
		int[] vector = new int[numero];
		for (int i = 0; i < vector.length; i++) {
			vector[i] = (int) (Math.random() * 99999 + 1);
		}
		
		for(int i = 0; i<vector.length; i++) {
			System.out.println(vector[i]);
			aux = vector[i];
			contador = 0;
			do {
				aux = aux/10;
				contador++;
			}while(aux!=0);
			System.out.println(" " + vector[i] + "Digitos: " + contador);
		}
		
	}
*/


/*
if (vector[i] >= 0 && vector[i] <= 9) {
                
                cont1d++;
                
            } else if (vector[i] >= 10 && vector[i] <= 99) {
                
                cont2d++;
                
            } else if (vector[i] >= 100 && vector[i] <= 999){
                
                cont3d++;
                   
            } else if (vector[i] >= 1000 && vector[i] <= 9999){
                
                cont4d++;
                
            } else if (vector[i] >= 10000 && vector[i] <= 99999){
                
                cont5d++;
                
            }
y después probe con otro vector
for (int i = 0; i < vector.length; i++) {
            
            int numero = vector[i]; 
            int digitos = 0;
            
            while (numero > 0) {
                
                digitos++;
                numero /= 10;
                
            }
            
            if (digitos > 5) {
                
                digitos = 5; 
                
            }
            
            contador[digitos]++;
            
        }
*/