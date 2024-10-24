package org.example;

import java.util.Scanner;

public class Práctica3_Tema2 {
    public static void isbn() {
        Scanner entrada = new Scanner(System.in);
        int sub = 0; //Asignamos 2 variables numéricas. "sub" la usaré para ir almacenando la posición de un dígito específico del ISBN y
        int result = 0; //"result" para ir almacenando el resultado de la operación de los dígitos del ISBN.


        System.out.println("Introduce ISBM a validar:");
        //Solicitamos el ISBN a validar y obtenemos su longitud de caracteres para asegurarnos de que no
        //sobrepasa los 10 dígitos.
        String isbn = entrada.next();
        int isbn_l = isbn.length();
        int inte = isbn.indexOf("?");
        //Buscamos la interrogación dentro del ISBN y almacenamos su posición.

        while (isbn_l != 10) { //Abro un bucle que verifica error de formato.
            System.out.println("ERROR de formato. Introduce de nuevo el ISBN");
            isbn = entrada.next();
            isbn_l = isbn.length();
            inte = isbn.indexOf("?");
        }

            isbn = isbn.toLowerCase();
            //Convertimos las posibles letras del ISBN a minúsculas para no causar errores al introducirlas en mayúsculas.

            String completo_inte;
            //Creamos una variable que almacena el futuro dígito que sustituirá a la interrogación. Esta variable es la substring de la variable
            //"completo" que se verá en las siguientes líneas.

            if (inte != -1) {//Si hay interrogante
                for (int i = 0; i < 10; i++) {
                    //Abro un bucle "padre" que comprende la primera parte del if abierto recientemente que recorre el isbn completo
                    //en búsqueda de la posición de la interrogación.
                    String carac = Integer.toString(i);
                    //Esta línea transforma la variable "i" (dígito del ISBN) a string para que no salte un error al pasar por
                    //la interrogación.
                    String part1 = isbn.substring(0, inte);
                    //Creo 2 variables que dividen el ISBN en 2 por la interrogación para encontrar el número que falta
                    //el cual solo puede ser un número del 0 al 9 (<10).
                    String part2 = isbn.substring(inte + 1);
                    String completo = part1 + Integer.toString(i) + part2;
                    //Cuando el bucle a encontrado el dígito que falta mediante calculos realizados dentro
                    //de seguientes if que se encuntran en el bucle for "padre" convierte a cadena el dígito que sustituye a la interrogación (i) y crea una variable
                    //llamada "completo" que junta la variable "part1", "i" y "part2" en una cadena.
                    result = 0;
                    sub = 0;


                    if (isbn.substring(9, 10).equals("x")) {//Si hay interrogante y X

                        for (int j = 10; j > 1; j--) {
                            String num = completo.substring(sub, sub + 1);
                            int num_n = Integer.parseInt(num);
                            result = result + (num_n * j);
                            sub++;
                            //Este bucle repasa el ISBN sabiendo ya el número misterioso y realiza los cálculos pertinentes para comprobar si el ISBN es correcto.
                        }

                        result = result + 10;
                        //Sumamos 10 al resultado de las operaciones ateriores ya que es a lo que equivale "x" en el ISBN

                        completo_inte = completo.substring(inte, inte + 1);
                        //Almaceno en una variable el número misterioso.

                        if (result % 11 == 0) {
                            System.out.println("El ISBN correcto es: " + completo);
                            System.out.println("El número misterioso es: " + completo_inte);
                            break;
                        }
                        //Imprimo el ISBN sin la interrogación con el número correspondiente y el número misterioso.


                    } else {//Si hay interrogante y no hay X
                        for (int p = 10; p >= 1; p--) {
                            String num = completo.substring(sub, sub + 1);
                            int num_n = Integer.parseInt(num);
                            result = result + (num_n * p);
                            sub++;
                            //Este bucle repasa el ISBN sabiendo ya el número misterioso y realiza los cálculos pertinentes para comprobar si el ISBN es correcto.
                        }

                        completo_inte = completo.substring(inte, inte + 1);
                        //Almaceno en una variable el número misterioso.

                        if (result % 11 == 0) {
                            System.out.println("El ISBN correcto es: " + completo);
                            System.out.println("El número misterioso es: " + completo_inte);
                            break;
                        } //Imprimo el ISBN sin la interrogación con el número correspondiente y el número misterioso.

                    }
                }
                if (result % 11 != 0) {
                    System.out.println("ISBN incorrecto");
                }
                //Si los cálculos de comprobación del ISBN no dan un múltiplo de 11 el programa nos dice que el ISBN es incorrecto.

            } else {//Si no hay interrogante
                if (isbn.substring(9, 10).equals("x")) {//Si no hay interrogante y sí hay X

                    for (int j = 10; j > 1; j--) {
                        String num = isbn.substring(sub, sub + 1);
                        int num_n = Integer.parseInt(num);
                        result = result + (num_n * j);
                        sub++;
                        //Este bucle repasa el ISBN y realiza los cálculos pertinentes para comprobar si el ISBN es correcto.
                    }

                    result = result + 10;
                    //Sumamos 10 al resultado de las operaciones ateriores ya que es a lo que equivale "x" en el ISBN.

                    if ((result % 11) == 0) {
                        System.out.println("ISBN correcto");
                        //Imprimo si el resultado de la operación anterior es múltiplo de 11 (correcto)
                    } else {
                        System.out.println("ISBN incorrecto");
                        //Imprimo si el resultado de la operación anterior NO es múltiplo de 11 (incorrecto)
                    }

                } else {//Si no hay interrogante y no hay X
                    for (int p = 10; p >= 1; p--) {
                        String num = isbn.substring(sub, sub + 1);
                        int num_n = Integer.parseInt(num);
                        result = result + (num_n * p);
                        sub++;
                        //Este bucle repasa el ISBN y realiza los cálculos pertinentes para comprobar si el ISBN es correcto.
                    }

                    if ((result % 11) == 0) {
                        System.out.println("ISBN correcto");
                        //Imprimo si el resultado de la operación anterior es múltiplo de 11 (correcto)
                    } else {
                        System.out.println("ISBN incorrecto");
                        //Imprimo si el resultado de la operación anterior NO es múltiplo de 11 (incorrecto)
                    }
                }
            }
        }
    }