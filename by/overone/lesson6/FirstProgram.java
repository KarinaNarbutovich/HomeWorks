package by.overone.lesson6;

/**
 * @author Karina Narbutovich
 */
public class FirstProgram {
    public static void main(String[] args) {
        int[] sourceArr = new int[99];
        int num = 1;
        int size = 0;
        System.out.println("Source array: ");
        for (int i = 0; i <= 98; i++) {
            sourceArr[i] = num;
            num++;
            System.out.print(sourceArr[i] + " ");
            if (sourceArr[i] % 2 != 0) {
                size++;
            }
        }
        int i = 0;
        System.out.println("\nSize of the resulting array: " + size + "\nIntermediate array: ");
        int[] array = new int[size];
        for (int j = 0; j <= 49; j++) {
            array[j] = sourceArr[i];
            i = i + 2;
        }
        for (int j = 0; j <= 49; j++) {
            System.out.print(array[j] + " ");
        }
        System.out.println("\n" + "The resulting array: ");
        for (int j = 49; j >= 0; j--) {
            System.out.print(array[j] + " ");
        }
    }
}
