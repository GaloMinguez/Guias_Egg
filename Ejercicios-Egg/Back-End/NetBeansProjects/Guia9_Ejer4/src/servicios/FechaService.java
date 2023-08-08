package servicios;

import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class FechaService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Date fechaNacimiento(Date nacimiento) {

        System.out.println(" ingrese dia, mes y anio de su nacimiento");
        int dia = leer.nextInt();
        int mes = leer.nextInt();
        int anio = leer.nextInt();

        System.out.println(anio + "/" + mes + "/" + dia);
        return new Date(anio - 1900, mes - 1, dia);
    }

    public Date fechaActual(Date actualidad) {

        System.out.println("ingrese la fecha actual: Dia/mes/anio");
        int dia = leer.nextInt();
        int mes = leer.nextInt();
        int anio = leer.nextInt();

        System.out.println(anio + "/" + mes + "/" + dia);
        return new Date(anio - 1900, mes - 1, dia);
    }

    public String EdadActual(Date nacimiento, Date actualidad) {

        String edad;
        int anio = actualidad.getYear() - nacimiento.getYear();
        int mes = actualidad.getMonth() - nacimiento.getMonth();
        int dia = actualidad.getDate() - nacimiento.getDate();

        if (mes < 1) {
            anio = anio - 1;
            mes = mes + 12;
            if (dia < 1) {
                mes = mes - 1;
                dia = Math.abs(dia);
            }
        }
        if (dia < 1) {
            mes = mes - 1;
            dia = Math.abs(dia);
        }

        edad = ("su edad es: " + dia + " dias/" + mes + " meses/" + anio+ " anios");

        return edad;
    }

}
