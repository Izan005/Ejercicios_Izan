package org.example;

import java.util.Scanner;

public class Recursividad {

    static Scanner entrada = new Scanner(System.in);
    static int num;

    public static void main(String[] args) {

        System.out.println("Introduce un número");
        int sec = entrada.nextInt();

        System.out.println(secuenciaNum10(sec));

//        for (int i = 0; i <= 100; i++) {
//            System.out.println("fib(" + i + ") = " + fibonacci(i));
//        }

        //piramideAsteriscos();
       //System.out.println("Introduce un número:");
       //int num = entrada.nextInt();

        //System.out.println(factorialBucle(num));
        //System.out.println(factorialRecursivo(num));

    }

    public static int factorialBucle(int num) {

        int fact = 1;

        for (int i = num; i > 0; i--) {
            fact*=i;
        }

        return fact;
    }

    public static int factorialRecursivo(int num) {

        if (num == 0 || num == 1) {
            return 1;
        } else {
            return num * factorialRecursivo(num - 1);
        }
    }

    public static void piramideAsteriscos() {
        System.out.println("Introduce un número:");
        int num = entrada.nextInt();

        for (int i = 0; i < num ; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static long fibonacci(long n) {

        if (n<2) {
            return n;
        } else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }

    public static void secuenciaNum(int sec) {

        System.out.println(sec);
        if (num != sec) {
            secuenciaNum(sec+1);
        }


    }

    public static int secuenciaNum10(int sec) {

        if (sec != 0) {
            sec =secuenciaNum10(sec-1) + sec;
        }

        return sec;

    }

}
