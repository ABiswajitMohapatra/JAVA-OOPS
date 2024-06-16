public class Absraction {
    public static void main(String[] args) {         
        Sub s=new Sub();
        s.meth2();
        s.meth1();
    }
}
abstract class Super{
    abstract   void meth1();
    abstract  void meth2();
    void meth3(){
        System.out.println("concrete method");
    }
}
class Sub extends Super{
    public void meth1(){
        System.out.println("Method 1...");
        super.meth3();
    }
    public void meth2(){
        System.out.println("Method 2....");
    }
}
