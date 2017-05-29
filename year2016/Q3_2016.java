package year2016;

public class Q3_2016{
	public static void main(String[] args){
		printDegreeClassification(new Student(70));
		printDegreeClassification(new Student(69));
		printDegreeClassification(new Student(59));
		printDegreeClassification(new Student(49));
		printDegreeClassification(new Student(39));
		printDegreeClassification(new Student(29));
		printDegreeClassification(new Student(9));
		printDegreeClassification(new Student(-9));
	}

	public static void printDegreeClassification(Student st){
		int avg = st.getAverage();
		String s = "Fail";
		
		if(avg >= 70) s = "First";
		else if (avg >= 60) s = "Upper Second";
		else if (avg >= 50) s = "Lower Second";
		else if (avg >= 40) s = "Third Second";
		else if (avg >= 30) s = "Pass";
		else if (avg < 0) s = "Wrong Mark";

		System.out.println(s);
	}
}

class Student{
	private int average;

	public Student(int a){
		average = a;
	}

	public int getAverage(){
		return average;
	}
}
