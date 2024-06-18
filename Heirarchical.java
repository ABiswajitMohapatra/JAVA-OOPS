public class Heirarchical {
    public static void main(String[] args) {
        Cat c=new Cat();
        c.Meth1();
        c.Meth2();
        c.Meth5();
        c.Meth6();   
        Dog d=new Dog();
        d.Meth3();
        d.Meth4();      
    }
}
class Animal{
    public void Meth1(){
        System.out.println("Biswajit......");
    }
    public void Meth2(){            
        System.out.println("Achary....");
    }
}
class Dog extends Animal{
    public void Meth3(){
        System.out.println("adhiraj");
    }
    public void Meth4(){
        System.out.println("egg...");
    }
}
class Cat extends Animal{
    public void Meth5(){
        System.out.println("Vishesh.....");
    }
    public void Meth6(){
        System.out.println("Niswas....");
    }
}