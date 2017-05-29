package year2015;

public class Q6_2015{
    public static void main(String[] args){
        String s = "quick brown fox      jumps      over the lazy dog";
        printWords(s);
    }

    public static void printWords(String s){
        String[] words = s.split(" ");
        if(words.length > 0){
            for(String w : words){
                if(!w.isEmpty()) System.out.println(w.trim());
            }
        }
    } 
}
