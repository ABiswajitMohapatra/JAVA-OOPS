//STRING->COLLECTION OF CHARACTER :
public class str {
    public static void main(String[] args) {
        String str="Biswajit Mohapatra";
        //String ->class
        //str->reference
        //Biswajit Mohapatra->string object

        String str2=new String("Vishesh");
        //str=refenrence that hold the object "vishesh"

        // str->created in heap 
        //object ->vushesh stored in pool 
        //str->pointing to the object vishesh(store in pool)

        String x="Biswa";
        String y=new String ("Biswa");

        //  both x and y reference pointing to one object Biswa (beacause its same),it will not create another object
        
        
        //Byte array and char array:
        char c[]={'A','b','n','L'};
        String ch=new String(c);
        System.out.println(ch);

        byte a[]={65,67,68,69,70};
        String b=new String(a);
        System.out.println(b);

        String a1="Biswa";
        String a2="Biswa";
        System.out.println(a1==a2);
    }

}
