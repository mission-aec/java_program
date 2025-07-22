public class java_constructors {
    int x;
    public java_constructors(int y){
        x=y;
    }
   public static void main(String[] args) {
    java_constructors obj =new java_constructors(5);
    System.out.println(obj.x);
   } 
}
