package org.example;

import java.util.Scanner;

public class Actividad_inicial {

   public void ejecutar() {

        System.out.println("¿Cómo te llamas?");
        Scanner entrada = new Scanner(System.in);
        String nombre = entrada.next();

        System.out.println("¿A qué curso vas?");
        String curso = entrada.next();

        System.out.println("Hola " + nombre + ", bienvenido a " + curso + ".");

        System.out.println("Introduce un número:");
        int numero = entrada.nextInt();

        System.out.println("Introduce otro número:");
        int numero2 = entrada.nextInt();

        if (numero==0 || numero2==0){
            System.out.println("Los sumandos no pueden ser 0");
        }
        else {
            int suma = numero + numero2;
            System.out.println("El resultado de la suma es :" + suma);
        }
    }
}

