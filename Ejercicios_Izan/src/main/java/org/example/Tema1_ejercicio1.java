package org.example;

//Ejercicio 1 (hecho en DFD). Realizar un programa que
//pida un número al usuario, que deberá introducirlo usando
//el teclado. El algoritmo debe identificar si el número introducido
//se trata de un número positivo (> 0) o un número negativo (< 0) y
//controlar el caso particular del número 0, que es natural.

import java.util.Scanner;

public class Tema1_ejercicio1 {

    public void ejercicio1() {

        System.out.println("Introduce un número:");
        Scanner entrada = new Scanner(System.in);

        int num = entrada.nextInt();

        if (num==0) {
            System.out.println("El número " + num + " no es ni positivo ni negativo");}

        else {
            if (num>0) {
                System.out.println("El número " + num + " es positivo");
            } else {
                System.out.println("El número " + num + " es negativo");
            }
        }
    }

}