import java.lang.String;

class vehicle{
    protected String brand ="BMW";
    public void honk(){
      System.out.println(brand);
    }
}
class car extends vehicle{
String modelname="c3r";

}
public class java_inheritance {
  public static void main(String[] args) {
    car mycar =new car();
    mycar.honk();
    System.out.println(mycar.brand+" "+mycar.modelname);
  }  
}
