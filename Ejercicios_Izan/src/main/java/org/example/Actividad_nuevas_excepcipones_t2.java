package org.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Locale;
import java.util.Scanner;

public class Actividad_nuevas_excepcipones_t2 {
    public static void actividad_ext2(){
        Scanner entrada = new Scanner(System.in);
        int año_nac = 1800;
        LocalDateTime act = LocalDateTime.now();
        int act_añ = act.getYear();


        System.out.println("Introduce modo a usar:");
        System.out.println("Modo 1 (1) / Modo 2 (2)");
        int modo = entrada.nextInt();

        switch (modo) {
            case 1: System.out.println("Has elegido el modo 1");
            System.out.println("Introduce tu año de nacimiento:");

            try {
                String año = entrada.next();
                año_nac = Integer.parseInt(año);
                LocalDateTime hoy = LocalDateTime.now();

                while (año_nac < 1900 ||año_nac > hoy.getYear()) {
                    System.out.println("No es un valor válido. Introduce un valor entre 1900 y " + hoy.getYear());
                    año = entrada.next();
                    año_nac = Integer.parseInt(año);
                }
            }catch (NumberFormatException e) {
                System.out.println("ERROR: " + e.getMessage());
            }

            break;
            case 2: System.out.println("Has elegido el modo 2");

            int edad = 0;
            System.out.println("Introduce tu edad");

            if (entrada.hasNextInt()) {
                edad = entrada.nextInt();
            } else {
                System.out.println("La edad introducida no tiene un formato válido.");
                break;

            }
            LocalDateTime now = LocalDateTime.now();


            while (edad <= 0) {
                System.out.println("Valor no válido. Introduce un valor >0");
                edad = entrada.nextInt();
            }
            año_nac = now.getYear() - edad;
            break;

            default: System.out.println("Modo introducido no existente. Saliendo del programa...");
            break;
        }

        if (año_nac >=1900 && año_nac <=1927) {
            System.out.println("Sin generación bautizada");
        }
        else if (año_nac >=1928 && año_nac <=1944) {
            System.out.println("Eres de la generación Silent");
        }
        else if (año_nac >=1945 && año_nac <=1964) {
            System.out.println("Eres de la generación Baby Boomer");
        }
        else if (año_nac >=1965 && año_nac <=1981) {
            System.out.println("Eres de la generación X");
        }
        else if (año_nac >=1982 && año_nac <=1994) {
            System.out.println("Eres de la generación Y");
        }
        else if (año_nac >=1995 && año_nac <= act_añ) {
            System.out.println("Eres de la Generación Z o Centennial");
        }


    }
}
