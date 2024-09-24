package org.example;

//Ejercicio 2 (hecho en DFD). Realizar un programa que
//permita leer 2 números diferentes por teclado y nos
//diga cuál de ellos es el mayor. En caso de que el
//usuario introduzca dos números iguales, informaremos
//con el siguiente mensaje: "ERROR: los números introducidos son iguales".

import java.util.Scanner;

public class Tema1_ejercicio2 {

    public void ejercicio2() {
        System.out.println("Introduce un número:");
        Scanner entrada = new Scanner(System.in);
        int num1 = entrada.nextInt();

        System.out.println("Introduce otro número:");
        int num2 = entrada.nextInt();

        if (num1 == num2) {
            System.out.println("ERROR. Los 2 números son iguales.");
        }
        else {
            if (num1 > num2) {
                System.out.println(num1 + " es el mayor.");
            }
            else {
                System.out.println(num2 + " es el mayor.");
            }
        }
    }
}
