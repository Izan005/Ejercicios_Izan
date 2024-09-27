package org.example;

import java.util.Scanner;

public class Práctica3 {
    public static void practica3(){
        System.out.println("¿Cómo te llamas?:");
        Scanner entrada = new Scanner(System.in);
        String nom = entrada.next();

        System.out.println("Hola " + nom + ". Introduce tu edad");
        int edad = entrada.nextInt();

        while (edad < 0){
            System.out.println("ERROR. Tu edad no puede ser menor que 0. Introduce de nuevo tu edad");
            edad = entrada.nextInt();
        }
        if (edad <= 17) {
            System.out.println("No puedes votar. Eres menor de edad.");
            int edad_restante = 18 - edad;
            System.out.println("Te faltan " + edad_restante + " años para ser mayor de edad.");
        }
        else {
            System.out.println("Enhorabuena " + nom + ". Puedes votar.");
        }
    }
}
