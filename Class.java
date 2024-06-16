import java.util.*;
public class Class {
    public static void main(String[] args) {
        Super obj=new Super();
        obj.input();
        obj.Display();
    }
}
class Super{
    int age;
    String name;
    float cgpa;
    double length;
    Scanner sc=new Scanner(System.in);
    public void input(){
        System.out.println("Enter a age: ");
          age =sc.nextInt();
          System.out.println("Enter a name: ");
          name =sc.next();
          System.out.println("Enter a cgpa: ");
          cgpa =sc.nextFloat();
          System.out.println("Enter a length: ");
          length =sc.nextDouble();
    }
    public void Display(){
        System.out.println("Age:"+age);
        System.out.println("Name:"+name);
        System.out.println("cgpa:"+cgpa);
        System.out.println("length:"+length);
    }
}