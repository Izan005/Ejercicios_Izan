package org.example;

import java.util.Scanner;

public class Tema2_bucle6 {
    public static void bucles6(){
        System.out.println("¿Cuántos números quieres sumar?");
        Scanner entrada = new Scanner(System.in);
        int cant = entrada.nextInt();
        int result = 0;
        for (int i=1; i<=cant; i++){
            System.out.println("Introduce num " + i + " de " + cant);
            int num = entrada.nextInt();
            result = result += num;
        }
        System.out.println("El resultado es: " + result);
    }
}
