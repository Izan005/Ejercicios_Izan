package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ruleta {
    public void ruleta() {
        Scanner entrada = new Scanner(System.in);
        Random random = new Random();

        String colores[] = {"rojo", "negro"};
        boolean color_valido = true;
        String color = "";
        String valores[] = {"Par", "Impar"};
        boolean valor_valido = true;
        String valor = "";
        Integer numeros[] = new Integer[37];

        for (int i = 0; i<numeros.length; i++) {
            numeros[i] = i;
        }
        System.out.println("****BIENVENIDO A LA RULETA****");

        System.out.println("Introduce número (0-36)");
        int num = entrada.nextInt();

        boolean numeros_valido = Arrays.asList(numeros).contains(num);

        if (!numeros_valido) {
            System.out.println("Número fuera del rango. Saliendo del programa...");
            return;
        } else {

            if (num == 0) {
                int num_random_0 = numeros[random.nextInt(numeros.length)];
                System.out.println("Has elegido 0, por lo que no hace falta color ni valor.");
                System.out.println("****LA RULETA ESTÁ GIRANDO****");

                System.out.println("Ha tocado el número: " + num_random_0);
                if (num_random_0 == 0) {
                    System.out.println("HAS GANADO. El resto de usuarios pierde.");
                } else {
                    System.out.println("HAS PERDIDO");
                }

            } else {
                System.out.println("Introduce el color (sorteo_par / impar):");
                color = entrada.next();
                color.toLowerCase();
                color_valido = Arrays.asList(colores).contains(color);

                if (!color_valido) {
                    System.out.println("Color no válido. Saliendo del programa...");
                    return;
                }

                System.out.println("Introduce el valor (sorteo_par / impar):");
                valor = entrada.next();
                valor.toLowerCase();

                valor_valido = Arrays.asList(valores).contains(valor);
                if (!valor_valido) {
                    System.out.println("Valor no válido. Saliendo del programa...");
                    return;
                }

                System.out.println("****LA RULETA ESTÁ GIRANDO****");

                String color_random = colores[random.nextInt(colores.length)];
                int num_random = numeros[random.nextInt(numeros.length)];

                String sorteo_par = "";

                if (num_random % 2 == 0) {
                    sorteo_par = "par";
                }else {
                    sorteo_par = "impar";
                }

                System.out.println("Ha tocado el color: " + color_random);
                System.out.println("Ha tocado el número :" + num_random + " que es " + sorteo_par );

                if (sorteo_par == valor && color_random == color && num_random == num) {
                    System.out.println("HAS GANADO");
                } else if (color_random == color && num_random != num && sorteo_par != valor) {
                    System.out.println("Has acertado el color");
                } else if (color_random != color && num_random == num && sorteo_par != valor) {
                    System.out.println("Has acertado el número");
                } else if (color_random != color && num_random != num && sorteo_par == valor) {
                    System.out.println("Has acertado el valor (par o impar)");
                } else {
                    System.out.println("HAS PERDIDIO");
                }
            }
        }
    }
}
