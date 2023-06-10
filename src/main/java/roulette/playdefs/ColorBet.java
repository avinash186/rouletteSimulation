package roulette.playdefs;

import roulette.Bank;

import java.util.ArrayList;
import java.util.Arrays;

public class ColorBet {

    private final ArrayList<Integer> black = new ArrayList<>(Arrays.asList(2, 4, 6, 8, 10, 11, 13, 15, 17, 20, 22, 24, 26, 28, 29, 31, 33, 35));
    private final ArrayList<Integer> red = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 9, 12, 14, 16, 18, 19, 21, 23, 25, 27, 30, 32, 34, 36));

    public int red (int bet, int winningNumber) {
        int payout = 0;
        Bank.betAmount(bet);

        if (red.contains(winningNumber)) {
            payout = bet * 2;
        } else {
            payout = 0;
        }
        System.out.println("The winning number was: " + winningNumber+ "\nYou bet $" + Bank.getBet() + " on red "
                + " and won $" + payout + ".");
        return payout;
    }

    public int black (int bet, int winningNumber) {
        int payout = 0;
        Bank.betAmount(bet);

        if (black.contains(winningNumber)) {
            payout = bet * 2;
        } else {
            payout = 0;
        }
        System.out.println("The winning number was: " + winningNumber+ "\nYou bet $" + Bank.getBet() + " on black "
                + " and won $" + payout + ".");
        return payout;
    }
}
