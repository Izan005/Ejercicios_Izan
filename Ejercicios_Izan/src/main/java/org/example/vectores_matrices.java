package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class vectores_matrices {
    public void vect_matr() {
        Scanner entrada = new Scanner(System.in);
        int matriz[][] = new int[3][3];
        int vector[] = {1,2,4};

        for (int i = 0;i< vector.length; i++ ) { //Introducir ya creado un vector en una matriz
            matriz[0][i] = vector[i];
        }

        for (int filas[] : matriz) {
            for (int columnas : filas) {
                System.out.print(columnas + " ");
            }
            System.out.println();
        }

        String matriz2[][] = new String[3][4];
        for (int i = 0; i < matriz2.length; i++) { //Crear e introducir un vector en una matriz

            System.out.println("Introduce valores de la fila separados por ',' (fila " + i + " )");
            String nums = entrada.next();
            String fila[] = nums.split(",");

            for (int j = 0; j < matriz2[i].length; j++) {
                matriz2[i][j] = fila[j];
            }

        }



    }
}
