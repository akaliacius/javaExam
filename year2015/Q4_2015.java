package year2015;

public class Q4_2015{
    public static void main(String[] args){
        double[] d = {0,3,4};
        System.out.println(getEuclideanNorm(d));

        double[] d2 = getNormalised(d);
        for(double dbl : d2){
            System.out.println(dbl);
        }
    }


    public static double getEuclideanNorm(double[] vec){
        double sum = 0;
        for(int i = 0; i < vec.length; i++){
            sum += Math.pow(vec[i], 2);
        }
        return Math.sqrt(sum);
    }

    public static double[] getNormalised(double[] vec){
        double euc = getEuclideanNorm(vec);
        double[] result = new double[vec.length];
        for(int i = 0; i < vec.length; i++){
            result[i] = vec[i] / euc;
        }
        return result;
    }
}
