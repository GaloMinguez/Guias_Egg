package g10_ejer2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class G10_ejer2 {

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

        String perroBuscar = "dogo";
        boolean bandera = false;
        Iterator<String> it = perros.iterator();
        while (it.hasNext()) {
            if (it.next().equals(perroBuscar)) {
                it.remove();
                bandera = true;
            }
            
        }
        if (!bandera) {
            System.out.println("No se encontro el perro en la lista");
        }
        
        Collections.sort(perros);
        for (String perro : perros) {
            System.out.println(perro);
        }
    }
    
}