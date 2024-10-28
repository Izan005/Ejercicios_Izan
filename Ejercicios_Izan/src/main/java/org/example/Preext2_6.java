package org.example;

import java.util.Scanner;

public class Preext2_6 {
    public static void t2_6(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("¿Cuántos alumnos quieres?");
        int num = entrada.nextInt();
        int alt = 0;
        int alt2 = 0;
        int edad = 0;
        int edad2 = 0;
        int alt_175 = 0;
        int edad_18 = 0;
        for (int i = 1; i<=num; i++) {
            System.out.println("Introduce altura " + i + " de " + num + " (en cm):");
            alt = entrada.nextInt();
            if (alt >= 175) {
                alt_175++;
            }
            alt2 = alt2 + alt;

            System.out.println("Introduce edad " + i + " de " + num + ":");
            edad = entrada.nextInt();
            if (edad >= 18) {
                edad_18++;
            }
            edad2 = edad2 + edad;
        }

        int alt_media = alt2 / num;
        int edad_media = edad2 / num;

        System.out.println("La edad media es: " + edad_media + " y la altura media es: " + alt_media);
        System.out.println("Hay " + edad_18 + " alumnos mayores de 18 años y " + alt_175 + " alumnos de más de 175cm");
    }
}
