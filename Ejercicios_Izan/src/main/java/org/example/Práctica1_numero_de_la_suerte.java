package org.example;

import java.util.Scanner;

public class Práctica1_numero_de_la_suerte {
    public static void p1() {
        Scanner entrada = new Scanner(System.in);
        boolean tyc = false; //Creo variable para salir del bucle que engloba el ejercicio.
        int dd_n = 0; //Defino las variables numéricas de los días, meses y años.
        int mm_n = 0;
        int aaaa_n = 0;

        while (!tyc) { //Abro el bucle que engloba el ejercicio para poder hacer que se repita cuenado sea necesario.
            System.out.println("Introduce tu fecha de nacimiento (dd/mm/aaaa)"); //Pido la fecha de nacimiento en dd/mm/aaaa con unos parámetros específicos y
            //calculo la longitud de la fecha para usarla después. La fecha la pido en formato string.
            System.out.println("recordando que los días no pueden ser <0 o >31, los meses <0 o >12 y los años <1901 o >2024");
            String cadena = entrada.nextLine();
            String fecha = cadena.replace("/", "");
            int fecha_l = fecha.length();

            while (fecha_l < 8 || fecha_l > 8) { //Este bucle se activa si la fecha excede el tamaño de 8 caracteres sin contar las barras.
                System.out.println("ERROR en los datos introducidos. Introduce de nuevo los datos en formato dd/mm/aaaa");
                cadena = entrada.nextLine();
                fecha = cadena.replace("/", "");
                fecha_l = fecha.length();
            }

            try { //Se activa el try que engloba gran parte del ejercicio debido a que se pueden encontrar errores de formato en
                //varias partes del código

                String dd = cadena.substring(0, 2); //Almaceno los días en dd, los meses en mm y los años en aaaa para transformarlos en variables numéricas.
                dd_n = Integer.parseInt(dd);
                String mm = cadena.substring(3, 5);
                mm_n = Integer.parseInt(mm);
                String aaaa = cadena.substring(6, 10);
                aaaa_n = Integer.parseInt(aaaa);

                while (fecha_l < 8 || fecha_l > 8 || dd_n <= 0 || dd_n > 31 || mm_n <= 0 || mm_n > 12 || aaaa_n < 1900 || aaaa_n > 2024){
                    //Hago un bucle que se activa si la fecha excede el tamaño de 8 caracteres sin contar las barras o se pasan algunos límites
                    // numéricos en los días, meses y años para después volver a almacenar las variables anteriores.
                    System.out.println("ERROR en los datos introducidos. Introduce de nuevo los datos en formato dd/mm/aaaa");
                    System.out.println("recordando que los días no pueden ser <0 o >31, los meses <0 o >12 y los años <1901 o >2024");
                    cadena = entrada.nextLine();
                    fecha = cadena.replace("/", "");
                    fecha_l = fecha.length();
                    dd = cadena.substring(0, 2);
                    dd_n = Integer.parseInt(dd);
                    mm = cadena.substring(3, 5);
                    mm_n = Integer.parseInt(mm);
                    aaaa = cadena.substring(6, 10);
                    aaaa_n = Integer.parseInt(aaaa);
                }


                int suma1 = dd_n + mm_n + aaaa_n; //Si la fecha se ha introducido correctamente se suman los números de los días, meses y años.
                String suma2 = Integer.toString(suma1); //Convierto la suma restante en una cadena para poder sacar individualmente los 4 dígitos del producto
                // de la suma anterior y los convierto en nuevas variables integer para sumarlos individualmente y sacar el número de la suerte
                String suma_1 = suma2.substring(0, 1);
                String suma_2 = suma2.substring(1, 2);
                String suma_3 = suma2.substring(2, 3);
                String suma_4 = suma2.substring(3, 4);
                int suma_1n = Integer.parseInt(suma_1);
                int suma_2n = Integer.parseInt(suma_2);
                int suma_3n = Integer.parseInt(suma_3);
                int suma_4n = Integer.parseInt(suma_4);
                int suma2_n = suma_1n + suma_2n + suma_3n + suma_4n;

                System.out.println(suma1); //Muestro uno por uno los dígitos de la suma de los días, meses y años junto a la suma total.
                System.out.println(suma_1);
                System.out.println(suma_2);
                System.out.println(suma_3);
                System.out.println(suma_4);

                System.out.println("Tu número de la suerte es: " + suma2_n); //Muestro el número de la suerte.
                tyc = true; //Salgo del bucle principal que engloba el ejercicio.
                }catch (NumberFormatException | StringIndexOutOfBoundsException e) { // Este catch caza errores de formato y vuelve a pedir la fecha de nacimiento.
                    System.out.println("ERROR en los datos introducidos. Introduce de nuevo los datos en formato dd/mm/aaaa");
                    cadena = entrada.nextLine();
                    fecha = cadena.replace("/", "");
                    fecha_l = fecha.length();
                }
            }
        }
    }