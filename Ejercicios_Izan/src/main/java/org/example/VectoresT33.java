package org.example;

import java.util.Random;
import java.util.Scanner;

public class VectoresT33 {
    public void vectores33(){
        Scanner entrada = new Scanner(System.in);
        Random random = new Random();

        int num[] = new int[25];

        System.out.println("Ingresa número para buscar [0, 100]: ");
        int num_op = entrada.nextInt();

        int cont = 0;
        for(int i = 0; i<num.length; i++){
            num[i] = random.nextInt(0, 100) + 1;
            System.out.println(num[i]);
            if (num_op == num[i]) {
                cont++;
            }
        }
        System.out.println("El número " + num_op + " aparece " + cont + " veces");
    }


}
