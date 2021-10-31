package by.overone.lesson4;

public class SecondProgram {
    public static void main(String[] args) {
        int[] source = new int[500];
        for (int i = 0; i < source.length; i++) {
            source[i] = i;
            System.out.print(source[i] + ", ");
        }
        System.out.println("\n");
        int index = 0;
        int[] result = new int[100];
        int number = 1;
        while(result[98] == 0){
            if (number % 13 == 0 || number % 17 == 0) {
                result[index] = number;
                System.out.print(result[index] + ", ");
                index++;
            }
            number++;
        }
    }
}

