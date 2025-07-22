public class mathods {
    // static void sum(int a, int b) {
    // int s = a + b;
    // System.out.println("sum= " + s);

    // }

    // void sum(int a, int b) {
    // int s = a + b;
    // System.out.println("sum= " + s);

    // }

    int sum(int a, int b) {
        int s = a + b;
        return s;
    }

    public static void main(String[] args) {
        mathods m = new mathods();
        int c = 10, d = 20;
        // sum(c, d);
        // m.sum(c, d);
        int s = m.sum(c, d);
        System.out.println("sum= " + s);
    }
}