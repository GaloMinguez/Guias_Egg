package Entidades;

public class jugador {

    private final int id; 
    private final String nombre;
    private boolean mojado;

    public jugador(int id) {
        this.id = id;
        this.nombre = "El Jugador " + id;
        this.mojado = false;
    }

    public boolean disparo(revolver r) {

        System.out.println(nombre + " se apunta con el revolver de agua");
        boolean mojado = r.mojar();
        if (mojado) {
            System.out.println(nombre + " se mojo!");
            this.mojado = true;
        } else {
            System.out.println(nombre + " se salvo!");
        }
        return mojado;

    }

    public boolean estaMojado() {
        return mojado;
    }

    public String getNombre() {
        return nombre;
    }

}
