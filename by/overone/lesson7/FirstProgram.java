package by.overone.lesson7;

import java.util.Scanner;

/**
 * @author Karina Narbutovich
 */
public class FirstProgram {
    public static void main(String[] args) {
        int size = 0;
        System.out.print("Enter the size of the array : ");
        Scanner num = new Scanner(System.in);
        size = num.nextInt();
        int[] array = new int[size + 1];
        System.out.println("The values of the fist array : ");
        for (int i = 0; i < size; i++)
            array[i] = num.nextInt();
        System.out.print("The first array : ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        int[] array2 = new int[size + 1];
        System.out.println("\nThe values of the second array : ");
        for (int i = 0; i < size; i++)
            array2[i] = num.nextInt();
        System.out.print("The second array : ");
        for (int i = 0; i < size; i++) {
            System.out.print(array2[i] + " ");
        }
        int meter = 0;
        int j = 0;
        for (int i = 0; i < size; i++) {
            if (array[i] == array2[j]) {
                meter++;
                j++;
            } else {
                j++;
            }
        }

        System.out.println("\n" + meter);
        if (meter == size) {
            System.out.println("\nTwo arrays are equal");
        } else {
            System.out.println("\nArrays are not equal");
        }
    }
}

