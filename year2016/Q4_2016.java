package year2016;

public class Q4_2016{
	public static void main(String[] args){
		for(int i = 1; i <= 5; i++){
			for(int j = 1; j <= 3; j++){
				if(j == 1 && (i % 4) == 1)
					System.out.print("W");
				else if(j > 1 && (i + j) % 2 == 1)
					System.out.print("W");
				else
					System.out.print(".");
			}
			System.out.println();
		}
	}
}