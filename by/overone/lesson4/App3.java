package by.overone.lesson4;

import java.util.Scanner;

public class App3 {
    public static void main(String[] args) {
        System.out.print("Enter length of array: ");
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid number");
            scanner.next();
        }
        int num = 1;
        int N = scanner.nextInt();
        int[] array = new int[N];
        while (num <= N) {
            for (int i = 0; i < N; i++) {
                array[i] = num;
                num++;
                System.out.println("value: " + array[i] + " " + "index: " + i);
            }
        }
        System.out.println("Enter K: ");
        double k = new Scanner(System.in).nextDouble();
        long sum = 0;
        for (num = 0; num < array.length; num++) {
            if (array[num]/ k>0){
            if (array[num] % k == 0 && array[num]/ k>0){
                sum = sum + array[num];
            }

        } else{
                System.out.println("You entered a negative number or zero");
            break;}
        }
        System.out.println("Sum= "+sum);
    }
}




