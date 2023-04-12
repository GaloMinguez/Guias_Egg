import java.util.Scanner;

import Entiti.Persona;
import EntitiServicios.Servicios;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Servicios servicio = new Servicios();

        // Creamos 4 personas
        Persona persona1= new Persona();
        persona1 = Servicios.crearPersona();
        Persona persona2 = servicios.crearPersona(scanner);
        Persona persona3 = servicios.crearPersona(scanner);
        Persona persona4 = servicios.crearPersona(scanner);

        // Llamamos al método para comprobar si son mayores de edad y lo mostramos por pantalla
        System.out.println(persona1.getNombre() + " es mayor de edad? " + servicio.esMayorDeEdad(persona1));
        System.out.println(persona2.getNombre() + " es mayor de edad? " + servicio.esMayorDeEdad(persona2));
        System.out.println(persona3.getNombre() + " es mayor de edad? " + servicio.esMayorDeEdad(persona3));
        System.out.println(persona4.getNombre() + " es mayor de edad? " + servicio.esMayorDeEdad(persona4));

        // Llamamos al método para calcular el IMC y lo mostramos por pantalla
        System.out.println(persona1.getNombre() + " tiene un IMC de: " + servicio.calcularIMC(persona1));
        System.out.println(persona2.getNombre() + " tiene un IMC de: " + servicio.calcularIMC(persona2));
        System.out.println(persona3.getNombre() + " tiene un IMC de: " + servicio.calcularIMC(persona3));
        System.out.println(persona4.getNombre() + " tiene un IMC de: " + servicio.calcularIMC(persona4));

        // Calculamos el porcentaje de personas en cada categoría de IMC
        int[] resultadosIMC = servicio.calcularResultadosIMC(persona1, persona2, persona3, persona4);

        System.out.println("El " + resultadosIMC[0] + "% de las personas tienen un IMC por debajo de lo normal");
        System.out.println("El " + resultadosIMC[1] + "% de las personas tienen un IMC normal");
        System.out.println("El " + resultadosIMC[2] + "% de las personas tienen un IMC por encima de lo normal");

        // Calculamos el porcentaje de personas mayores y menores de edad
        int[] resultadosEdad = servicio.calcularResultadosEdad(persona1, persona2, persona3, persona4);

        System.out.println("El " + resultadosEdad[0] + "% de las personas son mayores de edad");
        System.out.println("El " + resultadosEdad[1] + "% de las personas son menores de edad");

    }

}