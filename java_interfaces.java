
interface a{
   public void Add();
   public void Bad(); 
}
class mass implements a{
public void Add(){
System.out.println("mission");
}
public void Bad(){
   System.out.println("hassan");
}
}
public class java_interfaces{
   public static void main(String[] args){
    mass obj =new mass();
    obj.Add();
    obj.Bad();

   } 
}
