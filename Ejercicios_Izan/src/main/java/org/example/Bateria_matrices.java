package org.example;

import java.util.Random;
import java.util.Scanner;

public class Bateria_matrices {
    public void bat_mat1() {
        Scanner entrada = new Scanner(System.in);

        int matriz[][] = new int [3][3];

        System.out.println("Rellena la matriz 3 x 3: ");
        for (int i = 0;i<matriz.length; i++) {
            for (int j = 0;j<matriz[i].length; j++) {
                System.out.println("Ingresa posición (" + i + "," + j + ")");
                matriz[i][j] = entrada.nextInt();
            }
        }

        System.out.println("Matriz: "); {
            for (int filas[] : matriz) {
                for (int columnas : filas) {
                    System.out.print(columnas + " ");
                }
                System.out.println();
            }
        }

        System.out.println("Ingresa número a buscar: ");
        int num = entrada.nextInt();

        for (int i = 0;i<matriz.length; i++) {
            for (int j = 0;j<matriz[i].length; j++) {
                if (matriz[i][j] == num) {
                    System.out.println("El número " + num + " se encuentra en la posición (" + i + "," + j + ")");
                    break;
                }
            }
        }

    }
    public void bat_mat2() {
        Random random = new Random();

        int matriz[][] = new int[random.nextInt(5)+1][random.nextInt(5)+1];

        for (int i = 0;i< matriz.length;i++) {
            for (int j = 0;j<matriz[i].length;j++) {
                matriz[i][j] = random.nextInt(20)+1;
            }
        }

        System.out.println("Matriz:");
        for (int filas[] : matriz) {
            for (int columnas : filas) {
                System.out.print(columnas + " ");
            }
            System.out.println();
        }

        int num_filas = 0;
        int num_columnas = 0;
        for (int i = 0;i< matriz.length; i++) { //Suma cada fila e imprime el resultado
            num_filas = 0;
            for (int j = 0;j<matriz[i].length; j++) {
                num_filas += matriz[i][j];
            }
            System.out.println("Fila " + (i+1) + ": " + num_filas);
        }

        System.out.println();

        int num_col = 0;
        for (int i = 0;i< matriz[0].length; i++) { //Recorre las columnas de la matriz y las suma (Como el de sumar las filas pero al revés)
            num_col = 0;
            for (int j = 0;j< matriz.length ; j++) {

                num_col += matriz[j][i];

            }
            System.out.println("Columna " + (i + 1) + ": " + num_col);
        }
    }
    public void bat_mat3() {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce cantidad de estudiantes: "); //Solicita la cantidad de estudiantes que quiere el usuario (filas + 1)
        int cant_estud = entrada.nextInt();

        System.out.println("Introduce cantidad de asignaturas: "); //Solicita la cantidad de asignaturas que quiere el usuario (columnas + 1)
        int cant_asig = entrada.nextInt();
        String estudiante[][] = new String[cant_estud + 1][cant_asig + 1]; //Se asignan las filas y columnas a la matriz

        estudiante[0][0] = "Estudiantes"; //Situamos en la cooredenada (0, 0) la palabra Estudiantes para "decorar"
        for (int i = 1; i < estudiante.length; i++) { //Asigna un nombre a cada estudiante (fila X, columna 0)
            System.out.println("Introduce nombre del estudiante " + i);
            estudiante[i][0] = entrada.next();
        }

        for (int i = 1; i < estudiante[0].length; i++) { //Asigna un nombre a cada asignatura (fila 0, columna X)
            System.out.println("Introduce nombre de la asignatura " + i);
            estudiante[0][i] = entrada.next();
        }

        for (int i = 1; i<estudiante.length; i++) { //Asigna una nota de cada asignatura por estudiante
            for (int j = 1; j < estudiante[0].length; j++) {
                System.out.println("Introduce la nota de " + estudiante[i][0] + " para la asignatura " + estudiante[0][j]);
                estudiante[i][j] = entrada.next();
            }
        }

        for (String filas[] : estudiante) { //Muestra la matriz
            for (String columnas : filas) {
                System.out.print(columnas + " ");
            }
            System.out.println();
        }

        float nota = 0;
        for (int i = 1;i<estudiante.length; i++) { //Realiza la nota media de cada estudiante (Media de cada fila)
            nota = 0;
            for (int j = 1; j<estudiante[0].length; j++) {
                nota = Integer.parseInt(estudiante[i][j]) + nota;
            }
            nota = nota / cant_asig;
            System.out.println("La nota media del estudiante " + estudiante[i][0] + " es " + nota);
        }

        for (int i = 1;i<estudiante[0].length; i++) { //Realiza la nota media de cada asignatura (Media de cada columna)
            nota = 0;
            for (int j = 1; j<estudiante.length; j++) {
                nota = Integer.parseInt(estudiante[j][i]) + nota;
            }
            nota = nota / cant_asig;
            System.out.println("La nota media de la asignatura " + estudiante[0][i] + " es " + nota);
        }
    }
}
