package roulette;
public class Bank {
    private int balance = 0;
    private static int bet = 0;

    public static void betAmount(int amount) {
        bet += amount;
    }

    public static int getBet() {
        return bet;
    }
}
