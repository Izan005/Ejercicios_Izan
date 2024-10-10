package org.example;

import java.util.Scanner;

public class Tema2_ejercicio2 {
    public void t2ejercicio2() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un texto:");
        String texto1 = entrada.nextLine();
        System.out.println("Introduce otro texto:");
        String texto2 = entrada.nextLine();

        int texto1_n = texto1.length();
        int texto2_n = texto2.length();

        if (texto1_n < texto2_n){
            System.out.println(texto1 + " es más corto que " + texto2);
        }
        if (texto1_n > texto2_n ) {
            System.out.println(texto1 + " es más largo que " + texto2);
            }
        if (texto1_n == texto2_n) {
            System.out.println(texto1 + " es igual " + texto2);
        }
    }
}