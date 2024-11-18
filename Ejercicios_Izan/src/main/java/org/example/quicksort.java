package org.example;

import java.util.Arrays;
import java.util.Random;

public class quicksort {
    public void quicksort() {

        int nums[] = {2,3,1,4,2};
        int aux[] = new int[nums.length];
        int j = 0;
        int tam = 0;
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        for (int i = 0;i<nums.length;i++) {
           if (i != nums.length-1 && nums[i] == nums[i+1]) {
               nums[i]=0;
           } else {
               tam++;
           }

        }

        int sin_duplicados[] = new int[tam];

        System.out.println(Arrays.toString(aux));

        for (int i = 0; i<aux.length; i++) {
            if (aux[i] !=0) {
                sin_duplicados[j] = aux[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(sin_duplicados));

    }
    public void duplicados3() {

        int sorteo[] = new int[6];
        Random random = new Random();

        for (int i = 0; i < sorteo.length; i++) {
            sorteo[i] = random.nextInt(1, 49) +1;

        }
        System.out.println(Arrays.toString(sorteo));
        Arrays.sort(sorteo);

        boolean valid = false;

        while (!valid) {
            valid = true;

            for (int i = 0; i<sorteo.length; i++) {

                if (i != sorteo.length - 1 && sorteo[i] == sorteo[i + 1]) {
                    System.out.println("Duplicado: " + sorteo[i]);
                    sorteo[i] = random.nextInt(1, 49) + 1;
                    valid = false;
                }
            }
            Arrays.sort(sorteo);
        }

        System.out.println(Arrays.toString(sorteo));



    }
    public void prueba_distinct() {
        int original[] = {1,1,2,2,3,4,9};

        System.out.println(Arrays.toString(original));
        int limpio[] = Arrays.stream(original).distinct().toArray();
        System.out.println(Arrays.toString(limpio));
    }
}
