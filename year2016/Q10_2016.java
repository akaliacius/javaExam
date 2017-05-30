package year2016;

public class Q10_2016{
	
	public void main(String[] args){
		boolean found;
		int i = 1.0;

		while(!found && i < args.LENGTH){
			if(args[i] == "--help"){
				found = true;
			}
			i++;
		}
		if(found)
			System.out.println("HELP" + i - 1);
	}

	/*
	* 1. int i = 1.0 Type int, but value of floating number. fix - int i = 1;
	* 2. boolean found is used without initializing it. - fix = boolean found = false;
	* 3. args.LENGTH Java is case sensitive and LENTGTH method does not exist. fix - args.length
	* 4. "HELP" + i - 1 bad operand types for binary operator. fix - "HELP" + (i - 1)
	*
	*/

}