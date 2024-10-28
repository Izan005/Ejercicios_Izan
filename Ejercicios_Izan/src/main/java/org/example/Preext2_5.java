package org.example;

import javax.xml.transform.Source;
import java.util.Scanner;

public class Preext2_5 {
    public static void t2_5(){
        Scanner entrada = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int num4 = 0;
        int num5 = 0;
        int num = 0;
        int mil = 0;
        for (int i = 1; i<=5; i++) {
            System.out.println("Introduce sueldo del empleado " + i);
            switch (i) {
                case 1:
                    num1 = entrada.nextInt();
                    if (num1 >= 1000){
                        mil++;
                    }
                    break;
                case 2:
                    num2 = entrada.nextInt();
                    if (num2 >= 1000){
                        mil++;
                    }
                    break;
                case 3:
                    num3 = entrada.nextInt();
                    if (num3 >= 1000){
                        mil++;
                    }
                    break;
                case 4:
                    num4 = entrada.nextInt();
                    if (num4 >= 1000){
                        mil++;
                    }
                    break;
                case 5:
                    num5 = entrada.nextInt();
                    if (num5 >= 1000){
                        mil++;
                    }
                    break;
                default:
                    break;
            }
        }
        if (num1 > num2 && num1 > num3 && num1 > num4 && num1 > num5){
            System.out.println("El sueldo del empleado 1 (" + num1 + "€) es el más alto");

        }else if (num2 > num1 && num2 > num3 && num2 > num4 && num2 > num5 ){
            System.out.println("El sueldo del empleado 2 (" + num2 + "€) es el más alto");

        }else if (num3 > num1 && num3 > num2 && num3 > num4 && num3 > num5){
            System.out.println("El sueldo del empleado 3 (" + num3 + "€) es el más alto");

        }else if (num4 > num1 && num4 > num2 && num4 > num3 && num4 > num5){
            System.out.println("El sueldo del empleado 4 (" + num4 + "€) es el más alto");

        }else if (num5 > num1 && num5 > num2 && num5 > num3 && num5 > num4){
            System.out.println("El sueldo del empleado 5 (" + num5 + "€) es el más alto");
        }

        System.out.println(mil + " sueldos son de 1000€ o más.");
    }
}