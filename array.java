import java.util.Scanner;

public class array {
    public static void main(String[] args) {

        {
            // int i;
            int[] array;
            array = new int[5];
            Scanner input = new Scanner(System.in);
            System.out.println("Enter Array:");
            for (int i = 0; i < 5; i++) {
                array[i] = input.nextInt();
            }
            System.out.println("Array length: " + array.length);
            System.out.println("Array:");
            // for (i = 0; i < 5; i++) {
            // System.out.print(" " + array[i]);
            // }
            for (int i : array) {
                System.out.print(" " + i);
            }

        }
    }
}