package org.example;
import java.util.Scanner;
public class Tema1_ejercicio5 {

    public static void ejercicio5(){

        System.out.println("Introduce un número");
        Scanner entrada = new Scanner(System.in);

        int num1 = entrada.nextInt();

        System.out.println("Introduce otro número");
        int num2 = entrada.nextInt();

        System.out.println("Introduce un último número");
        int num3 = entrada.nextInt();

        if (num1 == num2 || num1 == num3 || num2 == num3){
            System.out.println("ERROR: Hay varios números iguales");
        }
        else {
            if (num1 < num2 && num1 < num3) {
                System.out.println("El número mínimo es " + num1);
            }
            else {
                if (num2 < num1 && num2 < num3){
                    System.out.println("El número mínimo es " + num2);
                }
                else {
                    System.out.println("El número mínimo es " + num3);
                }
            }
        }

    }
}
