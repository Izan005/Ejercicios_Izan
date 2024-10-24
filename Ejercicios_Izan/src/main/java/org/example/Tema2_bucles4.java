package org.example;

import java.util.Scanner;

public class Tema2_bucles4 {
    public static void bucles4(){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce cadena");
        String cadena = entrada.nextLine();
        int cadena_n = cadena.length();
        String cad;
        int j = 1;
        for (int i=0; i<cadena_n; i++) {
            cad = cadena.substring(i, j);
            System.out.println(cad);
            j++;
        }
    }
}
