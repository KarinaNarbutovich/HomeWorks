package by.overone.lesson5;

import java.util.Scanner;

public class SecondProgramB {
    public static void main(String[] args) {
        System.out.print("Please enter an integer: ");
        long number = new Scanner(System.in).nextLong();
        int rem = (int) number % 10;
        int rem1 = (int) number % 100;
        if (number < 10) {
            if (rem > -1 && number != 0) {
                switch (rem) {
                    case 0:
                        System.out.println(number + " Рублей");
                        break;
                    case 1:
                        System.out.println(number + " Рубль");
                        break;
                    case 2:
                        System.out.println(number + " Рубля");

                    case 3:
                        System.out.println(number + " Рубля");
                    case 4:
                        System.out.println(number + " Рубля");
                    case 5:
                        System.out.println(number + " Рублей");
                    case 6:
                        System.out.println(number + " Рублей");
                    case 7:
                        System.out.println(number + " Рублей");
                    case 8:
                        System.out.println(number + " Рублей");
                    case 9:
                        System.out.println(number + " Рублей");
                }
            } else {
                System.out.println("Invalid number");
            }
        } else {
            if (rem1 > -1) {
                switch (rem1) {
                    case 11:
                        System.out.println(number + " Рублей");
                    case 12:
                        System.out.println(number + " Рублей");
                    case 13:
                        System.out.println(number + " Рублей");
                    case 14:
                        System.out.println(number + " Рублей");
                }
            } else {
                System.out.println("Invalid number");
            }
        }
    }
}
