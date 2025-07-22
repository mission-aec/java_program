public class Modifiers {
    final int x = 10;
  final double PI = 3.14;
  static void myStaticMethod() {
    System.out.println("Static methods can be called without creating objects");
  }
  public void myPublicMethod() {
    System.out.println("Public methods must be called by creating objects");
  }
    public static void main(String[] args) {
        Modifiers myObj = new Modifiers();
        //myObj.x = 50; 
        //myObj.PI = 25; 
        myStaticMethod();
         // myPublicMethod();
         myObj.myPublicMethod();
        System.out.println(myObj.x);   
    }
}
