package year2015;

public class Q10_2015_B{

    public static void main(String[] args){
        int[] r = {1, 2, 5, 5, 3, 1, 2, 4, 3, 2, 2, 2, 2, 3, 6, 5, 5, 3, 1};
        System.out.println(getLongestRunLength(r));
    }

    public static int getLongestRunLength(int[] v){
        int max = 0;
        for(int i = 0; i < v.length; i++){
            int counter = 1;
            for(int j = i+1; j < v.length; j++){
                if(v[i] != v[j]) break;
                counter++;
            }
            if(counter > max) max = counter;
        }
        return max;
    }
}