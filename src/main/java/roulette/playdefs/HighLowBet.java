package roulette.playdefs;

import roulette.Bank;
import roulette.utils.CommonUtils;

import java.util.ArrayList;
import java.util.Arrays;

public class HighLowBet {
        private final ArrayList<Integer> low = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18));
        private final ArrayList<Integer> high = new ArrayList<>(Arrays.asList(19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36));

        public int low (int bet, int winningNumber) {
            int payout = 0;
            Bank.betAdd(bet);

            if (low.contains(winningNumber)) {
                payout = bet * 2;
                Bank.setEarnings(payout - bet);
            } else {
                payout = 0;
                Bank.setEarnings(-bet);
            }

            CommonUtils.printBet("LOW", bet, payout);
            return payout;
        }

        public int high (int bet, int winningNumber) {
            int payout = 0;
            Bank.betAdd(bet);

            if (high.contains(winningNumber)) {
                payout = bet * 2;
                Bank.setEarnings(payout - bet);
            } else {
                payout = 0;
                Bank.setEarnings(-bet);
            }


            CommonUtils.printBet("HIGH", bet, payout);
            return payout;
        }

}
