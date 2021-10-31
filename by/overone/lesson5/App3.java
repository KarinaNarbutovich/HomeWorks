package by.overone.lesson5;

import java.util.Random;

public class App3 {
    public static void main(String[] args) {
        int N = 5;
        double[] array1 = new double[N];
        Random random1 = new Random();
        for (int i = 0; i < array1.length; i++) {
            array1[i] = random1.nextInt();
            System.out.println("Value: " + array1[i]);
        }
        double sum=0;
        for (int i = 2; i < array1.length; i++) {
            for(int j=2;i<array1.length;i++){
             if (  i%i==0 && i%j==0){

             }

            }
        }
    }
}
