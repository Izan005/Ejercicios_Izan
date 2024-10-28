package org.example;

import java.util.Scanner;

public class Preext2_2 {
    public static void t2_2(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un número real (base):");
        int base = entrada.nextInt();
        int basei = base;
        System.out.println("Introduce otro número entero (exponente)");
        int exp = entrada.nextInt();

        for (int i =1; i<exp; i++) {
            base = base * basei;
        }
        System.out.println("El resultado de " + basei + "^" + exp + " es: " + base);
    }
}
