public class MultipleInterface {
    public static void main(String[] args) {
        Base obj=new Mul();
        obj.Meth1();
        obj.Meth2();
        Child obj1=new Mul();
        obj1.Meth3();
        obj1.Meth4();

    }
}
interface Base{
    public void Meth1();
    public void Meth2();
}
interface Child{
    public void Meth3();
    public void Meth4();
}
class Mul implements Base,Child{
    public void Meth1(){
        System.out.println("Meth1....");
    }
    public void Meth2(){
        System.out.println("Meth2....");
    }
    public void Meth3(){
        System.out.println("Meth3....");
    }
    public void Meth4(){
        System.out.println("Meth4....");
    }
}