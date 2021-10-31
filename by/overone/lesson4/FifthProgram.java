package by.overone.lesson4;

import java.util.Scanner;

public class FifthProgram {
    public static void main(String[] args) {
        System.out.print("Please enter an integer: ");
        int number = new Scanner(System.in).nextInt();
        boolean a = true;
        if (number != 1 && number > 0) {
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    a = false;
                }
            }
            if (a) {
                System.out.println("Number is a prime");
            } else {
                System.out.println("Number is not a prime");
            }
            System.out.println();
        } else {
            System.out.println("The number you entered is not a prime and composite or it is not natural");
        }
    }
}

