package by.overone.lesson7;

import java.util.Random;
import java.util.Scanner;

public class ThirdProgram {
    public static void main(String[] args) {
        System.out.print("Enter the size of array: ");
        int size = new Scanner(System.in).nextInt();
        int[] array = new int[size];
        Random random = new Random();
        System.out.print("The source array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = (random.nextInt(100) + 1);
            System.out.print(array[i] + " ");
        }
        int i = 0;
        for (int j = i + 1; j < size; j++) {
            if (array[i] > array[j]) {
                if (j == size - 1) {
                    System.out.println(array[i]);
                }
            } else {
                i++;
            }
        }
        System.out.println(array[size - 1]);
    }
}






