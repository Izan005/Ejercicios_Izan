package org.example;

import java.util.Scanner;

public class Tema2_bucle7 {
    public static void bucles7() {
        System.out.print("Introduce número");
        Scanner entrada = new Scanner(System.in);
        int num = entrada.nextInt();
        int fact = 1;
        for (int i=1; i<=num; i++) {
            fact = i * fact;

        }
        System.out.print("El factorial de " + num + " es " + fact);
    }
}
