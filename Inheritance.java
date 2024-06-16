import java.util.*;
public class Inheritance {
    public static void main(String[] args) {
        circle obj=new circle();
        obj.radius=6.74;
        obj.height=3.78;
        System.out.println(obj.Area());
        System.out.println(obj.Circumtance());
        System.out.println(obj.volume());

    }
}
class Shape{
    public double radius;
    public double Area(){
        return Math.PI*radius*radius;
    }
    public double Circumtance(){
        return 2*Math.PI*radius;
    }
}
class Circle extends Shape{
    public double height;
    public double volume(){
        return Area()*height;
    }
}