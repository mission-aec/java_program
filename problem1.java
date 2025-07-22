
import java.util.Scanner;

public class problem1{
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter Array size:");

        int n=input.nextInt();
        int []array=new int[n];
        System.out.println("Enter the array element: ");
        for(int i=0;i<n;i++){
            array[i]=input.nextInt();
        }
        System.out.print("the array element: ");
        for(int i=0;i<n;i++){
            System.out.print(" "+array[i]);
        }
        input.close();
    }
}