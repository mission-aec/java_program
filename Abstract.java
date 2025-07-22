import java.lang.String;

abstract class  main{
    public String fname = "John";
    public int age = 24;
    //public abstract void study(); 
    public void study(){
      System.out.println("Studying all day long");
    }
}


class student extends main {
    public int graduationYear = 2018;
    // public void study() { 
    //   System.out.println("Studying all day long");
    // }
  }


public class Abstract {
 public static void main(String[] args) {
    student myObj = new student();

    System.out.println("Name: " + myObj.fname);
    System.out.println("Age: " + myObj.age);
    System.out.println("Graduation Year: " + myObj.graduationYear);
    myObj.study();
 }   
}
