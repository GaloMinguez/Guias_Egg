package Guia_2.EXtras;

import java.util.Scanner;

public class Extras_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		boolean multiplos=true;
		int pares=0,impares=0,cantidad=0;
		do {
			System.out.println("Ingresar numero");
		
			int numero = sc.nextInt();
			
			cantidad++;
			if(numero<0) {
				System.out.println("Ingresar numeros mayores a 0");
				continue;
			}
			if(numero%5==0) {
				multiplos=false;
			}
			else if(numero%2==0){
				pares++;
			}
			else {
				impares++;
			}
		}while(multiplos);
		
		System.out.println("La cantidad de pares: "+pares+" y la cantidad de impares: "+impares);	
		
		

	}

}