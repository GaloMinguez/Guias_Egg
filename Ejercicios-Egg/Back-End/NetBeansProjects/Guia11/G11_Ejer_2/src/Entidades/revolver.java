package Entidades;

import java.util.Random;

public final class revolver {

    private int posicionActual;
    private int posicionAgua;
    private final Random random;

    public revolver() {
        random = new Random();
        llenarRevolver();
    }

    public void llenarRevolver() {
        posicionActual = 1 + random.nextInt(6);
        posicionAgua = 1 + random.nextInt(6);
    }

    public boolean mojar() {
         if (posicionActual == posicionAgua) {
            return true;
        } else {
            siguienteChorro();
            return false;
        }
    }

    public void siguienteChorro() {
        posicionActual = (posicionActual % 6) + 1;
    }

    @Override
    public String toString() {
       return "RevolverDeAgua{" +
                "posicionActual=" + posicionActual +
                ", posicionAgua=" + posicionAgua +
                '}';
    }

}
