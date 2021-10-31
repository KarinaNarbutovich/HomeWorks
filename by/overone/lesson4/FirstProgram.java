package by.overone.lesson4;

public class FirstProgram {
    public static void main(String[] args) {
        System.out.print("Source array: ");
        int[] array = {4, -9, 6, 8, 21};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.print("\n" + "The resulting array: ");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }

    }
}