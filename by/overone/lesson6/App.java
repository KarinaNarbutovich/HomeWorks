package by.overone.lesson6;

import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.print("Enter size: ");
        int size = new Scanner(System.in).nextInt();
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(8);
            System.out.print(array[i] + " ");
        }
        int[] existNumber= new int[size];
        System.out.println("\n");
        int sum = 8; int lastAddedIndex=0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == sum) {
                    for(int d=0; d<existNumber.length; d++){
                        if(existNumber[d]!=array[j]||existNumber[d]!=array[i]){
                            existNumber[lastAddedIndex]=array[i];
                            existNumber[lastAddedIndex+1]=array[j];
                            lastAddedIndex=lastAddedIndex+2;
                            System.out.print(array[i] + "+" + array[j]+"="+sum+" ");
                        }
                    }


                }
            }
        }

    }
}
