package roulette.playdefs;

import roulette.utils.BetUtils;

import java.util.ArrayList;
import java.util.Arrays;

public class StraightBet {
        private int multiplier = 36;
        BetUtils betUtils = new BetUtils();
        public int straightBet (int betAmount, int betNum, int winningNumber) {
            final ArrayList<Integer> c1 = new ArrayList<>(Arrays.asList(betNum));

            return betUtils.numCheck(c1,"Stright Bet on " + betNum, betAmount, winningNumber,multiplier);
        }

}
