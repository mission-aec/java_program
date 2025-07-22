
import java.util.Scanner;

public class problem {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Array element
        System.out.print("Enter tne number of array element:");
        int n = input.nextInt();
        int[] array = new int[n];
        System.out.print("Enter " + n + " element:");
        for (int i = 0; i < n; i++) {
            array[i] = input.nextInt();
        }
        System.out.print("The array element is : ");
        for (int i = 0; i < n; i++) {
            System.out.print(" " + array[i]);
        }
        System.out.println();
        //bubblesort
        int m = array.length;
        for (int i = 0; i < m - 1; i++) {
            for (int j = 0; j < m - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.print("Array element after bubble sort: ");
        for (int i = 0; i < m; i++) {
            System.out.print(array[i] + " ");
        }
        //linear scarch
        System.out.println();

        //binary scarch
        System.out.println("Enter your element to scarch: ");
        int key = input.nextInt();
        int low = 0, high = array.length - 1;
        while (low <= high) {
            int mid = (high + low) / 2;
            if (array[mid] == key) {
                System.out.print("Element " + mid);
                break;
            } else if (array[mid] < key) {
                low = mid;
            } else {
                high = mid;
            }
        }
        input.close();
    }
}
