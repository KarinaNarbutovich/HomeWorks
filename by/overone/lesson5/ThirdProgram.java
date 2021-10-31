package by.overone.lesson5;

import java.util.Random;
import java.util.Scanner;


public class ThirdProgram {
    public static void main(String[] args) {
        System.out.print("Enter the length of the array: ");
        int num = new Scanner(System.in).nextInt();
        int[] array = new int[num];
        var random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();
            System.out.println("Value: " + array[i] + " " + "Index: " + i);
        }
        int last = array[array.length - 1];
        // System.out.println(last);
        System.out.println("The resulting array: ");
        int index = array.length - 1;

        for (int i = index; i >= 1; i--) {
            int value = array[index - 1];
            array[index] = value;
            index--;
            System.out.println("Value: " + array[i] + " " + "Index: " + i);
        }
        array[0] = last;
        System.out.println("Value: " + array[0] + " " + "Index: 0");
    }
}

