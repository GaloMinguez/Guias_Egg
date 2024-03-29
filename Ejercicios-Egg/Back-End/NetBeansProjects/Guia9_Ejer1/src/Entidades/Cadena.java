package Entidades;


public class Cadena {
    private String frase;
    private int longitud;

    public Cadena(String frase) {
        this.frase = frase;
        this.longitud = frase.length();
    }
    public Cadena() {
    }

    public String getFrase() {
        return frase;
    }
    public void setFrase(String frase) {
        this.frase = frase;
    }
    public int getLongitud() {
        return longitud;
    }
    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    @Override
    public String toString() {
        return "Cadena {" + " frase = " + frase + " }";
    }
    
}


//package entidades;
//
///**
// *
// * @author Admin
// */
//public class Cadena {
//    private String frase;
//    private int longitud;
//
//    public Cadena() {
//    }
//
//    public Cadena(String frase) {
//        this.frase = frase;
//    }
//    
//    
//
//    public Cadena(String frase, int longitud) {
//        this.frase = frase;
//        this.longitud = longitud;
//    }
//
//    public String getFrase() {
//        return frase;
//    }
//
//    public void setFrase(String frase) {
//        this.frase = frase;
//    }
//
//    public int getLongitud() {
//        return longitud;
//    }
//
//    public void setLongitud(int longitud) {
//        this.longitud = longitud;
//    }
//
//    @Override
//    public String toString() {
//        return "Cadena{" + "frase=" + frase + ", longitud=" + longitud + '}';
//    }
//    
//    
//    
//}