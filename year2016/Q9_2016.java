package year2016;

public class Q9_2016{
	private static int a = 0;
	private int b;
	private String s;

	public Q9_2016(int n){
		b = a;
		a += n;
		s = "0: " + n;
	}

	public static void main(String[] args){

		Q9_2016 t1 = new Q9_2016(1);
		System.out.println(t1.s + ", " + t1.b + ", " + t1.a);

		Q9_2016 t2 = new Q9_2016(2);
		System.out.println(t2.s + ", " + t2.b + ", " + t2.a);

		Q9_2016 t3 = new Q9_2016(3);
		System.out.println(t3.s + ", " + t3.b + ", " + t3.a);
	}

	/*
	* output:
	* 0: 1, 0, 1
	* 0: 2, 1, 3
	* 0: 3, 3, 6
	*
	*/

}