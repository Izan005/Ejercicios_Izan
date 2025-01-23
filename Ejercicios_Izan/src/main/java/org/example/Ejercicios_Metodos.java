package org.example;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicios_Metodos {
    public static void ejercicio1() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce un número:");
        int num = entrada.nextInt();
        System.out.println("El número " + num + " al cubo es: " + MetodosVarios.Cubo(num));
    }
    public static void ejercicio2() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce un número de opciones: ");
        int opc = entrada.nextInt();

        int[] vector = new int[opc];

        MetodosVarios.RellenarVectInt(vector);
        MetodosVarios.mostrarVectInt(vector);

        System.out.println();
        System.out.println("Introduce un número válidio:");
        opc = entrada.nextInt();
        boolean salir = false;
        for (int i = 0; i < vector.length; i++) {
            if (i == opc) {
                salir = true;
                break;
            }
        }

        if (salir == true) {
            System.out.println("Opción válida");
        } else {
            System.out.println("Opción no válida");
        }
    }
    public static void ejercicio3() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce una cadena: ");
        String cadena = entrada.next();
        String cadenamayus = cadena.toUpperCase();
        System.out.println(cadenamayus);
        System.out.println("Hay en total " + MetodosVarios.contarVocales(cadenamayus) + " vocales en total.");

    }
    public static void ejercicio4() {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Introduce los datos de una semana");
        float vec_semana[] = MetodosVarios.semana();
        System.out.println(Arrays.toString(vec_semana));
    }
}
