package org.example;

import java.util.Scanner;

public class VectoresT32 {
    public void vectores32(){

        Scanner entrada = new Scanner(System.in);
        int num[] = new int[5];

        for (int i = 0; i< num.length; i++) {
            System.out.println("Introduce num en posición " + i);
            num[i] = entrada.nextInt();
        }

        System.out.print("Array original: ");

        for (int i = 0; i<num.length; i++) {
            System.out.print(" " + num[i] + " ");

        }

        System.out.print("Array invertido: ");



//        for (int i = num.length-1; i>=0; i--) {
//            System.out.print(" " + num[i] + " ");
//        }
    }
}
