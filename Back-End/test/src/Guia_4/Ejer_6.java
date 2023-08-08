package Guia_4;

public class Ejer_6 {

    public static void main(String[] args) {

        int n, m, suma;
        int matriz[][] = new int[3][3];

        llenarMatriz(matriz);
        mostrarMatriz(matriz);

    }

//subfuncion para lenar la matriz    
    public static void llenarMatriz(int[][] matriz) {

        int i = 0;
        int j;

        matriz[i][0] = 7;
        matriz[i][1] = 14;
        matriz[i][2] = 9;

        i = 1;
        matriz[i][0] = 12;
        matriz[i][0] = 10;
        matriz[i][0] = 8;

        i = 2;
        matriz[i][0] = 11;
        matriz[i][0] = 6;
        matriz[i][0] = 13;
    }

//subFuncion para mostrar la matriz
    public static void mostrarMatriz(int[][] matriz) {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                System.out.print("[" + matriz[i][j] + "]");

            }
            System.out.println(" ");
        }

    }

}
