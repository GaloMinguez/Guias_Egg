package Main;

import Entidades.Perro;
import Entidades.Persona;

public class Ejer_1 {

    public static void main(String[] args) {
        
        
//    private String nombre;
//    private String raza;
//    private int edad;
//    private double tamaño;
        Perro pe1 = new Perro("tomy", "caniche", 2, 1.3);
        Perro pe2 = new Perro("blondi","caniche",8,1.9);
        
        System.out.println(pe1.toString());
        
//    private String nombre;
//    private String apellido;
//    private int edad;
//    private int documento;
//    private Perro perro;
        Persona per1 = new Persona("galo","minguez",25,40781785);
        per1.adoptarPerro(pe1);
        per1.adoptarPerro(pe2);
        
        
        Persona per2 = new Persona();
        System.out.println(per1.toString());
    }

}
