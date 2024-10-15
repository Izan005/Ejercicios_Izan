package org.example;

import java.util.Scanner;

public class Ejercicio_de_ampliacion_2t2 {
    public static void ampliacion2t2() {
        boolean valid = false;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un número del 1 al 7 y te diré un día de la semana:");
        int num = entrada.nextInt();

                switch (num) {
                    case 1:
                        System.out.println("1 -> Lunes");
                        break;
                    case 2:
                        System.out.println("2 -> Martes");
                        break;
                    case 3:
                        System.out.println("3 -> Miércoles");
                        break;
                    case 4:
                        System.out.println("4 -> Jueves");
                        break;
                    case 5:
                        System.out.println("5 -> Viernes");
                        break;
                    case 6:
                        System.out.println("6 -> Sábado");
                        break;
                    case 7:
                        System.out.println("7 -> Domingo");
                        break;
                    default:
                        System.out.println("Dígito fuera del alcance del programa.");
                        break;


                }
            }
        }



