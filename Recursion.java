import java.util.Scanner;

public class Recursion {
    /*public static int sum(int x) {
        if (x > 0) {
            return (x + sum(x - 1));
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();
        int result = sum(num);
        System.out.println("sum= " + result);
        
    }*/
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter start number: ");
        int start=input1.nextInt();
        System.out.println("Enter end number: ");
        int end=input1.nextInt();
        int result = sum(start , end);
        System.out.println(result);
      }
      public static int sum(int start, int end) {
        if (end > start) {
          return end + sum(start, end - 1);
        } else {
          return end;
        }
      }
}