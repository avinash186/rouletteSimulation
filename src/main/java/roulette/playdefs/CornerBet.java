package roulette.playdefs;

import roulette.utils.BetUtils;

import java.util.ArrayList;
import java.util.Arrays;

public class CornerBet {

    private final static ArrayList<Integer> c1 = new ArrayList<>(Arrays.asList(1, 2, 4, 5));
    private final static ArrayList<Integer> c2 = new ArrayList<>(Arrays.asList(2, 3, 5, 6));
    private final static ArrayList<Integer> c3 = new ArrayList<>(Arrays.asList(4, 5, 7, 8));
    private final static ArrayList<Integer> c4 = new ArrayList<>(Arrays.asList(5, 6, 8, 9));
    private final static ArrayList<Integer> c5 = new ArrayList<>(Arrays.asList(7, 8, 10, 11));
    private final static ArrayList<Integer> c6 = new ArrayList<>(Arrays.asList(8, 9, 11, 12));
    private final static ArrayList<Integer> c7 = new ArrayList<>(Arrays.asList(10, 11, 13, 14));
    private final static ArrayList<Integer> c8 = new ArrayList<>(Arrays.asList(11, 12, 14, 15));
    private final static ArrayList<Integer> c9 = new ArrayList<>(Arrays.asList(13, 14, 16, 17));
    private final static ArrayList<Integer> c10 = new ArrayList<>(Arrays.asList(14, 15, 17, 18));
    private final static ArrayList<Integer> c11 = new ArrayList<>(Arrays.asList(16, 17, 19, 20));
    private final static ArrayList<Integer> c12 = new ArrayList<>(Arrays.asList(17, 18, 20, 21));
    private final static ArrayList<Integer> c13 = new ArrayList<>(Arrays.asList(19, 20, 22, 23));
    private final static ArrayList<Integer> c14 = new ArrayList<>(Arrays.asList(20, 21, 23, 24));
    private final static ArrayList<Integer> c15 = new ArrayList<>(Arrays.asList(22, 23, 25, 26));
    private final static ArrayList<Integer> c16 = new ArrayList<>(Arrays.asList(23, 24, 26, 27));
    private final static ArrayList<Integer> c17 = new ArrayList<>(Arrays.asList(25, 26, 28, 29));
    private final static ArrayList<Integer> c18 = new ArrayList<>(Arrays.asList(26, 27, 29, 30));
    private final static ArrayList<Integer> c19 = new ArrayList<>(Arrays.asList(28, 29, 31, 32));
    private final static ArrayList<Integer> c20 = new ArrayList<>(Arrays.asList(29, 30, 32, 33));
    private final static ArrayList<Integer> c21 = new ArrayList<>(Arrays.asList(31, 32, 34, 35));
    private final static ArrayList<Integer> c22 = new ArrayList<>(Arrays.asList(32, 33, 35, 36));

    private int multiplier = 8;
        BetUtils betUtils = new BetUtils();
        public int cornerBet (int betAmount, String cornerNum, int winningNumber) {
            return betUtils.numCheck(getCornerByName(cornerNum),"Corner Bet on " + cornerNum, betAmount, winningNumber,multiplier);
        }

    private ArrayList<Integer> getCornerByName(String cornerName) {
        switch (cornerName) {
            case "1":
                return c1;
            case "2":
                return c2;
            case "3":
                return c3;
            case "4":
                return c4;
            case "5":
                return c5;
            case "6":
                return c6;
            case "7":
                return c7;
            case "8":
                return c8;
            case "9":
                return c9;
            case "10":
                return c10;
            case "11":
                return c11;
            case "12":
                return c12;
            case "13":
                return c13;
            case "14":
                return c14;
            case "15":
                return c15;
            case "16":
                return c16;
            case "17":
                return c17;
            case "18":
                return c18;
            case "19":
                return c19;
            case "20":
                return c20;
            case "21":
                return c21;
            case "22":
                return c22;
            default:
                throw new IllegalArgumentException("Invalid corner name: " + cornerName);
        }
    }

}
