package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio_de_ampliacion_1t2 {
    public static void ampliacion1t2() {
        boolean valid = false;
        int alt = 0;
        Scanner entrada = new Scanner(System.in);


      while (!valid) {
          try {
              System.out.println("Introduce tu altura en cm");
              alt = entrada.nextInt();
              valid = true;
          }catch (InputMismatchException e) {
              System.out.println("ERROR: formato incorrecto. Introduce de nuevo tu estatura en cm");
              entrada.next();
          }
      }

      if (alt <= 150) {
          System.out.println("Persona de baja altura");
      } else if (alt >=151 && alt <=175) {
          System.out.println("Persona de aultura media.");
      }else {
          System.out.println("Persona de alta estatura");
      }
    }
}
