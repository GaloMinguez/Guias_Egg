package Clases;

import java.util.Scanner;

public class Juego {

    public int num;
    public int num2;
    public int intentos;

    public void iniciar_juego() {
        Scanner leer = new Scanner(System.in);
        this.num = num;
        this.num2 = num2;
        this.intentos = intentos;;
        for (int i = 1; i < intentos; i++) {
            if (num2 == num) {
                System.out.println("el numero es correcto, la cantidad de intentos fue " + i);
                break;
            } else if (num2 < num) {
                System.out.println("mas alto");
                num2 = leer.nextInt();
            } else if (num2 > num) {
                System.out.println("mas bajo");
                num2 = leer.nextInt();
            }

        }
        if (num2 != num) {
            System.out.println("el numero no fue adivinado, el numero de intentos fue: " + intentos);
        }

    }

}
