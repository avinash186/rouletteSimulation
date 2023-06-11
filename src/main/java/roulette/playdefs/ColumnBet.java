package roulette.playdefs;

import roulette.utils.BetUtils;

import java.util.ArrayList;
import java.util.Arrays;

public class ColumnBet {
        private final ArrayList<Integer> c1 = new ArrayList<>(Arrays.asList(1, 4, 7, 10, 13, 16, 19, 22, 25, 28, 31, 34));
        private final ArrayList<Integer> c2 = new ArrayList<>(Arrays.asList(2, 5, 8, 11, 14, 17, 20, 23, 26, 29, 32, 35));
        private final ArrayList<Integer> c3 = new ArrayList<>(Arrays.asList(3, 6, 9, 12, 15, 18, 21, 24, 27, 30, 33, 36));
        private int multiplier = 3;
        BetUtils betUtils = new BetUtils();
        public int c1 (int bet, int winningNumber) {
            return betUtils.numCheck(c1, "COLUMN 1", bet, winningNumber,multiplier);
        }

        public int c2 (int bet, int winningNumber) {
            return betUtils.numCheck(c2, "COLUMN 2", bet, winningNumber,multiplier);
        }

        public int c3 (int bet, int winningNumber) {
        return betUtils.numCheck(c3, "COLUMN 3", bet, winningNumber,multiplier);
    }

}
