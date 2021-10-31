package by.overone.lesson7;

import java.util.Random;
import java.util.Scanner;

public class SecondProgram {
    public static void main(String[] args) {
        System.out.print("Enter the size of array: ");
        int size = new Scanner(System.in).nextInt();
        int[] array = new int[size];
        Random random = new Random();
        System.out.print("The source array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = (random.nextInt(1000) + 1);
            System.out.print(array[i] + " ");
        }
        int min = array[0];
        int meterMin = 1;
        int max = 0;
        int meterMax = 1;
        int sum = 0;
        for (int i = 1; i < size; i++) {
            if (min > array[i]) {
                min = array[i];
            } else if (min == array[i]) {
                meterMin++;
            }
            if (max < array[i]) {
                max = array[i];
            } else if (max == array[i]) {
                meterMax++;
            }
        }
        for (int i = 0; i < size; i++) {
            sum = sum + array[i];
        }
        double meanValue = (double) (sum - (min * meterMin) - (max * meterMax)) / (size - meterMax - meterMin);
        System.out.println("\nMinimum value: " + min + "\nMaximum value: " + max + "\nSum: " + sum + "\nThe average of the resulting array: " + meanValue);

    }
}
