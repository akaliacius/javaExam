package year2015;

public class Q8_2015{
    private static int c = 1;
    private int b, n;

    Q8_2015(int b){
        c++;
        this.b = b;
        this.n = c;
    }

    public static void main(String[] args){
        Q8_2015 t1 = new Q8_2015(3);
        System.out.println("1: " + t1.b + ", " + t1.n + ", " + t1.c);

        Q8_2015 t2 = new Q8_2015(2);
        System.out.println("1: " + t2.b + ", " + t2.n + ", " + t2.c);
    }

}
