public class Cons {
    public static void main(String[] args) {
        Super x=new Super(12.67,8.34);
        System.out.println(x.Area());
        x.setlength(2.34);
        x.setBreadth(3.89);
        System.out.println(x.Area());

    }
}
class Super{
    private double length;
    private double breadth;
    public double getLength(){
        return length;
    }
    public double getBreadth(){
        return breadth;
    }
    public void setlength(double l){
        length=l;
    }
    public void setBreadth(double b){
        breadth=b;
    }
    public Super(){
        length=10;
        breadth=20;
    }
    public Super(double l,double b){
        length=l;
        breadth=b;
    }
    public double Area(){
        return length*breadth;
    }

}