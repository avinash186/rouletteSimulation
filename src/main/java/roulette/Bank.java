package roulette;
public class Bank {
    private static int balance = 100;
    private static int bet = 0;

    private static int earnings = 0;

    public static void betAdd(int amount) {
        bet += amount;
    }

    public static int getBet() {
        return bet;
    }

    public static int getThisBet(int amount){
        return amount;
    }

    public static int getBalance() {
        return balance;
    }

    public static int setBalance() {
        balance += earnings;
        return balance;
    }

    public static int setEarnings(int amount) {
        earnings += amount;
        return earnings;
    }

    public static int getEarnings() {
        return earnings;
    }

    public static boolean fundsAvailable() {
        if (balance - bet >= 0){
            return true;
        } else {
            return false;
        }
    }
}
