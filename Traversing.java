
import java.util.*;

public class Traversing {

    public static void maximum(int array[]) {
        int i;
        int max = array[0];
        for (i = 0; i < 10; i++) {
            if (array[i] > max) {
                max = array[i];
            }

        }
        System.out.println("The maximum element of the array is: " + max);
    }

    public static void minimum(int array[]) {
        int i;
        int min = array[0];
        for (i = 0; i < 10; i++) {
            if (array[i] < min) {
                min = array[i];
            }

        }
        System.out.println("The minimum element of the array is: " + min);
    }

    public static void average(int array[]) {
        int i;
        int sum = 0;
        for (i = 0; i < 10; i++) {
            sum = sum + array[i];
        }
        System.out.println("The average of the elements of the array is: " + sum / 10);
    }

    public static void sum(int array[]) {
        int i;
        int sum = 0;
        for (i = 0; i < 10; i++) {
            sum = sum + array[i];
        }
        System.out.println("The sum of the elements of the array is: " + sum);
    }

    // public static void sin(int array[]) {
    //     int i;
    //     int sin;
    //     for (i = 0; i < 10; i++) {
    //         sin = toredious(i);
    //     }
    // }

    public static void main(String[] args) {

        int array[] = new int[10];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the elements of the array: ");
        int i;
        try {

            for (i = 0; i < 10; i++) {
                array[i] = input.nextInt();
            }
        } catch (Exception e) {

            System.out.println("An error occurred: " + e);

        }
        System.out.print("The elements of the array are: ");
        for (i = 0; i < 10; i++) {
            System.out.print(" " + array[i]);
        }

        maximum(array);
        minimum(array);
        average(array);
        sum(array);
       // sin(array);
    }
}
