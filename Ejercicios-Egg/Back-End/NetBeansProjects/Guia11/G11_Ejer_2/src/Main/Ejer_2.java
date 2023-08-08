package Main;

import Entidades.juego;
import Entidades.jugador;
import Entidades.revolver;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejer_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedir número de jugadores
        System.out.print("Ingrese numero de jugadores (entre 1 y 6): ");
        int numJugadores = sc.nextInt();
        if (numJugadores < 1 || numJugadores > 6) {
            System.out.println("Numero de jugadores fuera de rango, se usara 6 por defecto.");
            numJugadores = 6;
        }

        // Crear jugadores y revolver de agua
        ArrayList<jugador> jugadores = new ArrayList<>();
        for (int i = 1; i <= numJugadores; i++) {
            jugador jugador = new jugador(i);
            jugadores.add(jugador);
        }
        revolver revolver = new revolver();

        // Llenar revolver y juego
        revolver.llenarRevolver();
        juego juego = new juego(jugadores, revolver,numJugadores);

       juego.ronda();
    }
}