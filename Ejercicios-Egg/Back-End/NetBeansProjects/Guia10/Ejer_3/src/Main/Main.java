package Main;

import java.util.Scanner;
import servicios.ServicioAlumno;

public class Main {

    public static void main(String[] args) {
        ServicioAlumno servicio = new ServicioAlumno();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        boolean seguirAgregando = true;
        
        while (seguirAgregando) {
            servicio.CrearAlumno();
            System.out.println("¿Desea agregar otro alumno? (S/N)");
            String respuesta = leer.nextLine();
            seguirAgregando = respuesta.equalsIgnoreCase("S");
        }
        servicio.mostrarAlumnos();

        servicio.mostrarNotaFinal();

    }
}
