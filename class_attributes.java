import java.lang.String;

public class class_attributes {
     //final int x=10;
     int x=10;
     String name="mission";
  public static void main(String[] args) {
    class_attributes myObj = new class_attributes();
    class_attributes myObj1= new class_attributes();
    myObj.x = 40;
    myObj1.x = 20;
    myObj.name="hassan";
    myObj1.name="mission";
    System.out.println(myObj.x);
    System.out.println(myObj1.x);
    System.out.println(myObj1.name);
    System.out.println(myObj.name);
  }
}
