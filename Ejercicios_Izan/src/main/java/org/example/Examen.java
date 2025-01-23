package org.example;


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Examen {
    public static void examen() {

        Scanner entrada = new Scanner(System.in);
        Random random = new Random();

        int bolas = random.nextInt(10, 40)+1;
        int vec_bolas[] = new int[bolas];
        int vec_bolas_limpio[] =  Arrays.stream(vec_bolas).distinct().toArray();
        do {

            for (int i = 0; i<vec_bolas.length; i++) {
                vec_bolas[i] = random.nextInt(1, 90)+1;
            }
            vec_bolas_limpio = Arrays.stream(vec_bolas).distinct().toArray();

        } while (vec_bolas_limpio.length<vec_bolas.length);

        System.out.println(bolas + " extraídas hasta ahora: " + Arrays.toString(vec_bolas));

        String carton[][] = new String[3][3];
        boolean valid = false;
        String fila = "";

        System.out.println();
        System.out.println("***Introduce los datos del cartón (3x3) en formato X-X-X: ");

        for (int i = 0; i < carton.length; i++) {
            System.out.println("Fila " + (i+1) + ":");
            fila = entrada.next();

            boolean formato = fila.matches("\\d{1,2}-\\d{1,2}-\\d{1,2}");

            if (formato == false) {
                System.out.println("ERROR. Formato incorrecto. Cerrando programa...");
                return;
            }

            String vec_fila[] = fila.split("-");
            for (int j = 0; j < carton[i].length; j++) {
                carton[i][j] = vec_fila[j];
            }
        }

        System.out.println("Datos del cartón introducido:");
        for (String filas[] : carton) {
            for (String columnas : filas) {
                System.out.print(columnas + " ");
            }
            System.out.println();
        }

        System.out.println("PREMIOS:");
        System.out.println();
        int aciertos = 0;

        for (int i = 0; i < vec_bolas.length; i++) {
            for (int j = 0; j < carton.length; j++) {
                for (int k = 0; k < carton[j].length; k++) {
                    int num_carton = Integer.parseInt(carton[j][k]);
                    if (vec_bolas[i] == num_carton) {
                        aciertos++;
                    }
                }
            }
        }
        if (aciertos == 9) {
            System.out.println("HAY BINGO!!");
            return;
        } else {
            System.out.println("No hay bingo");
            for (int i = 0; i < carton.length; i++) {
                aciertos = 0;
                bucle:
                for (int j = 0; j < carton[i].length; j++) {
                    int num_carton = Integer.parseInt(carton[i][j]);
                    for (int k = 0; k < vec_bolas.length; k++) {

                        if (vec_bolas[k] == num_carton) {
                            aciertos++;
                            continue bucle;
                        }
                    }
                }
                if (aciertos == 3) {
                    System.out.println("Línea " + (i+1) + ": " + " COMPLETA");
                } else {
                    System.out.println("Línea " + (i+1) + ": " + " NO");
                }
            }

        }
    }
}