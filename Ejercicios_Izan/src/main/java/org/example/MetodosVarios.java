package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class MetodosVarios {
    public static void mostrarMatrizInt(String[][] matriz) {
        for (String[] filas : matriz) {
            for (String columnas : filas) {
                System.out.print(columnas + " ");
            }
            System.out.println();
        }
    }
    public static int Cubo(int num) {
        num = num * num * num;
        return num;
    }
    public static int[] RellenarVectInt(int vector[]) {

        for (int i = 0; i < vector.length; i++) {
            vector[i] =  i;
        }

        return vector;
    }
    public static int[] mostrarVectInt(int vector[]) {

        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + ", ");
        }
        return vector;
    }
    public static int contarVocales(String cadena) {

        String vec_cadena[] = cadena.split("");
        int vocales = 0;
        for (int i = 0; i < vec_cadena.length; i++) {

            if (vec_cadena[i].equals("A") || vec_cadena[i].equals("E") || vec_cadena[i].equals("I") || vec_cadena[i].equals("O") || vec_cadena[i].equals("U")) {
                vocales ++;
            }
        }

        return vocales;
    }
    public static float[] semana() {
        Scanner entrada = new Scanner(System.in);
        float num = 0;
        float vec_semana[] = new float[6];
        boolean salir = false;
        do {
            for (int i = 0; i <= 6 ; i++) {
                System.out.println("Introduce datos del día " + (i+1) + ": ");
                num = entrada.nextFloat();
                if (num <= -1) {
                    salir = true;
                    break;
                } else {
                    vec_semana[i] = num;
                }
            }
        } while (!salir);

        return vec_semana;
    }
}
