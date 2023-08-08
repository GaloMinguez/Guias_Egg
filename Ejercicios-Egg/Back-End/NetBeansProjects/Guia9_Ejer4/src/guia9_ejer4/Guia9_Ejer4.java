package guia9_ejer4;

import Entidad.Persona;
import java.util.Date;
import servicios.FechaService;
import servicios.personaService;

public class Guia9_Ejer4 {

    public static void main(String[] args) {

        Date nacimiento = new Date();
        Date actualidad = new Date();
        String edad;
        Persona per = new Persona();
        personaService ps = new personaService();
        FechaService fecha = new FechaService();

        ps.crearPersona(per);

        actualidad = fecha.fechaActual(actualidad);

        edad = ps.calcularEdad(per, actualidad);
        
        
        ps.mostrarPersona(per, edad);
//        nacimiento = fecha.fechaNacimiento(nacimiento);
//        System.out.println(nacimiento);
//        System.out.println(actualidad);
//        edad = fecha.EdadActual(nacimiento, actualidad);
//        System.out.println(edad);
    }

}
