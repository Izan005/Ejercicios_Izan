package org.example;

import java.util.Scanner;

public class Tema2_ejercicio4 {
    public void t2ejercicio4() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce una cadena...");
        String cadena = entrada.nextLine();

        System.out.println("Introduce la palabra repetida");
        String palabra = entrada.next();

        String cadena1 = " " + cadena + " ";
        int cadena_l = cadena1.length();
        int palabra_l = palabra.length();

        String palabra_fin = cadena1.replace(" " + palabra + " ", "");
        int palabra_finfin = palabra_fin.length();
        int fin = (cadena_l - palabra_finfin) / palabra_l;
        System.out.println("Tiene " + palabra + fin + " veces");

    }
}
