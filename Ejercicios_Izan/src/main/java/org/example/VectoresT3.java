package org.example;

import java.util.Random;
import java.util.Scanner;

public class VectoresT3 {
    Scanner entrada = new Scanner(System.in);
    Random random = new Random();

    public void vectorest31(){

        int num[] = new int[8];
        int suma = 0;


        for (int i = 0; i< num.length; i++) {
            num[i] = random.nextInt(501);
            suma+=num[i];
        }

        System.out.println("La suma de los elementos es: " + suma);

    }

}
