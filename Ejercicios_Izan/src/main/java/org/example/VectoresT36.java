package org.example;

import java.util.Scanner;

public class VectoresT36 {
    public void vectores36() {

        Scanner entrada = new Scanner(System.in);

        int num[] = new int[5];
        int si = 0;


        System.out.println("Introduce el array: ");

        for (int i = 0; i< num.length; i++) {
            System.out.println("Posición " + i + ": ");
            num[i] = entrada.nextInt();
        }

        for (int i = 0; i<num.length; i++) {
            if (num[i] == num.length-(i)) {
            } else {
                si++;
                break;
            }
        }

        if (si == 0) {
            System.out.println("SÍ ES SIMÉTRICO");
        } else {
            System.out.println("NO ES SIMÉTRICO");
        }





    }
}
