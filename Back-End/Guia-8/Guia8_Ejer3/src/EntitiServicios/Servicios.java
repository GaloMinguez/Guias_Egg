package EntitiServicios;

import java.util.Scanner;
import Entiti.Persona;

public class Servicios {
    private final Scanner sc = new Scanner(System.in);
    
    // Método para comprobar si la persona es mayor de edad
    public boolean esMayorDeEdad(Persona p) {
        return p.esMayorDeEdad();
    }
    
    private static class p {

        public p() {
        }
    }
    
    // Método para crear una persona
    public Persona crearPersona() {
        Persona p = new Persona();
        System.out.print("Ingrese el nombre: ");
        p.setNombre(sc.nextLine());
        System.out.print("Ingrese la edad: ");
        p.setEdad(Integer.parseInt(sc.nextLine()));
        System.out.print("Ingrese el sexo (H/M/O): ");
        char sexo = sc.nextLine().charAt(0);
        while (sexo != 'H' && sexo != 'M' && sexo != 'O') {
            System.out.println("Sexo incorrecto. Intente nuevamente.");
            System.out.print("Ingrese el sexo (H/M/O): ");
            sexo = sc.nextLine().charAt(0);
        }
        p.setSexo(sexo);
        System.out.print("Ingrese el peso (en kg): ");
        p.setPeso(Double.parseDouble(sc.nextLine()));
        System.out.print("Ingrese la altura (en metros): ");
        p.setAltura(Double.parseDouble(sc.nextLine()));
        return p;
    }
 public int calcularIMC() {
        double imc = peso / (altura * altura);
        if (imc < 20) {
            return -1;
        } else if (imc >= 20 && imc <= 25) {
            return 0;
        } else {
            return 1;
        }
    }
    
}
