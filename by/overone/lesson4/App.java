package by.overone.lesson4;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        while (!scanner.hasNextInt()){
            System.out.println("Invalid number");
            scanner.next();
    }  int i= scanner.nextInt();
        int sum=0;
        //  System.out.println("Enter number: ");
        //int number1=new Scanner(System.in).nextInt();
        if (i>0 ){
        int[] array = new int[i];
        for (int j=0; j<=array.length-1; j++ ){
         sum=sum+j;}}

     System.out.println(sum);


}


}
