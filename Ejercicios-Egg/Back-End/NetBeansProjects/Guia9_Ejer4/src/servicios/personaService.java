package servicios;

import Entidad.Persona;
import java.util.Date;
import java.util.Scanner;

public class personaService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    FechaService fecha = new FechaService();

    public void crearPersona(Persona per) {
        System.out.println("ingrese el nombre de la persona");
        per.setNombre(leer.next());

        Date fechaDeNac = null;

        per.setFechaDeNac(fecha.fechaNacimiento(fechaDeNac));

        System.out.println(per.getFechaDeNac());
    }

    public String calcularEdad(Persona per, Date actualidad) {

        String edad = fecha.EdadActual(per.getFechaDeNac(), actualidad);
        System.out.println(edad);
        return edad;
    }

    public boolean menorQue(Persona per, String edad) {

        return false;
    }

    public void mostrarPersona(Persona per, String edad) {
        System.out.println("el Nombre de la persona es: " + per.getNombre());
        System.out.println("fecha de nacimiento: " + per.getFechaDeNac());
        System.out.println("Edad: " + edad);
    }

}
