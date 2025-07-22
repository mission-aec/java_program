
import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class LambdaCalculus {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            ArrayList<Integer> number = new ArrayList<>();
            System.out.print("Enter numbers amount you wants: ");
            int n = in.nextInt();
            System.out.print("Enter values: ");
            for (int i = 0; i < n; i++) {
                number.add(i, in.nextInt());
            }
            EvenNumber en = new EvenNumber(number, n);
            Sum s = new Sum(number, n);
            Desending de = new Desending(number);
            Print p = new Print(number, n);
        } catch (InputMismatchException ime) {
            System.out.println("You put wrong input. please input number.");
        }

    }
}

class EvenNumber {

    EvenNumber(ArrayList<Integer> number, int n) {
        System.out.print("The even number of the list is: ");
        for (int i = 0; i < n; i++) {
            if (number.get(i) % 2 != 0) {
                System.out.print(number.get(i) + " ");
            }
            System.out.println();
        }
    }

}

class Sum {

    int sum = 0;

    Sum(ArrayList<Integer> number, int n) {
        for (int i = 0; i < n; i++) {
            sum = sum + number.get(i);
        }
        System.out.println("The full array list sum is: " + sum);
    }
}

class Print {

    Print(ArrayList<Integer> number, int n) {
        System.out.println("Your list was");
        for (int i = 0; i < n; i++) {
            System.out.print(number.get(i) + " ");
        }
    }
}

class Desending {

    Desending(ArrayList<Integer> number) {

        Collections.sort(number, Collections.reverseOrder());
        System.out.println("Arraylist in desending list is: " + number);

    }
}
