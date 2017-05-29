package year2016;

public class Q6_2016{
	public static void main(String[] args){
		double[] a = {2, 4, 4, 4, 7, 9};
		System.out.println(getMean(a));
		System.out.println(getStandardDeviation(a));
	}

	public static double getMean(double[] vec){
		double sum = 0;
		for(double d : vec){
			sum += d;
		}
		return sum / vec.length;
	}

	public static double getStandardDeviation(double[] vec){
		double mean = getMean(vec);
		double n = 0;
		for(double d : vec){
			n += Math.pow((d - mean), 2);
		}
		return Math.sqrt(n / vec.length);
	}
}