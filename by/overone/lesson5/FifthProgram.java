package by.overone.lesson5;

import java.util.Random;
import java.util.Scanner;

public class FifthProgram {
    public static void main(String[] args) {
        System.out.print("Enter the length of the first array: ");
        int num1 = new Scanner(System.in).nextInt();
        int[] array1 = new int[num1];
        var random1 = new Random();
        for (int i = 0; i < array1.length; i++) {
            array1[i] = random1.nextInt();
            System.out.println("Value: " + array1[i] + " " + "Index: " + i);
        }
        System.out.print("\nEnter the length of the second array: ");
        int num2 = new Scanner(System.in).nextInt();
        int[] array2 = new int[num2];
        var random2 = new Random();
        for (int j = 0; j < array2.length; j++) {
            array2[j] = random2.nextInt();
            System.out.println("Value: " + array2[j] + " " + "Index: " + j);
        }
        int size = array1.length + array2.length;
        System.out.println("\nSize of resulting array: " + size + "\nThe resulting array: ");
        int[] array3 = new int[size + 1];
        int i = 0;
        int j = 0;
        for (int k = 0; k <= array1.length - 1; k++) {
            array3[k] = array1[i];
            i++;
            // System.out.println(array3[k]+" "+k);
        }
        for (int k = array1.length; k <= size - 1; k++) {
            array3[k] = array2[j];
            j++;
            //System.out.println(array3[k] + " " + k);

        }
        for (int k = 0; k <= size - 1; k++) {
            System.out.println("Value: " + array3[k] + " Index: " + k);
        }

    }
}



