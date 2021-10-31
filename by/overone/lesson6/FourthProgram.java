package by.overone.lesson6;

import java.util.Random;

/**
 * @author Karina Narbutovich
 */
public class FourthProgram {
    public static void main(String[] args) {
        int[] array = new int[11];
        Random random = new Random();
        System.out.print("The source array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = (random.nextInt(3) + (-1));
            System.out.print(array[i] + " ");
        }
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        for (int j : array) {
            if (-1 == j) {
                num1++;
            } else if (1 == j) {
                num2++;
            } else if (0 == j) {
                num3++;
            }
        }
        if (num1 > num2 && num1 > num3) {
            System.out.println("\nThe most common meaning is -1");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("\nThe most common meaning is 1");
        } else if (num3 > num1 && num3 > num2) {
            System.out.println("\nThe most common meaning is 0");
        }
        System.out.println("\nNumber of -1: " + num1 + "; number of 1: " + num2 + "; number of 0:  " + num3);
    }
}
