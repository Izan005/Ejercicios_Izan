package org.example;

import java.util.Scanner;

public class Ejercicio2_operadores_ternarios {
    public static void ternarios(){
        Scanner ent = new Scanner(System.in);
        int i = 0;
        int a=5, b=1, c=3;
        int result = a++ == b*3 - c ? a-10 :
                        b-4 == (c + 1) * (-b) ? a++ :
                                                    a-1;

        System.out.println("Resuelve este operador ternario");
        System.out.println("int a=5, b=1, c=3;");
        System.out.println("int result = a++ == b*3 - c ? a-10 : b-5 == (c + 1) * (-b) ? a++ : a-1;");
        System.out.println("¿Cuál es el resultado?");
        int num = ent.nextInt();

         for (i=3; i!=0; i--) {

             if (num != result) {
                 System.out.println("Resultado incorrecto. Prueba otra vez");
                 System.out.println(i + " intentos restantes.");
                 num = ent.nextInt();
             } else {
                 System.out.println("Has acertado. El resultado es " + result);
                 break;
             }
         }  if (i == 0) {
             System.out.println("Te has quedado sin intentos. El resultado era " + result);
        }


    }
}
