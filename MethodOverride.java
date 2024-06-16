public class MethodOverride {
    public static void main(String[] args) {
        Sub s=new Sub();
        s.meth1();
        s.meth2();
        Super obj=new Super();
        obj.meth1();
        obj.meth2();
    }
}
class Super{
    public void meth1(){
        System.out.println("Method1 is calling....");
    }
    public void meth2(){
        System.out.println("Method2 is calling");
    }
}
class Sub extends Super{
    public void meth1(){
        System.out.println("Sub meth1 is calling....");
    }
    public void meth2(){
        System.out.println("Sub meth2 is calling....");
    }
}