package by.overone.lesson12;

import java.util.Scanner;

public class lesson13 {
    public static void main(String[] args) {
        System.out.println("Input the number: ");
       Scanner a=new Scanner(System.in);
        int N = a.nextInt();
       int mark=N*8/15;

        System.out.println("Mark of student: "+mark);
    }
}
