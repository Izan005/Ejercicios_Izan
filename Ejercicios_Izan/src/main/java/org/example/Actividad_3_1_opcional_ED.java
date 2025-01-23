package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Izan López
 */

public class Actividad_3_1_opcional_ED {
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Introduce un NIF válido:");
        String nif = entrada.next();
        String nifUpper = nif.toUpperCase();
        boolean valNif = esNIFValido(nifUpper);
        boolean valPlazas = false;
        try {
            System.out.println("Introduce el número de plazas");
            int plazas = entrada.nextInt();
            valPlazas = esNumeroPlazasValido(plazas);
        } catch (InputMismatchException e) {
            System.out.println("Formato incorrecto.");
            entrada.next();
        }
    }
    public static boolean esNIFValido(String nif) {
        if(!nif.matches("[0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][A-Z]")) {
            System.out.println("ERROR. NIF no válido.");
            return false;
        }
        System.out.println("NIF correcto");
        return true;
    }
    public static boolean esNumeroPlazasValido(int numPlazas) {

        if (numPlazas < 1 || numPlazas > 50) {
            System.out.println("Número de plazas fuera del rango");
            return false;
        }
        System.out.println("Número de plazas dentro del rango");
        return true;
    }
}
