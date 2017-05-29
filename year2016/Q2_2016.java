package year2016;

public class Q2_2016{
	public static void main(String[] args){
		System.out.println(expression(10,0));
	}

	public static boolean expression(int a, int b){
		return 7 < a || a == b && b > 9 - a / b;
	}

	// expression type is boolean and result is true

}