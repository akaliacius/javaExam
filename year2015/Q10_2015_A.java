package year2015;

public class Q10_2015_A{

    public static void main(String[] args){
        int[] r = {2, 1, 3, 2, 6, 3, 7, 4};

        for(int i = 1; i <= r.length - 2; i += 2){
            System.out.print(f(r[i + 1]));
        }
    }

    public static String f(int r){
        return r - 1 + "-";
    }

    /*
    * output:
    *
    * 2-5-6
    *
    */
}