public class Stringexcersize {
    public static void main(String[] args) {

    /*
        //Q. REPLACE SPECIAL CHARACTER FROM THE STRING?
        String str="aB@jkj!23# kj$";
        System.out.println(str.replaceAll("[^a-zA-z0-9]",""));

        //Q.REPLACE EXTRA SPACE FROM THE STRING?
        String s="      gbv    bjfbdj    jjd jdhfdj    jnfj kdnj  ";
        System.out.println(s.replaceAll("\\s+"," "));

        String s1="      gbv    bjfbdj    jjd jdhfdj    jnfj kdnj  ";
        System.out.println(s1.replaceAll("\\s+"," ").trim());

        //Q.FIND THE NUMBER OF WORDS IN THE STRING?

        String x="Biswa how are you?";
        String word[]=x.split("\\s");
        System.out.println(word.length);
*/
/*
        //Q-java program to print Even length words in a String?
        String a="I have completed my graduation from BJP college in Bhubaneswar";
        String word[]=a.split("\\s");
        for(String w:word){
            if(w.length()%2==0){
                System.out.println(w);
            }
        }

        //REVERSE A STRING :

        String p="Biswa";
        String rev="";
        for(int i=0;i<p.length();i++){
            rev=p.charAt(i)+rev;
        }
        System.out.println(rev);
*/
        // // REPLACE "E" AS "I":

    String str="mhdjijrijsjv kvnshchjdenm ejjbjebebeje";
    String rev="";
    for(int i=0;i<str.length();i++){
        if(str.charAt(i)=='e'){
            rev+='i';
        }else{
            rev+=str.charAt(i);
        }
    }
    System.out.println(rev);

   // Question 1 : Count how many times lowercase vowels occurred in a String entered by the user.

   String s="gdsv VGVg hHH hVHHB  eucniqeaoi";
   int vowel=0;
   for(int i=0;i<s.length();i++){
    if(s.charAt(i)=='a' || s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u' ){
        vowel++;
    }
   }
System.out.println(vowel);
    }
}
