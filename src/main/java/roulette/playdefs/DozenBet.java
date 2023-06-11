package roulette.playdefs;

import roulette.utils.BetUtils;

import java.util.ArrayList;
import java.util.Arrays;

public class DozenBet {
        private final ArrayList<Integer> d1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12));
        private final ArrayList<Integer> d2 = new ArrayList<>(Arrays.asList(13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24));
        private final ArrayList<Integer> d3 = new ArrayList<>(Arrays.asList(25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36));
        private int multiplier = 3;
        BetUtils betUtils = new BetUtils();
        public int d1 (int bet, int winningNumber) {
            return betUtils.numCheck(d1, "DOZEN 1", bet, winningNumber, multiplier);
        }

        public int d2 (int bet, int winningNumber) {
            return betUtils.numCheck(d2, "DOZEN 2", bet, winningNumber, multiplier);
        }

        public int d3 (int bet, int winningNumber) {
        return betUtils.numCheck(d3, "DOZEN 3", bet, winningNumber, multiplier);
    }

}
