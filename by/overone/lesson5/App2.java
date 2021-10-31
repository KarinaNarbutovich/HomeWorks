package by.overone.lesson5;

import java.util.Random;
import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {
        System.out.print("Enter the length of the array: ");
        int num = new Scanner(System.in).nextInt();
        int[] array = new int[num];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();
            System.out.println("Value: " + array[i] + " " + "Index: " + i);
        }
        int max = 0; int maxIndex=0;
        int min = 0; int minIndex=0;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i]; maxIndex=i;
            }
            if (min > array[i]) {
                min = array[i]; minIndex=i;
            }
        }
        System.out.println("max: " + max + " maxIndex: "+maxIndex+" min: " + min+" minIndex: "+ minIndex );
       array[maxIndex]=min;
       array[minIndex]=max;
        for (int i = 0; i < array.length; i++) {
            System.out.println("Value: " + array[i] + " " + "Index: " + i);
        }
    }
}
