package year2015;

public class Q8_2015_B{
    
    public static void main(String[] args){
        boolean b = expression(9, 2);
        System.out.println(b);

        // expression is boolean and answer is true
    }

    public static boolean expression(int a, int b){
        return a > 8 || b > 9 - a / 9 && a == b;
    }
}