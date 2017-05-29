package year2016;

public class Q8_2016{
	public static void main(String[] args){
		
	}
}

class FrequentFlyer{
	private final int accountNumber;
	private int balance;
	private int yearBalance;
	private int tier;

	public FrequentFlyer(int number){
		accountNumber = number;
	}

	public int getAccountNumber(){
		return accountNumber;
	}

	public int getBalance(){
		return balance;
	}

	public int getTier(){
		return tier;
	}

	public void addFlight(int miles){
		double rate = (tier == 1) ? 1.25 : 1;
		balance += (int) miles * rate;
		yearBalance += (int) miles * rate;
	}

	public void endOfYear(){
		if(yearBalance > 10000) tier = 1;
		yearBalance = 0;
	}

	public boolean redeemPoints(int points){
		if(points > balance)return false;
		balance - points;
		return true;
	}
}