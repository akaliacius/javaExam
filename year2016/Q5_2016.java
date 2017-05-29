package year2016;

public class Q5_2016{
	public static void main(String[] args){
		a();
		System.out.println();

		b();
		System.out.println();

		c();
		System.out.println();
	}

	public static void a(){
		int k = 0;
		for(int i = 10; i > 2; i = i - 3){
			k = k + i;
			System.out.print(k - 1);
		}
	} // output: 91620

	public static void b(){
		int k = 0;
		int j = 10;
		while(j > 2){
			k = k + j;
			j = j - 3;
			System.out.print(k - 1);
		}
	} // output before changing: 61011

	public static void c(){
		int k = 0;
		int j = 10;
		do{
			k = k + j;
			j = j - 3;
			System.out.print(k - 1);
		} while(j > 2);
	} // output before changing: 9162021
}