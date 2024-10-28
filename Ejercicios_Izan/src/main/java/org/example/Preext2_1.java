package org.example;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Preext2_1 {
    public static void t2_1(){
        Scanner entrada = new Scanner(System.in);
        Random random = new Random();
        int num = 0;
        int menor = 0;
        int mayor = 0;
        int igual = 0;
        boolean valid = false;
        int random1 = random.nextInt(1, 10);

        for (int i=0; i<random1; i++){
            int rest = random1 - i;
            while (!valid) {
                try {
                    System.out.println("Introduce " + random1 + " números (" + rest + " restantes)");
                    num = entrada.nextInt();
                    valid = true;
                }catch (InputMismatchException e) {
                    System.out.println("ERROR. Solo puedes introducir números.");
                    entrada.next();
                }

            }

            if (num < 0) {
                System.out.println(num + " es menor que 0");
                menor++;
            } else if (num > 0) {
                System.out.println(num + " es mayor que 0");
                mayor++;
            } else {
                System.out.println(num + " es 0");
                igual++;
            }
            valid = false;
        }
        System.out.println();
        System.out.println("Números menores que 0: " + menor);
        System.out.println("Números mayores que 0: " + mayor);
        System.out.println("Números iguales que 0: " + igual);
    }

}
