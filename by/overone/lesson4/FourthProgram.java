package by.overone.lesson4;

//import java.util.Random;

import java.util.concurrent.ThreadLocalRandom;

public class FourthProgram {
    public static void main(String[] args) {
        int[] array = new int[3];
        //Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = ThreadLocalRandom.current().nextInt(10, 90);
            //  array[i] = random.nextInt(81)+10;
            array[0] = 10;
            array[2] = 90;
            System.out.print(array[i] + " ");
        }
        if (array[1] > 10 && array[1] < 90) {
            System.out.println("\n" + "Array is a strictly ascending sequence");
        } else {
            System.out.println("Array an ascending sequence");
        }


    }
}

