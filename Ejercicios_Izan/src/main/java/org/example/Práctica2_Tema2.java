package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Práctica2_Tema2 {
    public static void p2t2() {
        boolean valid1 = false; //Creo 2 variables booleanas para utilizarlas en 2 try catch distintos después.
        boolean valid2 = false;
        int num1 = 0; //Creo 2 variables integer para usarlas como contenedor de los productos de la operación.
        int num2 = 0;
        Scanner entrada = new Scanner(System.in);

        System.out.println("BIENVENIDO A LA CALCULADORA");

        System.out.println("Introduce el primer producto:"); //Solicita el primer producto de la operación.

        while (!valid1) { //Entra en un bucle en el que se realiza un try catch que comprueba que el producto 1 no esté en un formato distinto a integer.
            //Cuando no salte el error a cazar en el catch, saldremos del bucle cumpliendo la condición de salida de este.
            try {
                num1 = entrada.nextInt();
                valid1 = true;
            }catch (InputMismatchException e) {
                System.out.println("Parámetro no válido. Introduce de nuevo el produco en formato int");
                entrada.next();
            }
        }

        System.out.println("Introduce el signo a aplicar (+, -, X, /, R)"); //Solicito el signo a usar en la operación y lo almaceno en una variable String.
        String sig = entrada.next();

        if (sig.equals("R")) { //Abro un condicional en el que detecta si el signo es R (raíz cuadrada) y realiza la operación del primer producto sin pedir el siguiente y
            //seguidamente se cierra el programa. Si la condición no se cumple se ejecuta el resto del programa.
            double raiz = Math.sqrt(num1);
            System.out.println("El resultado es " + raiz);
        }else {
            System.out.println("Introduce el segundo producto:"); //Solicita el segundo producto de la operación.

            while (!valid2) { //Entra en un bucle en el que se realiza un try catch que comprueba que el producto 2 no esté en un formato distinto a integer.
                //Cuando no salte el error a cazar en el catch, saldremos del bucle cumpliendo la condición de salida de este.
                try {
                    num2 = entrada.nextInt();
                    valid2 = true;
                }catch (InputMismatchException e) {
                    System.out.println("Parámetro no válido. Introduce de nuevo el produco en formato int");
                    entrada.next();
                }
            }
            switch (sig.toUpperCase()) { //Abro un switch en el que contego cada signo que puede poseer la variable "sig"
                // y hago que todas las letras se conviertan en mayúscula.
                case "+": //Realiza la suma de los 2 productos y los muestra por panatalla. Seguidamente sale del switch.
                    int suma = num1 + num2;
                    System.out.println("El resultado es " + suma);
                    break;
                case "-": //Realiza la resta de los 2 productos y los muestra por panatalla. Seguidamente sale del switch.
                    int rest = num1 - num2;
                    System.out.println("El resultado es " + rest);
                    break;
                case "X": //Realiza la multiplicación de los 2 productos y los muestra por panatalla. Seguidamente sale del switch.
                    int mult = num1 * num2;
                    System.out.println("El resultado es " + mult);
                    break;
                case "/": //Accedemos al case referente a el caracter "/".
                    while (num1 == 0 || num2 == 0) { //Entra en un bucle si cualquiera de los 2 productos es 0.
                        System.out.println("ERROR. Un número no puede dividirse entre 0");
                        if (num1 == 0) {
                            System.out.println("Introduce de nuevo el primer producto"); //Vuelve a solicitar el producto 1 si este es = 0.
                            num1 = entrada.nextInt();
                        }else if (num2 == 0) {
                            System.out.println("Introduce de nuevo el segundo producto"); //Vuelve a solicitar el producto 2 si este es = 0.
                            num2 = entrada.nextInt();
                        }
                    }
                    double div = (double) num1 / num2; //Realiza la división de los 2 productos si estos no son = 0 y sale del switch.
                    System.out.println("El resultado es " + div);
                    break;
                default:
                    System.out.println("Signo no reconocido introducido."); //Imprime un mensaje que notifica que se ha introducido un signo no contenido en el switch.
                    break;
            }
        }
    }
}