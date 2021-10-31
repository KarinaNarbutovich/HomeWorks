package by.overone.lesson16;

public class MobilePhone {
    public static void main(String[] args) {
        System.out.println("Entered numbers: ");
        String str = ("254654899 +375338770565 +375290764638 96785688 ");
        String[] numbers = str.split(" +");
        for (String number : numbers) {
            System.out.println(number + " ");
        }
        System.out.println("Numbers with a suitable format: ");
        for (String number : numbers) {
            boolean result = number.matches("\\+375\\d{9}");
            if (result) {
                char[] numToArr = number.toCharArray();
                String numOnNewFormat = "+375 (" + numToArr[4] + numToArr[5] + ") "
                        + numToArr[6] + numToArr[7] + numToArr[8] + "-" + numToArr[9] + numToArr[10] + "-" + numToArr[11] + numToArr[12];
                System.out.println(numOnNewFormat);
            }

        }
    }
}