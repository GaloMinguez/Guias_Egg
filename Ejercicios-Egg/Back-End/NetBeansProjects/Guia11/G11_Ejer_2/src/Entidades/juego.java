package Entidades;

import java.util.ArrayList;

public class juego {

    private ArrayList<jugador> jugadores;
    private revolver Revolver;

    //-----------------------------------------
    public juego( ArrayList jugador,revolver r,int numJugadores) {

        jugadores =  jugador;
        for (int i = 1; i <= numJugadores; i++) {
            jugadores.add(new jugador(i));
        }
        Revolver = new revolver();
    }

    //----------------------------------------
    public void ronda() {

        boolean mojado = false;
        int i = 0;
        while (!mojado) {
            jugador jugadorActual = jugadores.get(i);
            mojado = jugadorActual.disparo(Revolver);
            i = (i + 1) % jugadores.size();
        }
        System.out.println("El jugador " + jugadores.get(i - 1).getNombre() + " perdio!");
    }

}
