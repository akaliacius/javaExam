package year2015;

public class Q2_2015{
    public static void main(String[] args){
        System.out.println("2016: " + isLeapYear(2016));
        System.out.println("2100: " + isLeapYear(2100));
        System.out.println("2000: " + isLeapYear(2000));
    }

    public static boolean isLeapYear(int year){
        if(year % 4 != 0) return false;
        if(year % 100 == 0 && year % 400 != 0) return false;
        return true;
    } 
}