package org.example;
import java.util.Scanner;

public class Tema2_bucles1 {
    public static void bucles1() {
        Scanner entrada = new Scanner(System.in);

        String pass = "patata";
        String pass2;
        do {
            System.out.println("Introduce tu contraseña");
            pass2 = entrada.next();
            if (pass2.equals(pass)){ break;}
        } while (pass != pass2);


         System.out.println("Contraseña correcta");
    }
}