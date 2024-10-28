package org.example;

import java.util.Scanner;

public class Tema2_bucle8 {
    public static void bucles8(){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce una cadena");
        String cad = entrada.nextLine();
        int lon = cad.length();

        for (int i=1; i<=lon; i++){
            int num = lon - i;

            String subcad = cad.substring(num);
            System.out.print(subcad);
        }
    }
}
