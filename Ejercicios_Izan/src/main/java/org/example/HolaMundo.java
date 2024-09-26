package org.example;

    /* Este es un programa simple en Java...
   NombreArchivo: "HolaMundo.java". */
    class HolaMundo {//Definición de clase HolaMundo: esta línea usa la palabra clave class para declarar que se está definiendo una nueva clase. "HolaMundo" en este caso es un identificador que es el nombre de la clase. La definición de clase completa, incluidos todos sus miembros, estará entre la llave de apertura “{” y la llave de cierre “}”.
                     //El nombre de la clase definida por el programa HolaMundo debe ser igual que el nombre del archivo (HolaMundo.java).

        // Tu programa comienza con una llamada a main().
        // Imprime "Hola Mundo" en la ventana de la terminal.

        public static void main(String[] args)

        /*public: Para que la JVM (Máquina Virtual Java) pueda ejecutar el método desde cualquier lugar.
        //static: El método principal puede ser llamado sin crear el objeto (lo veremos más adelante)
        //Los modificadores public y static se pueden escribir en cualquier orden.
        //void: El método main no devuelve nada, por lo tanto, no hay que definirlo con un tipo de datos concreto.
        //main(): Nombre configurado como programa principal en la JVM.
        //String[]: El método principal acepta un único argumento: una matriz de elementos de tipo String (texto). */
        {
            System.out.println("Hola Mundo");
        }
    }

