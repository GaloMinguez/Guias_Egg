package Guia_4;

import java.util.Scanner;

public class Ejer_5 {

    public static void main(String[] args) {

        int[][] array = new int[3][3];
        int[][] array2 = new int[3][3];
        boolean com = false;
        int cont = 0;

        llenarArray(array, array2);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (com = array[i][j] == -array2[i][j]) {
                    cont++;
                }
            }
        }

        if (cont == 9) {
            System.out.println("La matriz es antisimétrica");
        } else {
            System.out.println("La matriz no es antisimétrica");
        }

    }

    public static void llenarArray(int[][] array, int[][] array2) {
        Scanner read = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j] = read.nextInt();
                array2[j][i] = array[i][j];
            }
        }

    }

}
