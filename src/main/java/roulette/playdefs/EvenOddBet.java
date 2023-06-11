package roulette.playdefs;

import roulette.Bank;
import roulette.utils.BetUtils;
import roulette.utils.CommonUtils;

import java.util.ArrayList;
import java.util.Arrays;

public class EvenOddBet {
        private final ArrayList<Integer> even = new ArrayList<>(Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36));
        private final ArrayList<Integer> odd = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35));
        private int multiplier = 2;
        BetUtils betUtils = new BetUtils();

        public int even (int bet, int winningNumber) {
            return betUtils.numCheck(even, "EVEN", bet, winningNumber,multiplier);
        }

        public int odd (int bet, int winningNumber) {
            return betUtils.numCheck(odd, "ODD", bet, winningNumber,multiplier);
        }

}
