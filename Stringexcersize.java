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
        //Q-java program to print Even length words in a String?
        String a="I have completed my graduation from BJP college in Bhubaneswar";
        String word[]=a.split("\\s");
        for(String w:word){
            if(w.length()%2==0){
                System.out.println(w);
            }
        }
    }
}
