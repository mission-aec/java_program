import java.lang.String;

class Encap{
    private String name;
    public String getName(){
        return name;
    }
    public void setName(String mission){
        this.name = mission;
    }

}
public class java_Encapsulation {
    public static void main(String[] args) {
        Encap Obj =new Encap();
        Obj.setName("mission");
        System.out.println(Obj.getName());
    }
}
