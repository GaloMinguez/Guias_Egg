package Guia_2.EXtras;

import java.util.Scanner;

public class Extras_5 {
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Ingrese su tipo de socio: ");
		String socio=sc.nextLine();
		System.out.println("Ingrese su cuota: ");
		int cuota=sc.nextInt();	
		
		
		
		if(socio.equals("A")) {
			int cuotaN=cuota*50/100;
			System.out.println("Tiene que pagar el total de: "+cuotaN+" sin descuento seria:"+cuota);
			
		}
		else if(socio.equals("B")) {
			int cuotaN=cuota*35/100;	
			System.out.println("Tiene que pagar el total de: "+cuotaN+" sin descuento seria:"+cuota);	
			
		}
		else
			System.out.println("Tiene que pagar el total de: "+cuota+" no tiene descuentos");
		
		
	}
}

