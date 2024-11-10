package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Preext2_7 {
    public static void t2_7 (){
        Scanner entrada = new Scanner(System.in);
        int sec = 0;
        boolean valid = false;

        while (!valid) {
            try {
                System.out.println("¿Cómo de larga quieres que sea la secuencia?");
                sec = entrada.nextInt();
                while (sec <= 0){
                    System.out.println("ERROR. Operador no válido. Vuelve a introducirlo");
                    sec = entrada.nextInt();
                }
                valid = true;
            }catch (InputMismatchException e){
                System.out.println("ERROR. Formato incorrecto.");
                entrada.next();
            }
        }

        int j = 0;
        int j2 = 1;
        for (int i = 1; i<=sec; i++) {
            System.out.print(j + " ");
            j = j + j2;
            j2 = j - j2;
        }
    }
}
