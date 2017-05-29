package year2015;

public class Q5_2015{
    public static void main(String[] args){
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                if((i % 2 == 0 && j % 2 == 0) || (i % 2 == 1 && j % 2 == 1))
                    System.out.print("w");
                else
                    System.out.print("b");
            }
            System.out.println();
        }
    }

    /*
    *
    * output:
    *
    * wbwb
    * bwbw
    * wbwb
    * bwbw
    *
    */
}

