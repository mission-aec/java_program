public class mathod_overloading {

    static int add(int a, int b) {
        return a + b;
    }

    static double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        int sum1 = add(4, 5);
        double sum2 = add(2.33, 3.77);
        System.out.println("Sum is: " + sum1);
        System.out.println("Sum is: " + sum2);
    }
}
