package roulette;

import roulette.playdefs.*;
import roulette.utils.CommonUtils;

public class Play {
    public static ColorBet colorbet = new ColorBet();
    public static EvenOddBet evenOddBet = new EvenOddBet();
    public static HighLowBet highLowBet = new HighLowBet();
    public static ColumnBet columnBet = new ColumnBet();
    public static DozenBet dozenBet = new DozenBet();
    public static StraightBet straightBet = new StraightBet();
    public static StreetBet streetBet = new StreetBet();
    public static Spin spin = new Spin();
    private static int winningNumber;


    public static void play(){
        CommonUtils.printBalance();
        winningNumber = spin.roll();
        //Place Bets Here
        colorbet.black(20, winningNumber);
        evenOddBet.even(10, winningNumber);
        highLowBet.high(30, winningNumber);
        columnBet.c2(20, winningNumber);
        dozenBet.d1(10, winningNumber);
        straightBet.straightBet(5, 33, winningNumber);
        streetBet.streetBet(5, "1", winningNumber);
        //End Bets
        Bank.setBalance();
        CommonUtils.printTotalBet();
        System.exit(1);
    }
}
