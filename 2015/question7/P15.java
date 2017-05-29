package question7;

public class P15{
    public static void main(String[] args){
        LoyaltyCard card = new LoyaltyCard("123456");
        card.collectRewards(26.99, 5);
        card.collectRewards(3.99, 1);
        System.out.println("is free coffee available? " + card.redeemFreeCoffee());
        card.collectRewards(0.89, 1);
        card.collectRewards(20, 5);
        System.out.println("is free coffee available? " + card.redeemFreeCoffee());
        card.collectRewards(0.50, 2);
        System.out.println("is free coffee available? " + card.redeemFreeCoffee());
        System.out.println("balance: " + card.getBalance());
    }
}

class LoyaltyCard{
    private final String cardNumber;
    private int balance;
    private int numOfCoffee;

    public LoyaltyCard(String number){
        cardNumber = number;
    }

    public String getCardNumber(){
        return cardNumber;
    }

    public int getBalance(){
        return balance;
    }

    public void collectRewards(double amount, int coffees){
        numOfCoffee += coffees;
        balance += (int) amount;
    }

    private boolean isFreeCoffeeAvailable(){
        return numOfCoffee >= 9;
    }

    public boolean redeemFreeCoffee(){
        if(isFreeCoffeeAvailable()){
            numOfCoffee -= 9;
            return true;
        }
        return false;
    }
}