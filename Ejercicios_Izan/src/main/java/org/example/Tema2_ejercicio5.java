package org.example;

import java.util.Scanner;

public class Tema2_ejercicio5 {
    public void t2ejercicio5(){


        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa la cadena, J1");
        String j1 = entrada.nextLine();

        System.out.println("Ingresa una palabra, J2");
        String j2 = entrada.next();

        String palabra = " " + j2 + " ";

       for (int i=1; i <= 10; i++) {
            int acierto = j1.indexOf(j2);
            if (acierto >= 0) {
                System.out.println("Has acertado");
                i=10;
            } else {
                System.out.println("Has fallado, siguiente intento (" + i + " de 10)");
                j2 = entrada.next();
            }
        }
    }
}
