public class Interface {
    public static void main(String[] args) {
        Sub obj=new Sub();
        obj.dis();
        obj.dis1();
    }
}
interface  Base{
     public void dis();
     public void dis1();
}
class Sub implements Base{
    public void dis(){
        System.out.println("Meth1.....");
    }
    public void dis1(){
        System.out.println("meth2....");
    }
}