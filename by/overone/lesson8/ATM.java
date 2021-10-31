package by.overone.lesson8;

import java.util.Scanner;

/**
 * @author Karina Narbutovich
 */
public class ATM {
    private int numb20, numb50, numb100, sum;
    public int getSum(int a, int b, int c) {
        if(sum%10==0 && sum>=0) {
            a=sum/100;
            b=sum/50;
            c=sum/20;

        }

        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;

    }
    public int getNumb20() {
        return numb20;
    }

    public void setNumb20(int numb20) {
        if (numb20 >= 0) {
            this.numb20 = numb20;
        } else {
            System.out.println("Invalid number");
        }
    }

    public int getNumb50() {
        return numb50;
    }

    public void setNumb50(int numb50) {
        if (numb50 >= 0) {
            this.numb50 = numb50;
        } else {
            System.out.println("Invalid number");
        }

    }

    public int getNumb100() {
        return numb100;
    }

    public void setNumb100(int numb100) {
        if (numb100 >= 0) {
            this.numb100 = numb100;
        } else {
            System.out.println("Invalid number");
        }
    }




    public void Output() {

    }

    public static void main(String[] args) {
        ATM atm1 = new ATM();
        atm1.setNumb20(-2);
        System.out.println(atm1.getNumb20());
    }
}


