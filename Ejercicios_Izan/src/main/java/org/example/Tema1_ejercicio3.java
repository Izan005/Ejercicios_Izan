package org.example;

//Ejercicio 3. Realizar un programa para dividir
//dos números leídos por teclado y escribir el resultado.
//Se debe controlar que el divisor no sea igual a 0 e
//informaremos con el siguiente mensaje: "ERROR: no se" +
//        " puede dividir entre 0".


import java.util.Scanner;

public class Tema1_ejercicio3 {

    public void ejercicio3(){

        System.out.println("Introduce un número:");
        Scanner entrada = new Scanner(System.in);
        int num1 = entrada.nextInt();

        System.out.println("Introduce otro número:");
        int num2 = entrada.nextInt();

        if (num1==0 || num2==0) {
            System.out.println("ERROR. No se puede dividir entre 0");
        }
        else{
            int div = num1 / num2;
            System.out.println("El resultado es " + div);
        }
    }
}
