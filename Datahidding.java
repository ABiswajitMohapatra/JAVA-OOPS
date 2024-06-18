public class Datahidding {
    public static void main(String[] args) {
        Base obj=new Base();
        obj.setLength(5);
        obj.setBreadth(8);
        System.out.println(obj.Area());

    }
}
class Base{
    private int length;
    private int breadth;
    public int getLength(){
        return length;
    }
    public int getBreadth(){
        return breadth;
    }
    public void setLength(int length){
        this.length=length;
    }
    public void setBreadth(int breadth){
        this.breadth=breadth;
    }
    public int Area(){
        return length*breadth;
    }
}