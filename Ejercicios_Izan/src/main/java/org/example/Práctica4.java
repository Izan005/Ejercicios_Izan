package org.example;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Práctica4 {
    public static void practica4() {
        Scanner entrada = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        boolean valid = false;
        while (!valid) {
            try {
                System.out.println("Introduce el multiplicando (3 cifras)");
                num1 = Integer.parseInt(entrada.nextLine()); //La linea intenta convertir en entero el dato introducido y, como no puede, salta a la siguiente línea (catch)
                valid = true;


            } catch (NumberFormatException | InputMismatchException e) {
                System.out.println("ERROR. No es un número entero. Introduce el número de nuevo");
            }

        }
        boolean valid2 = false;
        while (!valid2) {
            try {
                System.out.println("Introduce otro multiplicando (3 cifras)");
                num2 = Integer.parseInt(entrada.nextLine());
                valid2 = true;


            } catch (NumberFormatException | InputMismatchException e) {
                System.out.println("ERROR. No es un número entero. Introduce el número de nuevo");
            }

        }

        while (num1 < 100 || num1 > 999 || num2 < 100 || num2 > 999) {

            if (num1 < 100 || num1 > 999) {
                System.out.println("El número " + num1 + " no es de 3 cifras. Vuelve a introducirlo");
                num1 = entrada.nextInt();

            } if (num2 < 100 || num2 > 999) {
                System.out.println("El número " + num2 + " no es de 3 cifras. Vuelve a introducirlo");
                num2 = entrada.nextInt();
            }

        }
        String num1C = Integer.toString(num1);
        String num1C_1 = num1C.substring(0,1);
        String num1C_2 = num1C.substring(1,2);
        String num1C_3 = num1C.substring(2,3);

        int num_1 = Integer.parseInt(num1C_1);
        int num_2 = Integer.parseInt(num1C_2);
        int num_3 = Integer.parseInt(num1C_3);

        int mul1 = num_1 * num2;
        int mul2 = num_2 * num2;
        int mul3 = num_3 * num2;
        int mulfin = num1 * num2;

        System.out.println("  " + num1);
        System.out.println("x " + num2);
        System.out.println("-------");
        System.out.println("   " + mul3);
        System.out.println(" " + mul2 + "x");
        System.out.println(mul1 + "xx");
        System.out.println("-------");
        System.out.println(mulfin);

    }



}