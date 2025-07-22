public class class_mathod {
    // static void method(){
    //     System.out.println("hgsdghs"); 
    // }
    // public void method2(){
    //     System.out.println("hgsdghs");  
    // }
    public void fullThrottle(){
        System.out.println("The car is going as fast as it can!");
    }
    public void speed(int maxSpeed){
        System.out.println("Max speed is: " + maxSpeed);  
    }
    public static void main(String[] args) {
    //    method();
    //    class_mathod obj=new class_mathod();
    //    obj.method2();
    class_mathod mycar=new class_mathod();
    mycar.fullThrottle();
    mycar.speed(90);
    }
}
