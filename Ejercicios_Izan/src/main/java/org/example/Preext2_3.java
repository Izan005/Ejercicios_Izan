package org.example;

import java.util.Scanner;

public class Preext2_3 {
    public static void t2_3(){
        Scanner entrada = new Scanner(System.in);

        System.out.println("¿Cuántos meses quieres pagar? (Primer mes 10€)");
        int mes = entrada.nextInt();
        int pago = 10;
        System.out.println("Financiación a " + mes + " meses:");
        for (int i = 1; i<= mes; i++){
            System.out.println("Mes " + i + ": " + pago + "€");
            pago *= 2;
        }
        pago -= 10;
        System.out.println("Total a pagar: " + pago +"€");
    }
}
