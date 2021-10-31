package by.overone.lesson5;

import java.util.Random;

public class App {
    public static void main(String[] args) {
        int N = 5;
        double[] array1 = new double[N];
        Random random1 = new Random();
        for (int i = 0; i < array1.length; i++) {
            array1[i] = random1.nextInt();
            System.out.println("Value: " + array1[i]);
        }
        int negative = 0;
        int positive = 0;
        int zero = 0;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] < 0) {
                negative++;
            } else if (array1[i] > 0) {
                positive++;
            } else {
                zero++;

            }
        }
        System.out.println("negative value: " + negative + "\n" + "positive value: " + positive + "\n" + "number of zeros: " + zero);
    }
}
