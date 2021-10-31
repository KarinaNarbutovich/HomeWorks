package by.overone.lesson5;


import java.util.Scanner;

public class FourthProgram {

    public static void main(String[] args) {
        int i, j, k, size, meter = 0;

        System.out.print("Enter the size of the array : ");
        Scanner num = new Scanner(System.in);
        size = num.nextInt();
        int[] array = new int[size + 1];
        System.out.println("Array values : ");
        for (i = 0; i < size; i++)
            array[i] = num.nextInt();
        System.out.println("The resulting array : ");

        for (i = 0; i < size; i++) {
            for (j = i + 1; j < size; j++) {
                if (array[j] == array[i]) {
                    meter++;
                    for (k = j; k < size; k++) {
                        array[k] = array[k + 1];
                    }
                    size--;
                } else
                    j++;
            }
        }

        for (int g = 0; g < array.length; g++) {
            System.out.println(array[g]);
        }

    }

}






