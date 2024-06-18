public class Super {
    public static void main(String[] args) {
        Derived d = new Derived();
        // d.meth1();
        d.meth2();
        d.meth3();
    }
}

class Base {
    public void meth1() {
        System.out.println("Meth1 is called...");
    }

    int x = 10;

    public Base() {
        System.out.println("Constructor is called...");
    }
}

class Derived extends Base {
    public void meth2() {
        System.out.println("Meth2 is called");
        super.meth1();
    }

    public void meth3() {

        System.out.println("meth3 is called...");
        System.out.println(super.x);
    }

    public Derived() {
        super();
        System.out.println("Derived constuctor...");
    }
}