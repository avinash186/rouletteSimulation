package roulette.utils;

import roulette.Bank;

import java.util.ArrayList;

public class BetUtils {

    public int numCheck(ArrayList<Integer> cList, String play,int bet, int winningNumber, int multiplier){
        int payout = 0;
        Bank.betAdd(bet);
        if (Bank.fundsAvailable() == false){
            System.out.println("You don't have enough money to make that bet.");
            System.exit(0);
        } else {
            if (cList.contains(winningNumber)) {
                payout = bet * multiplier;
                Bank.setEarnings(payout - bet);
            } else {
                payout = 0;
                Bank.setEarnings(-bet);
            }

            CommonUtils.printBet(play, bet, payout);
        }
        return payout;
    }
}
