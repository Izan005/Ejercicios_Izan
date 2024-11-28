package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class matrices {
    public void matrices() {

        Scanner entrada = new Scanner(System.in);
        int matriz1[][] = new int[3][4];

        int matriz2[][] = {{12, 32, 44, 1}, {33, 2, 90, 56}};

        int vector[] = {1, 2, 3, 4};

        System.out.println("Tamaño fila " + matriz2.length);
        System.out.println("Tamaño columna " + matriz2[0].length);

        for (int i = 0; i < matriz2.length; i++) { //Imprimir matrices con 2 for
            for (int j = 0; j < matriz2[i].length; j++) {
                System.out.print(matriz2[i][j] + " ");
                if (matriz2[i][j] == 90) { //Buscar un valor en una matriz
                    System.out.println("Existe el 90");
                } else {
                    System.out.println("No existe el 90");
                }
            }
            System.out.println();
        }


        for (int[] filas : matriz2) { //Imprimir matriz con 1 foreach y Arrays.toString
            System.out.println(Arrays.toString(filas));
        }

        for (int[] filas : matriz2) { //Imprimir matriz con 2 foreach
            for (int column : filas) {
                System.out.print(column + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < matriz1.length; i++) { //Rellenar una matriz
            for (int j = 0; j < matriz1[i].length; j++) {
                System.out.println("Ingresa el valor de la posición (" + i + ", " + j + ")");
                matriz1[i][j] = entrada.nextInt();
            }
        }

        for (int i = 0; i < matriz1.length; i++) { //Imprime valor de matriz rellenada
            for (int j = 0; j < matriz1[i].length; j++) {
                System.out.print(matriz1[i][j] + " ");
            }

            System.out.println();
        }
    }
    public void matrices2() {
        int matriz[][] = new int[5][5];

        for (int i = 0;i<matriz.length; i++) { //Cuando la fila y la columna tienen el mismo número (0,0), (1,1), etc. se coloca un 1 en esa posición.
            for (int j = 0;j<matriz[i].length; j++) {
                if(i==j) {
                    matriz[i][j] = 1;
                }
            }
        }

        for (int filas[] : matriz) {
            for (int columnas:filas) {
                System.out.print(columnas + " ");
            }
            System.out.println();
        }

        for (int i = 0;i<matriz.length; i++) { //Cuando hay un 0 imprime "-" y cuando hay un 1 imprime "X"
            for (int j = 0;j<matriz[i].length; j++) {
                if(matriz[i][j] == 1) {
                    System.out.print("X ");
                } else {
                    System.out.print("- ");
                }
            }
            System.out.println();
        }

        for (int i = 0;i<matriz.length; i++) { //Cuando hay un 0 imprime "-" y cuando hay un 1 imprime "X" pero de forma inversa. Empieza a imprimir la matriz de derecha
            // a izquierda y de abajo a arriba.
            for (int j = matriz[i].length-1; j>=0; j--) {
                if(matriz[i][j] == 1) {
                    System.out.print("X ");
                } else {
                    System.out.print("- ");
                }
            }
            System.out.println();
        }


    }
    public void matrices3() {


        int matriz1[][] = {{1,5,9}, {20, 17, 2}};

        int matriz2[][] = {{6,7,5}, {15,10,0}};

        int matriz3[][] = new int[matriz1.length][matriz1[0].length];

        if (matriz1.length != matriz2.length || matriz1[0].length != matriz2[0].length) { //Comprueba que el tamaño de los 2 vectores sean iguales. Si no, sale del programa.
            System.out.println("Formato incorrecto. Saliendo del programa...");
            return;
        } else {
            for (int i = 0;i<matriz1.length;i++) { //Repasa la matriz 1 y la compara con la 2 viendo qué número es el mayor. El resultado lo almacena en
                for (int j = 0;j<matriz1[i].length;j++) {

                    if (matriz1[i][j] >= matriz2[i][j]) {
                        matriz3[i][j] = matriz1[i][j];
                    } else {
                        matriz3[i][j] = matriz2[i][j];
                    }
                }
            }

            for (int filas[] : matriz3) { //Imprimo la matriz 3
                for (int columnas : filas) {
                    System.out.print(columnas + " ");
                }
                System.out.println();
            }
        }


    }
}