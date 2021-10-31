package by.overone.lesson4;

import java.util.Random;
import java.util.Scanner;

public class ThirdProgram {
    public static void main(String[] args) {

        System.out.print("Введите размер массива: ");
        int size = new Scanner(System.in).nextInt();
        double[] array = new double[size];
        var random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextDouble();
            System.out.println(array[i]);
        }
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            double temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum +array[i];
        }
        double arrMean = sum / array.length;
        System.out.println("\n" + "MinValue: " + array[0] + "\n" + "MaxValue: " + array[array.length - 1] + "\n" + "Array mean: " + arrMean);

    }
}
