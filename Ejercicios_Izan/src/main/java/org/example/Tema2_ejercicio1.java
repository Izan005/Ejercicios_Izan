package org.example;

import java.util.Scanner;

public class Tema2_ejercicio1 {
    public void t2ejercicio1(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un texto...");
        String texto = entrada.nextLine();

        System.out.println(texto);

        int texto_lenght = texto.length();
        System.out.println("La longitud de " + texto + " es:" + texto_lenght);

        String texto_replace = texto.replace(" ", "");
        System.out.println("El texto: " + texto + " sin espacios es: " + texto_replace);

        int mitad = texto_lenght / 2;
        String mitad1 = texto.substring(0, mitad);
        String mitad2 = texto.substring(mitad);

        System.out.println("La primera mitad del texto es: " + mitad1 + " y la segunda mitad es: " + mitad2);

        String texto_upper = texto.toUpperCase();

        System.out.println(texto_upper);

    }
}
