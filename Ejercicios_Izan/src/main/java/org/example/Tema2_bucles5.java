package org.example;

import java.util.Scanner;

public class Tema2_bucles5 {
    public static void bucles5(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un número");
        int num = entrada.nextInt();

        for (int i=0; i<=10; i++) {
            int result = i * num;
            System.out.println(result);
        }
    }


}
