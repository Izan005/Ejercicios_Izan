package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Práctica3_Tema3 {
    public void p3_t3() {
        Scanner entrada = new Scanner (System.in);

        boolean valid = false;
        int col = 0;
        int fila = 0;

        do{ //Bucle que comprueba que el formato del número de columnas a introducir sea int
            try {
                System.out.println("Introduce las columnas: "); //Solicito las columnas que tendrá la matriz de la sopa de letras
                col = entrada.nextInt();
                valid = true;
            }catch (InputMismatchException e) {
                System.out.println("Formato incorrecto.");
                entrada.next();
            }
        } while (!valid);

        valid = false;



        do { //Bucle que comprueba que el formato del número de filas a introducir sea int
            try {
                System.out.println("Introduce las filas: "); //Solicito las filas que tendrá la matriz de la sopa de letras
                fila = entrada.nextInt();
                valid = true;
            }catch (InputMismatchException e) {
                System.out.println("Formato incorrecto.");
                entrada.next();
            }
        } while (!valid);



        String sopa[][] = new String[fila][col]; //Genero una matriz con las filas y columnas solicitadas anteriormente


        for (int i = 0; i < sopa.length ; i++) { //Bucle for que repasa la matriz "sopa"

            System.out.println("Introduce fila " + (i+1) + ":"); //Solicito el contenido de una fila de la matriz
            String linea = entrada.next();

            boolean formato = linea.matches("[a-zA-Z]+"); //Aplico el método matches para verificar el formato de entrada de los datos (solo letras)

            if (!formato) { //If y else-if que detectan si no has introducido letras, has excedido el número de letras o no lo has alcanzado. Si es así, se sale del
                // programa.
                System.out.println("ERROR. Solo se aceptan letras. Saliendo del programa...");
                return;
            } else if (linea.length() < col) {
                System.out.println("ERROR. No has alcanzado la cantidad de letras requerida. Saliendo del programa...");
                return;
            } else if (linea.length() > col) {
                System.out.println("ERROR. Has excedido la cantidad de letras requerida. Saliendo del programa...");
                return;
            }

            String vec_linea[] = linea.split(""); //Transforma la variable línea en un vector y separa cada caracter para volverlo una posición del vector

            for (int j = 0; j < sopa[i].length; j++) { //Bucle for que repasa las columnas de la matriz y las rellena con la información del vector split creado antes

                sopa[i][j] = vec_linea[j];
            }
        }

        System.out.println("***SOPA DE LETRAS***");
        for (String filas[] : sopa) { //Mediante un foreach muestro la sopa de letras al completo
            for (String columna : filas) {
                System.out.print(columna + " ");
            }
            System.out.println();
        }

        System.out.println("Inroduce palabra a buscar: "); //Solicito la palabra a buscar en la matriz
        String palabra = entrada.next();
        boolean formato_palabra = palabra.matches("[a-zA-Z]+"); //Compruebo que el formato de la palabra introducida sea el correcto (solo letras)

        while (!formato_palabra) { //Si el formato de la palabra a buscar no es correcto (formato = false) vuelvo a solicitar la palabra hasta que lo sea
            System.out.println("Formato incorrecto. Solo se aceptan letras. Vuelve a introducir de nuevo la palabra: ");
            palabra = entrada.next();
            formato_palabra = palabra.matches("");
        }

        String vec_palabra[] = palabra.split(""); //Paso a vector la palabra introducida
        int existe = 1; //Variable que se va incrementando en 1 a medida de que un caracter del vector de la palabra coincide con un caracter de la matriz sopa
        int matfil = 0; //Variable que almacenará una posición de una fila en un futuro
        int matcol = 0; //Variable que almacenará una posición de una columna en un futuro
        int mat_fin_fila = 0; //Fila en la que se encuentra la palabra acertada
        int mat_fin_col = 0; //Columna en la que se encuentra la palabra acertada
        int vec_palabra_pos = 0; //Variable que almacena la posición deseada del vector de la palabra a buscar
        boolean confirma_existe = false; //Booleano que confirma la existencia o no de la palabra a buscar en la sopa. Si este es true, la palabra existe en la sopa

        Padre:
        for (int i = 0; i < sopa.length; i++) { //Bucle for que contiene todo el proceso para comprobar la existencia de la palabra a buscar en la matriz "sopa" y busca
            // fila por fila en la matriz

            for (int j = 0; j < sopa[0].length; j++) { //Bucle que busca columna por columna en la matriz.
                vec_palabra_pos = 0;
                mat_fin_fila = i;
                mat_fin_col = j;

                if (sopa[i][j].toLowerCase().equals(vec_palabra[vec_palabra_pos].toLowerCase())) { //Si el caracter de la posición i,j en la matriz es igual a la posición
                    // vec_palabra_pos (x) sumamos 1 a la posición del vector, por lo que pasamos a la siguiente posición del vector y la comprobamos.
                    vec_palabra_pos++;

                    if (existe == vec_palabra.length) { //Si se aciertan todos los caracteres del vector palabra a buscar en la sopa de letras se confirma la existencia
                        // del vector en la matriz mediante un booleano y se sale del bucle principal
                        confirma_existe = true;
                        break Padre;
                    }

                    for (int k = -1; k < 2; k++) {

                        Colum_3x3:
                        for (int l = -1; l < 2; l++) {

                                if (i+k < 0 || j+l < 0 || i+k >= fila || j+l >= col) { //If que compruba si al buscar la palabra el bucle accede a una posición inexistente en la matriz.
                                    // Si es así, vuelve atrás a buscar la siguiente posición.

                                    continue Colum_3x3;
                                } else {
                                    matfil = k; //Almacenamos la posición de la columna y de la fila del cuadrado 3x3 creado en la matriz usando como centro el caracter coincidente del
                                    // vector en la matriz para buscar posición por posición el siguiente caracter de la matriz que coincida con el del vector
                                    matcol = l;

                                    if (sopa[i+k][j+l].toLowerCase().equals(vec_palabra[vec_palabra_pos].toLowerCase())) { //Si el caracter en la posición i+k y j+l en la
                                        // matriz coincide con el caracter vec_palabra_pos del vector palabra se suma 1 a la posición de caracteres del vector que existen en
                                        // la matriz.
                                        existe++;

                                        if (existe == vec_palabra.length) { //Si se aciertan todos los caracteres del vector palabra a buscar en la sopa de letras se confirma la existencia
                                            // del vector en la matriz mediante un booleano y se sale del bucle principal
                                            confirma_existe = true;
                                            break Padre;
                                        }

                                        for (int m = 0; m < vec_palabra.length - 2; m++) { //Este bucle comprueba si hay más aciertos en la dirección a la que se han encontrado los 2 aciertos anteriores
                                            // y continua la busqueda sumando la posición de la fila (k) y la posición de la columna (l) en el cuadrado hipotético 3x3 a la posición donde se ha encontrado
                                            // el caracter coincidente (matfil y matcol).

                                            vec_palabra_pos++; //Sumamos 1 a la posición del vector palabra y hacemos que el bucle continúe en dirección de la anterior letra acertada.
                                            matfil += k;
                                            matcol += l;

                                            if (sopa[i+matfil][j+matcol].toLowerCase().equals(vec_palabra[vec_palabra_pos].toLowerCase())) { //Si el caracter en la posición i+matfil y j+matcol en la
                                                // matriz coincide con el caracter vec_palabra_pos del vector palabra se suma 1 a la posición de caracteres del vector que existen en
                                                // la matriz.
                                                existe++;
                                                if (existe == vec_palabra.length) { //Si se aciertan todos los caracteres del vector palabra a buscar en la sopa de letras se confirma la existencia
                                                    // del vector en la matriz mediante un booleano y se sale del bucle principal
                                                    confirma_existe = true;
                                                    break Padre;
                                                }
                                            } else { //Si no coincide el caracter vec_palabra_pos con el caracter seleccionado del cuadrado 3x3 de la matriz resetea los aciertos, la posición del caracter
                                                // de vector palabra y se regresa a buscar el siguiente caracter (siguiente columna) del cuadrado 3x3
                                                existe = 1;
                                                vec_palabra_pos = 1;
                                                continue Colum_3x3;
                                            }
                                        }
                                    } else { //Después de repasar el cuadrado 3x3 creado y no encontrar ninguna coincidencia con el caracter vec_palabra_pos resetea el contador
                                        // aciertos
                                        existe = 1;
                                    }
                                }
                        }
                    }
                }
            }
        }

        if (confirma_existe == true) { //Dependiendo de si el vector existe o no en la sopa de letras sale un mensaje u otro.
            System.out.println("La palabra " + palabra + " existe y está en la posición " + mat_fin_fila + " " + mat_fin_col);
        } else {
            System.out.println("La palabra " + palabra + " no existe");
        }
    }
}