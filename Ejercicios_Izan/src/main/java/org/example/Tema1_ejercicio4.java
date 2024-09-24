package org.example;

import java.util.Scanner;

public class Tema1_ejercicio4 {
    public void ejercicio4() {
        System.out.println("Introduce valor base:");
        Scanner entrada = new Scanner(System.in);
        double num1 = entrada.nextInt();

        while (num1 <= 0) {
            System.out.println("El valor de la base tiene que ser positivo. Introduce el número de nuevo");
            num1 = entrada.nextInt();

        }
        System.out.println("Introduce valor altura:");
        double num2 = entrada.nextInt();

        while (num2 <= 0) {
            System.out.println("El valor de la altura tiene que ser positivo. Introduce el número de nuevo");
            num2 = entrada.nextInt();
        }
        double area = num1 * num2 / 2;

        System.out.println("El área de un triángulo es " + area);
    }
}