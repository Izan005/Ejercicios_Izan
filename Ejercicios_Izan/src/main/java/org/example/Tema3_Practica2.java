package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Tema3_Practica2 {
    public void t3p2() {
        Scanner entrada = new Scanner(System.in);
        Random random = new Random();

        int boleto_premio[] = new int[6]; //Vector que almacena el número premiado.
        int boleto_limpio[] = Arrays.stream(boleto_premio).distinct().toArray(); //Vector para almacenar el vector boleto_premio sin duplicidades.
        int complementario[] = new int[1]; //Vector que almacena el complementario
        complementario[0] = random.nextInt(49)+1; //Se asigna un número del 0-49 aleatorio para el complemntario.
        int reintegro = random.nextInt(9)+1; //Se asigna un número del 0-9 aleatorio para el reintegro.



        do { //Genera el número de la lotería (aleatorio) y comprueba que no haya números repetidos. Si los hay, vuelve a generar el número de la lotería.

            for (int i = 0; i<boleto_premio.length; i++) {
                boleto_premio[i] = random.nextInt(49) + 1;
            }
            Arrays.sort(boleto_premio); //Ordena los números del array de menor a mayor.

            boleto_limpio = Arrays.stream(boleto_premio).distinct().toArray(); //Elimina las duplicidades del vector.

        } while (boleto_limpio.length != 6); //Si el vector sin duplicidades reduce su tamaño (encuentra duplicidades y las elimina) repite entero el bucle hasta que
        // no encuentre ninguna duplicidad.


        for (int i = 0; i<boleto_premio.length; i++) { //Bucle que repasa el vector boleto_premio y mira si hay alguna cifra igual al número comlementario.
            // Si el complementario es igual a un número del vector boleto_premio, se vuelve a asignar un número aleatorio.

            if (complementario[0] == boleto_premio[i]) {
                complementario[0] = random.nextInt(49)+1;
            }
        }

        //Lineas "chuleta" para realizar pruebas.
//        System.out.println("Premio: " + Arrays.toString(boleto_premio));
//        System.out.println("Complementario: " + Arrays.toString(complementario));
//        System.out.println("Reintegro: " + reintegro);

        System.out.println("Introduce los datos de tu boleto: ");
        String tu_num = entrada.next(); //Solicito los datos del boleto del usuario.

        boolean formato = tu_num.matches("\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}/\\d"); //Compruebo que el formato del boleto es "X-X-X-X-X-X/X".

        if (formato == false) { //Si el formato del método matches es incorrecto, se cierra el programa.
            System.out.println("Formato incorrecto. Cerrando el programa...");
            return;
        }

        String tu_num_split[] = tu_num.split("[-/]"); //Se aplica el método split a tu número escogido separando los números por los caracteres "-" y "/".

        for (int i = 0; i<tu_num_split.length; i++) { //Bucle que comprueba que los números introducidos en el boleto del usuario no sean ni menores que 1 ni mayores que
            // 49.
            int tu_num_int = Integer.parseInt(tu_num_split[i]); //Convierto el número en la posición "i" del vector split a int para poder comprobar si es menor que 1 o
            // mayor que 49 y si es así solicito el número específico a cambiar en el boleto.

            if (tu_num_int < 1 || tu_num_int > 49 ) {
                System.out.println("Número en formato incorrecto.");
                System.out.println("Introduce de nuevo el número de la posición: " + (i+1));
                tu_num_split[i] = entrada.next();
                i--;
            }
        }

        int aciertos = 0; //Almacena la cantidad de aciertos del boleto del usuario.
        int aciertos_comp = 0; //Almacena si se acierta el reitegro (1) o no (0).
        int aciertos_re = 0; //Almacena si se acierta el reintegro (1) o no (0).

        for (int i = 0; i<tu_num_split.length-1; i++) {
            int tu_num_int = Integer.parseInt(tu_num_split[i]);

            if (tu_num_int == boleto_premio[i]) {
                aciertos++;
            }
            else if (tu_num_int == complementario[0]) {
                aciertos_comp++;
            }
        }

        int tu_num_reint = Integer.parseInt(tu_num_split[6]); //Paso a int el reintegro del boleto del usuario y lo comparo con el reintegro del boleto para ver si
        // ha acertado.
        if (tu_num_reint == reintegro) {
            aciertos_re++;
        }

        System.out.println(); //Muestro el número premiado, el complementario y el reintegro.
        System.out.println("***RESULTADOS DEL SORTEO***");
        System.out.println("Boleto premiado: " + Arrays.toString(boleto_premio));
        System.out.println("Complementario: " + Arrays.toString(complementario));
        System.out.println("Reintegro: " + reintegro);

        if (aciertos == 6 && aciertos_re == 1) { //Dependiendo de cuantos aciertos haya tenido el boleto el usuario respecto al boleto premiado, el reintegro y el
            // complementario se imprimirá por pantalla la categoría lograda.
            System.out.println("Has conseguido la categoría ESPECIAL");
        } else if (aciertos == 6) {
            System.out.println("Has conseguido la 1ªcategoría");
        } else if (aciertos == 5 && aciertos_comp == 1) {
            System.out.println("Has conseguido la 2ªcategoría");
        } else if (aciertos == 5) {
            System.out.println("Has conseguido la 3ªcategoría");
        } else if (aciertos == 4) {
            System.out.println("Has conseguido la 4ªcategoría");
        } else if (aciertos == 3) {
            System.out.println("Has acertado la 5ªcategoría");
        } else if (aciertos_re == 1) {
            System.out.println("Has acertado el reintegro");
        } else if (aciertos <=2 && aciertos_re < 1 && aciertos_comp < 1) {
            System.out.println("Has perdido");
        }
    }
}