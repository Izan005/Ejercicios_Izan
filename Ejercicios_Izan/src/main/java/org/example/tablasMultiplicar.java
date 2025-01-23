package org.example;

import java.util.Scanner;

public class tablasMultiplicar {
    static  Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        int tabla = pedirTabla();
        boolean validar = validarTabla(tabla);

        if(validar) {
            calcularTabla(tabla);
            System.out.println("El cuadrado es: " + calcularCuadrado(tabla));
        } else {
            System.out.println("La tabla introducida no es válida");
        }
    }

    public static int pedirTabla() {

        System.out.println("Introduce un número del 1-10");
        int tabla = entrada.nextInt();
        return tabla;
    }

    public static boolean validarTabla(int tabla){

        if (tabla < 1 || tabla > 10) {
            return false;
        }

        return true;
    }

    public static int calcularCuadrado(int tabla) {

        return tabla*tabla;
    }
    public static void calcularTabla (int tabla) {

        for (int i = 0; i <= 10 ; i++) {
            System.out.println(tabla + " x " + i + " = " + (tabla*i));
        }
    }
}

