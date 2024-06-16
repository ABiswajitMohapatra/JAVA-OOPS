public class Final {
    public static void main(String[] args) {
        Sub s=new Sub();
        s.meth1();
    }
}

class Super{
    final String name="Biswa";
    final int x=10;
    final void meth1(){
        System.out.println("Final method");
    }
}
class Sub extends Super{
    int x=20;   // we cant modify the final variable
    public void meth1(){          // we cant override the final method
        System.out.println("Biswa");
    }
}