package org.example;

import java.util.Scanner;

public class Tema2_ejercicio3 {
    public void t2ejercicio3() {
        System.out.println("Introduce un número...");
        Scanner entrada = new Scanner(System.in);
        String m = entrada.nextLine();
        int num = m.length();

        System.out.println("Introduce el número de dígitos a eliminar");
        int n = entrada.nextInt();
        int numfin = num - n;

        String fin = m.substring(0, numfin);

        System.out.println("El número final es: " + fin);




    }
}
