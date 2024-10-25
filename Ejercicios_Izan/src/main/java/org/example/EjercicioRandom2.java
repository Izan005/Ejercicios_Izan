package org.example;

import java.util.Random;
public class EjercicioRandom2 {
    public static void r4() {
            Random random = new Random();

            String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

            int len = caracteres.length();

            for (int i = 0; i<=10; i++) {
                int carnum = random.nextInt(len);
                String pass = caracteres.substring(carnum, carnum+1);
                System.out.print(pass);
            }
        }
    }
