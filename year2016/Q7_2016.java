package year2016;

public class Q7_2016{
	public static void main(String[] args){
		String[] labels = {"Egypt", "France", "Japan", "Switzerland"};
		int[] data = {10, 20, 100, 50};
		printBarChart(data, labels);
	}

	public static void printBarChart(int data[], String labels[]){
		int longestLabel = 0;
		for(String l : labels){
			if(l.length() > longestLabel) longestLabel = l.length();
		}

		int largestData = data[0];
		for(int i = 0; i < data.length; i++){
			if(data[i] > largestData) largestData = data[i];
		}

		double star = 40.0 / largestData;

		for(int i = 0; i < data.length; i++){
			System.out.printf("%" + longestLabel + "s ", labels[i]);
			double numOfStars = star * data[i];
			System.out.println(new String(new char[(int)numOfStars]).replace("\0", "*"));
		}
	}
}