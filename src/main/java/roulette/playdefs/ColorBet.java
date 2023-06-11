package roulette.playdefs;

import roulette.Bank;
import roulette.utils.BetUtils;
import roulette.utils.CommonUtils;

import java.util.ArrayList;
import java.util.Arrays;

public class ColorBet {

    private final ArrayList<Integer> black = new ArrayList<>(Arrays.asList(2, 4, 6, 8, 10, 11, 13, 15, 17, 20, 22, 24, 26, 28, 29, 31, 33, 35));
    private final ArrayList<Integer> red = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 9, 12, 14, 16, 18, 19, 21, 23, 25, 27, 30, 32, 34, 36));
    private int multiplier = 2;
    BetUtils betUtils = new BetUtils();

    public int red(int bet, int winningNumber) {
        return betUtils.numCheck(red, "RED", bet, winningNumber,multiplier);
    }

    public int black(int bet, int winningNumber) {
        return betUtils.numCheck(black, "BLACK", bet, winningNumber,multiplier);
    }
}
