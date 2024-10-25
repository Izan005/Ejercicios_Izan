package org.example;

import java.util.Random;
import java.util.Scanner;

public class EjercicioRandom3 {
    public static void r3(){
        Scanner entrada = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Introduce rango mínimo:");
        int num1 = entrada.nextInt();
        System.out.println("Introduce rango máximo:");
        int num2 = entrada.nextInt();

        while (num1 > num2) {
            System.out.println("El mínimo no puede ser mayor que el máximo. Introduce de nuevo los números.");
            System.out.println("Introduce rango mínimo:");
            num1 = entrada.nextInt();
            System.out.println("Introduce rango máximo:");
            num2 = entrada.nextInt();
        }

        System.out.println("¿Cuántos números quieres?");
        int num3 = entrada.nextInt();
        System.out.println("Los números generados son:");
        int random1;

        for (int i = 0; i!=num3; i++) {
            random1 = random.nextInt(num2 - num1 + 1) + num1 ;
            System.out.println(random1);
        }

    }
}
