package Entidades;

public class Estudiante {

    private String nombre;
    private int nota;
    
    public Estudiante(String nombre, int nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNota() {
        return nota;
    }
    
    

}
