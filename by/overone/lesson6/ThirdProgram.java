package by.overone.lesson6;

import java.util.Random;

/**
 * @author Karina Narbutovich
 */
public class ThirdProgram {
    public static void main(String[] args) {
        int[] array = new int[8];
        Random random = new Random();
        System.out.print("The source array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = (random.nextInt(10) + 1);
            System.out.print(array[i] + " ");
        }
        System.out.print("\n" + "The resulting array: ");
        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                array[i] = 0;
            }
            System.out.print(array[i] + " ");
        }
    }
}
