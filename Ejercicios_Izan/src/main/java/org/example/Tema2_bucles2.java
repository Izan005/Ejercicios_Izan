package org.example;

import java.util.Scanner;

public class Tema2_bucles2 {
    public static void bucles2(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un número");
        int num = entrada.nextInt();

        for (int i=num; i>=0; i--) {
            System.out.println(i);
        }
    }
}
