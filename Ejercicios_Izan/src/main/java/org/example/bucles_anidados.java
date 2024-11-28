package org.example;

import java.util.Scanner;

public class bucles_anidados {
    public void bucles_anidados1() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce altura");
        int num = entrada.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void bucles_anidados2() {

        for (int i = 0; i<=10; i++) {
            System.out.println("Tabla del " + i);
            for (int j = 0;j<=10; j++) {
                System.out.println(i + "x" + j + " = " + i*j);
            }
        }
    }
    public void bucles_anidados3() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int num = entrada.nextInt();

        bucle1:
        for (int i = 2; i<=num; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    continue bucle1;
                }
            }
            System.out.print(i + " ");
        }
    }
}