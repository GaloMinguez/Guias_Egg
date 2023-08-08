package Entidades;

import java.util.ArrayList;

public class Alumnos {

    private String nombre;
    private ArrayList<Integer> notas;

    public Alumnos(String nombre) {
        this.nombre = nombre;
        notas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarNota(int nota) {
               notas.add(nota);
    }
    
    public double notaFinal() {
        int totalNotas = 0;
        for (int nota : notas) {
            totalNotas += nota;
        }
        return (double) totalNotas / notas.size();
    }
}
