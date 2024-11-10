package org.example;

import java.util.Scanner;

public class VectoresT34 {
    public void vectores34(){
        Scanner entrada = new Scanner(System.in);

        int num[] = new int[5];
        int num2[] = new int[num.length - 1];

        System.out.println("Introduce " + num.length + " números:");

        for (int i = 0; i<num.length; i++) {
            System.out.println("Introduce número en posición " + i);
            num[i] = entrada.nextInt();
        }

        int j = 0;

        System.out.println("Ingresa índice a eliminar: ");
        int index = entrada.nextInt();

        for (int i = 0; i<num.length; i++) {

            if (i == index)
                continue;
            else {
                num2[j] = num[i];
                j++;
            }

        }
        for (int i : num2) {
            System.out.println(i + " ");
        }

    }

}

