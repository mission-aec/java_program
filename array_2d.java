
import java.util.*;

public class array_2d {
    public static void main(String[] args) {

        {
            int i, j;
            int[][] array;
            array = new int[5][2];
            Scanner input = new Scanner(System.in);

            System.out.println("Enter Array:");
            for (i = 0; i < 5; i++) {
                for (j = 0; j < 2; j++) {
                    array[i][j] = input.nextInt();
                }
                // System.out.print("\n");
            }

            System.out.println("Array:");
            /*
             * for (i = 0; i < 5; i++) {
             * for (j = 0; j < 2; j++) {
             * 
             * System.out.print(" " + array[i][j]);
             * }
             * System.out.print("\n");
             * }
             */

            // for each loop
            for (int[] row : array) {
                for (int element : row) {
                    System.out.print(" " + element);
                }
                System.out.print("\n");
            }
        }
    }
}