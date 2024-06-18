public class Thiskey {
    public static void main(String[] args) {
        Super obj=new Super();
        Super x=new Super(21,"Biswa");
        x.Dis();
    }
}
class Super{
    int age;
    String name;
    public Super(){
        System.out.println("Non parametrized constructor");
    }
    public Super(int age ,String name){
     this.age=age;
     this.name=name;
    }
    public void Dis(){
        System.out.println(this.age);
        System.out.println(this.name);
    }
}