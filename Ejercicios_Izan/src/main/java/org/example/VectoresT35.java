package org.example;

import java.util.Scanner;

public class VectoresT35 {
    public void vectores35() {

        Scanner entrada = new Scanner(System.in);

        int num[] = new int[5];

        System.out.println("Introduce " + num.length + " números:");

        for (int i = 0; i<num.length; i++) {
            System.out.println("Introduce número en posición " + i);
            num[i] = entrada.nextInt();
        }
        for (int n : num) {
            System.out.print(n + ", ");
        }

        int ult_pos = num[num.length-1];

        for (int i = num.length - 1 ; i>=0; i--) {

            if (i == 0) {
                num[i] = ult_pos;
            } else {
                num[i] = num[i - 1];
            }
        }
        System.out.println(" ");
        for (int n : num) {
            System.out.print(n + ", ");
        }
    }
}
