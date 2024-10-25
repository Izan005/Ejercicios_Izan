package org.example;

import java.util.Random;

public class EjercicioRandom4 {
    public static void r2() {
        Random random = new Random();

        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        int random1 = random.nextInt(6, 8);
        int len = caracteres.length();
        int num;
        for (int i = 0; i<=random1; i++) {
            int carnum = random.nextInt(len);
            String pass = caracteres.substring(carnum, carnum+1);
            System.out.print(pass);
        }
    }
}
