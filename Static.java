public class Static {
    public static void main(String[] args) {
        System.out.println(Super.x);
       // System.out.println(Super.y);
        Super s=new Super();
        s.Show();
    }
}
class Super{
    static int x=12;
     int y=23;
    static void dis(){                      
        System.out.println("ndfjfnjef");
    }
    public void Show(){
        System.out.println(x);
        System.out.println(y);
    }

}