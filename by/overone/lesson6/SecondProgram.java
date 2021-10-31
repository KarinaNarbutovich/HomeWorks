package by.overone.lesson6;

import java.util.Random;

/**
 * @author Karina Narbutovich
 */
public class SecondProgram {
    public static void main(String[] args) {
        int sum = 0;
        int[] array = new int[15];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = (random.nextInt(10));
            System.out.println("Value: " + array[i] + " Index: " + i);
            if (array[i] % 2 == 0 && array[i] != 0) {
                sum++;
            }
        }
        System.out.println("The sum of the even numbers of the array: " + sum);
    }
}
