package roulette.playdefs;

import roulette.Bank;
import roulette.utils.BetUtils;
import roulette.utils.CommonUtils;

import java.util.ArrayList;
import java.util.Arrays;

public class HighLowBet {
        private final ArrayList<Integer> low = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18));
        private final ArrayList<Integer> high = new ArrayList<>(Arrays.asList(19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36));
        private int multiplier = 2;
        BetUtils betUtils = new BetUtils();
        public int low (int bet, int winningNumber) {
            return betUtils.numCheck(low, "LOW", bet, winningNumber,multiplier);
        }

        public int high (int bet, int winningNumber) {
            return betUtils.numCheck(high, "HIGH", bet, winningNumber,multiplier);
        }

}
