package Main;

import Entidades.Estudiante;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        Estudiante[] estudiantes = new Estudiante[8];
        estudiantes[0] = new Estudiante("Juan", 8);
        estudiantes[1] = new Estudiante("Maria", 9);
        estudiantes[2] = new Estudiante("Pedro", 7);
        estudiantes[3] = new Estudiante("Luis", 6);
        estudiantes[4] = new Estudiante("Ana", 10);
        estudiantes[5] = new Estudiante("Carla", 8);
        estudiantes[6] = new Estudiante("Miguel", 9);
        estudiantes[7] = new Estudiante("Lucas", 7);

        int sumaNotas = 0;
        for (Estudiante estudiante : estudiantes) {
            sumaNotas += estudiante.getNota();
        }
        double promedio = (double) sumaNotas / estudiantes.length;
        System.out.println("El promedio de notas de todo el curso es: " + promedio);

        ArrayList<String> alumnosNotables = new ArrayList<>();
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getNota() > promedio) {
                alumnosNotables.add(estudiante.getNombre());
            }
        }
        System.out.println("Los alumnos que recibieron una nota mayor al promedio son: " + alumnosNotables);

        System.out.println("Todos los estudiantes con una nota mayor al promedio son: ");
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getNota() > promedio) {
                System.out.println(estudiante.getNombre() + " - " + estudiante.getNota());
            }
        }
    }
}
