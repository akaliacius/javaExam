package year2015;

public class Q3_2015{
    public static void main(String[] args){
        a();
        b();
        c();
    }

    public static void a(){
        for(int i = 16; i >= 2; i = i / 2){
            System.out.print(i / 2); 
        }
        System.out.println();
    } // output 8421 

    public static void b(){
        int q = 16;
        while(q > 1){
            System.out.print(q / 2);
            q = q / 2;
        }
        System.out.println();
    } // output before changes 4210

    public static void c(){
        int v = 16;
        do{
            v /= 2;
            System.out.print(v);
        } while(v > 1);
        System.out.println();
    } // output before changes 168421


}
