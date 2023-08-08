package servicios;

import Entidades.Alumnos;
import java.util.ArrayList;
import java.util.Scanner;

public class ServicioAlumno {

    ArrayList<Alumnos> Alumnos = new ArrayList();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void CrearAlumno() {
        System.out.println("Ingrese el nombre del alumno");
        String nombre = leer.next();
        Alumnos alum = new Alumnos(nombre);

        System.out.println("A continuacion se ingresdaran las 3 notas del alumno");
        for (int i = 1; i <= 3; i++) {
            System.out.println("Ingrese la nota " + i + " del alumno:");
            int nota = leer.nextInt();
            alum.agregarNota(nota);
        }
        Alumnos.add(alum);
        
        System.out.println("Alumno agregado exitosamente. \n");
    }

    public void mostrarAlumnos() {
        if (Alumnos.isEmpty()) {
            System.out.println("No hay alumnos registrados.");
            return;
        }
        System.out.println("Lista de alumnos:");
        for (Alumnos Alumno : Alumnos) {
            System.out.println(Alumno.getNombre());
        }

    }

    //muestra la nota final
    public void mostrarNotaFinal() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre del alumno del cual desea saber la nota: ");
        String nombre = scanner.nextLine();
        Alumnos alumno = buscarAlumno(nombre);
        if (alumno == null) {
            System.out.println("El alumno no está registrado.");
            return;
        }
        double notaFinal = alumno.notaFinal();
        System.out.println("La nota final del alumno " + nombre + " es: " + notaFinal);
    }

    //Busca alumnos para la NOTA FINAL
    private Alumnos buscarAlumno(String nombre) {
        for (Alumnos alumno : Alumnos) {
            if (alumno.getNombre().equals(nombre)) {
                return alumno;
            }
        }
        return null;
    }

//    public Electrodomestico crearElectrodomestico (){
//        
//        Electrodomestico electro = new electrodomestico();
//        System.out.println("ingresa los atributos del electrodomestico");
//        ......
//        electro.set-atrivutos(sc.next());
//        .......
//        return electro;
//    }
    
    
}
