class outer{
int x=10;
//class inner{
static class inner{
//private class inner{
int y=5;
}
}
public class java_inner_class {
    public static void main(String[] args) {
    outer.inner in = new outer.inner();
    outer out=new outer();
    //outer.inner in =out.new inner();  
    System.out.println(out.x+in.y);
    //System.out.println(in.y);
    }
}
