package by.overone.lesson7;

import java.util.Scanner;

public class FourthProgram {
    public static void main(String[] args) {
        System.out.print("Enter the size of array: ");
        int size = new Scanner(System.in).nextInt();
        int[] array = new int[size];
        array[0] = 0;
        array[1] = 1;
        for (int i = 2; i < size; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }
        for (int i = 0; i < size; i++) {
            System.out.println(array[i] + " ");
        }
    }
}
