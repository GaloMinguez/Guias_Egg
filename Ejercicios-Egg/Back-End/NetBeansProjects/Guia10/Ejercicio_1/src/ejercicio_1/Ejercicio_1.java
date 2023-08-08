package ejercicio_1;

import java.util.ArrayList;
import java.util.Scanner;


public class Ejercicio_1 {


 public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<String> perros = new ArrayList();
        String respuesta;
        do {
            System.out.println("Ingrese la raza del perro");
            String raza = leer.next();
            perros.add(raza);
            
            System.out.println("Desea guardar otro perro?");
            respuesta = leer.next();
        } while (!respuesta.equalsIgnoreCase("NO"));
        for (String perro : perros) {
            System.out.println(perro);
        }
 }
}
