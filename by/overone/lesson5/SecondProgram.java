package by.overone.lesson5;

import java.util.Scanner;


public class SecondProgram {
    public static void main(String[] args) {
        System.out.print("Please enter an integer: ");
        long number = new Scanner(System.in).nextLong();
        if (number > 0) {
            if (number % 10 == 1 && number % 100 != 11) {
                System.out.println(number + " Рубль");
            } else if (number % 10 >= 2 && number < 5) {
                System.out.println(number + " Рубля");
            } else if (number % 10 > 4 || number % 10 == 0 || number % 100 >= 11 && number <= 14) {
                System.out.println(number + " Рублей");
            }
        } else {
            System.out.println("Invalid number");
        }
    }

}
