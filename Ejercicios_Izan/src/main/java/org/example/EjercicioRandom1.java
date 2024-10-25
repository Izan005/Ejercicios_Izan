package org.example;

import java.util.Random;
import java.util.Scanner;

public class EjercicioRandom1 {
    public static void r1(){
        Scanner entrada = new Scanner(System.in);
        Random random = new Random();

        int dado1 = random.nextInt(1, 6);
        int dado2 =random.nextInt(1, 6);

        System.out.println("El primer dado saca " + dado1);
        System.out.println("El segundo dado saca " + dado2);
    }
}
