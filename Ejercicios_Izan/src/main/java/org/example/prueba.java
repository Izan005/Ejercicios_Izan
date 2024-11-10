package org.example;

import java.util.Scanner;
import java.util.InputMismatchException;
public class prueba {
    public void ejer7(){
        Scanner scanner = new Scanner(System.in);

        int termino = 0;

        boolean salidavalida = false;
        while (!salidavalida) {
            try {
                System.out.print("Cuantos términos de secuencia deseas ver (números enteros y positivos): ");
                termino = scanner.nextInt();
                salidavalida = true;

                if (termino <= 0){
                    System.out.println("**ERROR: Solo se permiten números enteros y positivos. Inténtalo de nuevo.**");
                    salidavalida=false;
                }
            } catch (InputMismatchException e) {
                System.out.println("**ERROR: Solo se permiten números enteros y positivos. Inténtalo de nuevo.**");
                scanner.next();
            }
            catch (ArithmeticException e){
                System.out.println("**ERROR: Solo se permiten números enteros y positivos. Inténtalo de nuevo.**");
                scanner.next();

            }
        }
        int a = 0, b = 1, c;
        System.out.print("Secuencia de Números: ");
        for (int i = 0; i < termino; i++) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
        System.out.println();
    }

}

