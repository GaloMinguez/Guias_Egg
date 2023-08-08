package Entidades;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Baraja {

    private final List<Carta> cartas;
    private final List<Carta> monton;

    // CONSTRUCTOR
    public Baraja() {
        cartas = new ArrayList<>();
        monton = new ArrayList<>();
        for (int i = 1; i <= 12; i++) {
            if (i != 8 && i != 9) {
                cartas.add(new Carta(i, "Espadas"));
                cartas.add(new Carta(i, "Bastos"));
                cartas.add(new Carta(i, "Oros"));
                cartas.add(new Carta(i, "Copas"));
            }
        }
    }

    //METODOS
    public void barajar() {
        Collections.shuffle(cartas);
    }

    public Carta siguienteCarta() {
        if (cartas.isEmpty()) {
            System.out.println("No hay más cartas en la baraja.");
            return null;
        }
        Carta carta = cartas.remove(0);
        monton.add(carta);
        return carta;
    }

    public int cartasDisponibles() {
        return cartas.size();
    }

    public List<Carta> darCartas(int numCartas) {
        if (numCartas > cartas.size()) {
            System.out.println("No hay suficientes cartas en la baraja.");
            return null;
        }
        List<Carta> mano = new ArrayList<>();
        for (int i = 0; i < numCartas; i++) {
            Carta carta = siguienteCarta();
            if (carta != null) {
                mano.add(carta);
            }
        }
        return mano;
    }

    public void cartasMonton() {
        if (monton.isEmpty()) {
            System.out.println("No se ha sacado ninguna carta aún.");
        } else {
            for (Carta carta : monton) {
                System.out.println(carta);
            }
        }
    }

    public void mostrarBaraja() {
        for (Carta carta : cartas) {
            System.out.println(carta);
        }
    }

}
