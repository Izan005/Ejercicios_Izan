package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Tema3_Practica1 {
    public void t31() {
        Scanner entrada = new Scanner(System.in);
        Random random = new Random();

        //Variables y vectores utilizados para el primer grupo de samurais
        String sam1 = " "; //Almacena la potencia con el separador ",".
        String sam1_split[] = sam1.split(","); //Aplica el método SPLIT en la variable anterior y usa como separador ",".
        int sam1_int[] = new int[7]; //Vector que almacena en formato int los números del vector split anterior.
        int suma1 = 0; //Variable que almacena la suma de las potencias del equipo 1 de samurais.
        int bajas1 = 0; //Bajas del equipo 1 de samurais.

        //Variables y vectores utilizados para el segundo grupo de samurais
        String sam2 = " "; //Almacena la potencia con el separador ",".
        String sam2_split[] = sam2.split(","); //Aplica el método SPLIT en la variable anterior y usa como separador ",".
        int sam2_int[] = new int[7]; //Vector que almacena en formato int los números del vector split anterior.
        int suma2 = 0; //Variable que almacena la suma de las potencias del equipo 2 de samurais.
        int bajas2 = 0; //Bajas del equipo 2 de samurais.

        int j = 0; //Variable que hará de contador después.
        int sam_random = random.nextInt(1,8); //Número aleatorio que decide la posición en los vectores de cada samurai para decidir quién pelea.

        //Introducción de potencia de los SAMURAIS 1.

        System.out.println("Introduce potencia de los samurais nº1 separadas por ',': "); //Solicito potencia del grupo 1 de samurais

        do {  //Bucle para introducir la potencia del grupo 1 de samurais y comprobar si los datos introducidos son o no correctos.

            sam1 = entrada.nextLine(); //Solicito la variable string con las potencias separadas por ",".
            sam1_split = sam1.split(","); //Se aplica el método split sobre la cadena anterior separado por ",".
            suma1 = 0; //Se situa la suma de las potencias en 0 para evitar errores.


            if (sam1_split.length != 7) { //if que comprueba que las potencias introducidas sean únicamente 7. Si es así, se ejecuta el continue.
                System.out.println("Datos incorrectos. Introduce de nuevo la potencia. ");
                continue;
            } else { //Si la condición anterior no se cumple, se parsea el vector del método split en un vector int.

                try { //Se realiza un try-catch que comprueba que ninguna potencia sea un caracter distinto a un número int. Si salta el error, se regresa al principio
                    // del bucle do-while.
                    for (int i = 0; i < sam1_split.length; i++) {
                        sam1_int[i] = Integer.parseInt(sam1_split[i]);
                    }
                } catch (NumberFormatException e) {
                    System.out.println("ERROR. Formato incorrecto. Introduce de nuevo las potencias: ");
                    entrada.next();
                    continue;
                }

                for (int n : sam1_int) { //Bucle que repasa las posiciones del vector int anterior y suma sus contenidos.
                    suma1 += n;
                }
            }
            if (suma1 != 30) { //if que comprueba que la suma de las potencias no sea distinta a 30. Si es así, se ejecuta el continue.
                System.out.println("La suma de las potencias tiene que ser 30. Introduce de nuevo la potencia.");
                continue;
            }

            for (int n : sam1_int) { //Bucle que comprueba que ninguna potencia de los samurais esté dentro del rango de números del 1 al 24.
                if (n < 1 || n > 24) {
                    System.out.println("La potencia de cada samurai no puede ser ni menor que 0 ni mayor que 24. Introduce de nuevo la potencia.");
                    suma1++;
                    break;
                }
            }

        } while (sam1_split.length != 7 || suma1 != 30); //Se comprueba que la potencia introducida sea de 7 posiciones y que la suma de las potencias sea 30.

        //Muestro por pantalla el vector int con las potencias de los samurais e imprimo que el equipo 1 se ha completado.
        System.out.println(Arrays.toString(sam1_int));
        System.out.println("Equipo 1 completado");

       //Introducción de potencia de los SAMURAIS 2.

        System.out.println("Introduce potencia de los samurais nº2 separadas por ',': "); //Solicito potencia del grupo 2 de samurais

        do {  //Bucle para introducir la potencia del grupo 2 de samurais y comprobar si los datos introducidos son o no correctos.
            sam2 = entrada.nextLine(); //Solicito la variable string con las potencias separadas por ",".
            sam2_split = sam2.split(","); //Se aplica el método split sobre la cadena anterior separado por ",".
            suma2 = 0; //Se situa la suma de las potencias en 0 para evitar errores.


            if (sam2_split.length != 7) { //if que comprueba que las potencias introducidas sean únicamente 7. Si es así, se ejecuta el continue.
                System.out.println("Datos incorrectos. Introduce de nuevo la potencia. ");
                continue;
            } else { //Si la condición anterior no se cumple, se parsea el vector del método split en un vector int.

                try { //Se realiza un try-catch que comprueba que ninguna potencia sea un caracter distinto a un número int. Si salta el error, se regresa al principio
                    // del bucle do-while.
                    for (int i = 0; i < sam2_split.length; i++) {
                        sam2_int[i] = Integer.parseInt(sam2_split[i]);
                    }
                }catch (NumberFormatException e) {
                    System.out.println("ERROR. Formato incorrecto. Introduce de nuevo las potencias: ");
                    entrada.next();
                    continue;
                }

                for (int n : sam2_int) { //Bucle que repasa las posiciones del vector int anterior y suma sus contenidos.
                    suma2 += n;
                }
            }

            if (suma2 != 30) { //if que comprueba que la suma de las potencias no sea distinta a 30. Si es así, se ejecuta el continue.
                System.out.println("La suma de las potencias tiene que ser 30. Introduce de nuevo la potencia.");
                continue;
            }

            for (int n : sam2_int) { //Bucle que comprueba que ninguna potencia de los samurais esté dentro del rango de números del 1 al 24.
                if (n < 1 || n > 24) {
                    System.out.println("La potencia de cada samurai no puede ser ni menor que 0 ni mayor que 24. Introduce de nuevo la potencia.");
                    suma2++;
                    break;
                }
            }

        } while (sam2_split.length != 7 || suma2 != 30); //Se comprueba que la potencia introducida sea de 7 posiciones y que la suma de las potencias sea 30.

        //Muestro por pantalla el vector int con las potencias de los samurais e imprimo que el equipo 2 se ha completado.
        System.out.println(Arrays.toString(sam2_int));
        System.out.println("Equipo 2 completado");

        System.out.println("¡Empieza la batalla!"); //Anuncio el comienzo de la batalla y muestro por pantalla los samurais que van a pelear con un número aleatorio.

        System.out.println("La batalla comienza con el samurai " + (sam_random+1) + "."); //Sumo 1 al número aleatorio para mostrar por pantalla los números
        // del 1 al 7 en vez del 0 al 6.

        System.out.println(); //Imprimo un espacio en blanco como separador de contenidos.

        for (int i = sam_random; i<sam1_int.length; i++) { //Bucle que parte desde una posición aleatoria de los vectores de los samurais y avanza hasta el final de
            // los dos vectores de los samurais.

            System.out.print("Samurai " + (i+1) + ". "); //Muestro los samurais que van a pelear.

            if (sam1_int[i] < sam2_int[i]) { //Victoria equipo 2. Se añade un punto a las bajas del equipo 1 y se reduce a 0 la potencia del samurai derrotado.
                System.out.println("Gana el equipo 2. " + sam1_int[i] + " vs " + sam2_int[i]);
                sam1_int[i] = 0;
                bajas1++;
            } else if (sam2_int[i] < sam1_int[i]) { //Victoria equipo 1. Se añade un punto a las bajas del equipo 2 y se reduce a 0 la potencia del samurai derrotado.
                System.out.println("Gana el equipo 1. " + sam1_int[i] + " vs " + sam2_int[i]);
                sam2_int[i] = 0;
                bajas2++;
            } else if (sam1_int[i] == sam2_int[i]) { //Empate. Se añade un punto a las bajas de los 2 equipos y se reducen a 0 las potencias de los samurais derrotados.
                System.out.println("Empate. Mueren los 2 samurais");
                sam1_int[i] = 0;
                sam2_int[i] = 0;
                bajas1++;
                bajas2++;
            }

            if (bajas1 == 4 || bajas2 == 4) { //Si las bajas de cualquiera de los 2 equipos llega a 4, se termina el combate cerrando el bucle y se declara como
                // perdedor al equipo con 4 bajas.
                break;
            }
            j++; //Variable que comprueba si se han recorrido las 7 posiciones del vector. Si se llega en el bucle a i=longitud_de_vector_samurai y j no es 7,
            // se suma 1 al contador de variable j que nos verificará si hay que entrar en el siguiente condicional o no.
        }

        if (j != 7 && bajas1 != 4 && bajas2 != 4) { //Si j es distinto a 7 (no se han recorrido todas las posiciones de los vectores) y las bajas de los 2 samurais
            // no son 4, se abre un bucle for igual al anterior pero con la diferencia de que empezamos a repasar los vectores desde la posición 0 de los vectores
            // hasta llegar a la posición en la que habíamos empezado en el bucle anterior.
            for (int i = 0; i<sam_random; i++) {
                System.out.print("Samurai " + (i+1) + ". "); //Muestro los samurais que van a pelear.

                if (sam1_int[i] < sam2_int[i]) { //Victoria equipo 2. Se añade un punto a las bajas del equipo 1 y se reduce a 0 la potencia del samurai derrotado.
                    System.out.println("Gana el equipo 2. " + sam1_int[i] + " vs " + sam2_int[i]);
                    sam1_int[i] = 0;
                    bajas1++;
                } else if (sam2_int[i] < sam1_int[i]) { //Victoria equipo 1. Se añade un punto a las bajas del equipo 2 y se reduce a 0 la potencia del samurai derrotado.
                    System.out.println("Gana el equipo 1. " + sam1_int[i] + " vs " + sam2_int[i]);
                    sam2_int[i] = 0;
                    bajas2++;
                } else if (sam1_int[i] == sam2_int[i]) { //Empate. Se añade un punto a las bajas de los 2 equipos y se reducen a 0 las potencias de los samurais derrotados.
                    System.out.println("Empate. Mueren los 2 samurais");
                    sam1_int[i] = 0;
                    sam2_int[i] = 0;
                    bajas1++;
                    bajas2++;
                }
                if (bajas1 == 4 || bajas2 == 4) { //Si las bajas de cualquiera de los 2 equipos llega a 4, se termina el combate cerrando el bucle y se declara como
                    // perdedor al equipo con 4 bajas.
                    break;
                }
            }
        }

        System.out.println();
        if (bajas1 < bajas2) { //Si gana el equipo 1 (bajas del equipo 1 son menores que las del equipo 2) se imprime el ganador y las bajas de los 2 equipos.
            System.out.println("GANA EL EQUIPO 1.");
            System.out.println("Bajas del equipo 1: " + bajas1);
            System.out.println("Bajas del equipo 2: " + bajas2);
        } else if (bajas1 > bajas2) {
            System.out.println("GANA EL EQUIPO 2."); //Si gana el equipo 2 (bajas del equipo 2 son menores que las del equipo 1) se imprime el ganador y las bajas
            // de los 2 equipos.
            System.out.println("Bajas del equipo 1: " + bajas1);
            System.out.println("Bajas del equipo 2: " + bajas2);
        } else {
            System.out.println("EMPATE."); //Si los 2 equipos empatan (bajas del equipo 1 y 2 son iguales) se imprime el empate y las bajas de los 2 equipos.
            System.out.println("Bajas del equipo 1: " + bajas1);
            System.out.println("Bajas del equipo 2: " + bajas2);
        }
    }
}