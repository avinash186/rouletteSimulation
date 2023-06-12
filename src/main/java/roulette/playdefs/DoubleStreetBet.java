package roulette.playdefs;

import roulette.utils.BetUtils;

import java.util.ArrayList;
import java.util.Arrays;

public class DoubleStreetBet {

    private final static ArrayList<Integer> ds1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
    private final static ArrayList<Integer> ds2 = new ArrayList<>(Arrays.asList(7, 8, 9, 10, 11, 12));
    private final static ArrayList<Integer> ds3 = new ArrayList<>(Arrays.asList(13, 14, 15, 16, 17, 18));
    private final static ArrayList<Integer> ds4 = new ArrayList<>(Arrays.asList(19, 20, 21, 22, 23, 24));
    private final static ArrayList<Integer> ds5 = new ArrayList<>(Arrays.asList(25, 26, 27, 28, 29, 30));
    private final static ArrayList<Integer> ds6 = new ArrayList<>(Arrays.asList(31, 32, 33, 34, 35, 36));

    private int multiplier = 6;
        BetUtils betUtils = new BetUtils();
        public int doubleStreetBet (int betAmount, String streetNum, int winningNumber) {
            return betUtils.numCheck(getStreetByName(streetNum),"Double Street Bet on " + streetNum, betAmount, winningNumber,multiplier);
        }

    private ArrayList<Integer> getStreetByName(String streetName) {
        switch (streetName) {
            case "1":
                return ds1;
            case "2":
                return ds2;
            case "3":
                return ds3;
            case "4":
                return ds4;
            case "5":
                return ds5;
            case "6":
                return ds6;
            default:
                throw new IllegalArgumentException("Invalid street name: " + streetName);
        }
    }
}
