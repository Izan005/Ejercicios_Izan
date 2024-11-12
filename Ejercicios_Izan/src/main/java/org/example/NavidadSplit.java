package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class NavidadSplit {
    public void navspl() {
        Scanner entrada = new Scanner(System.in);
        String PALABRA = "NAVIDAD";
        String palabras[] = PALABRA.split("");
        System.out.println(Arrays.toString(palabras));

        System.out.println("Introduce la cantidad de letras:");
        String nums = entrada.nextLine();
        String num_cant[] = (nums.split(","));
        String resultado = "";

        if (num_cant.length == palabras.length) {
            for (int i = 0; i<num_cant.length; i++) {
                for (int j = 0; j<Integer.parseInt(num_cant[i]); j++) {
                    resultado += palabras[i];
                }
            }
            System.out.println(resultado);
        } else {
            System.out.println("No hay 1 número por letra");
        }



    }
    public void aslist() {
        Scanner entrada = new Scanner(System.in);

       String nombres[] = {"Pepe", "Paco", "Juan"};

        System.out.println("Introduce nombre a buscar");
       String palabra_buscar = entrada.nextLine();

       boolean exist = Arrays.asList(nombres).contains(palabra_buscar);

       if (!exist) {
           System.out.println("No se ha encontrado el nombre que buscas");
       } else {
           System.out.println("El nombre que buscas existe");
       }

       //Con números

        Integer numeros[] = {1,2,3,4,5,6,7,8,9,10};

        System.out.println("Introduce número a buscar");
       int num_buscar = entrada.nextInt();

       boolean num_exist = Arrays.asList(numeros).contains(num_buscar);

        if (!num_exist) {
            System.out.println("No se ha encontrado el número que buscas");
        } else {
            System.out.println("El número que buscas existe");
        }

    }
}

