package roulette.playdefs;

import roulette.utils.BetUtils;

import java.util.ArrayList;
import java.util.Arrays;

public class StreetBet {

    private final static ArrayList<Integer> s1 = new ArrayList<>(Arrays.asList(1, 2, 3));
    private final static ArrayList<Integer> s2 = new ArrayList<>(Arrays.asList(4, 5, 6));
    private final static ArrayList<Integer> s3 = new ArrayList<>(Arrays.asList(7, 8, 9));
    private final static ArrayList<Integer> s4 = new ArrayList<>(Arrays.asList(10, 11, 12));
    private final static ArrayList<Integer> s5 = new ArrayList<>(Arrays.asList(13, 14, 15));
    private final static ArrayList<Integer> s6 = new ArrayList<>(Arrays.asList(16, 17, 18));
    private final static ArrayList<Integer> s7 = new ArrayList<>(Arrays.asList(19, 20, 21));
    private final static ArrayList<Integer> s8 = new ArrayList<>(Arrays.asList(22, 23, 24));
    private final static ArrayList<Integer> s9 = new ArrayList<>(Arrays.asList(25, 26, 27));
    private final static ArrayList<Integer> s10 = new ArrayList<>(Arrays.asList(28, 29, 30));
    private final static ArrayList<Integer> s11 = new ArrayList<>(Arrays.asList(31, 32, 33));
    private final static ArrayList<Integer> s12 = new ArrayList<>(Arrays.asList(34, 35, 36));
        private int multiplier = 12;
        BetUtils betUtils = new BetUtils();
        public int streetBet (int betAmount, String streetNum, int winningNumber) {
            return betUtils.numCheck(getStreetByName(streetNum),"Bet on Street " + streetNum, betAmount, winningNumber,multiplier);
        }

    private ArrayList<Integer> getStreetByName(String streetName) {
        switch (streetName) {
            case "1":
                return s1;
            case "2":
                return s2;
            case "3":
                return s3;
            case "4":
                return s4;
            case "5":
                return s5;
            case "6":
                return s6;
            case "7":
                return s7;
            case "8":
                return s8;
            case "9":
                return s9;
            case "10":
                return s10;
            case "11":
                return s11;
            case "12":
                return s12;
            default:
                throw new IllegalArgumentException("Invalid street name: " + streetName);
        }
    }
}
