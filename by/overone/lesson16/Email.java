package by.overone.lesson16;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email {
    public static void main(String[] args) {
        String first = ("narbutovich2000@mail.ru");
        String second = ("1narbutovich400@gmail.com");
        boolean resultFirst = first.matches("[a-zA-z]\\w+@\\w+\\.\\w+");
        boolean resultSecond = second.matches("[a-zA-z]\\w+@\\w+\\.\\w+");
        System.out.println("Is this line an email? " + resultFirst + "\nIs this line an email? " + resultSecond);
    }
}


