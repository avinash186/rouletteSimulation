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
    public static CornerBet cornerBet = new CornerBet();

    public static DoubleStreetBet doubleStreetBet = new DoubleStreetBet();
    public static Spin spin = new Spin();
    private static int multiplier = 2;
    private static int winningNumber;

    public static int betA = 10;

    public static int betB = 1;


    public static void play(int betMultiplier){
        CommonUtils.printBalance();
        winningNumber = spin.roll();

        // Initiate Bet Amounts
        betA = 5;
        betB = 0;

        int betAFinal = betA * betMultiplier;

        //Place Bets Here
        cornerBet.cornerBet(betAFinal,"1",winningNumber);
        cornerBet.cornerBet(betAFinal,"5",winningNumber);
        cornerBet.cornerBet(betAFinal,"9",winningNumber);
        cornerBet.cornerBet(betAFinal,"13",winningNumber);
        cornerBet.cornerBet(betAFinal,"17",winningNumber);
        cornerBet.cornerBet(betAFinal,"21",winningNumber);
        straightBet.straightBet(betAFinal,33,winningNumber);
        straightBet.straightBet(betAFinal,12,winningNumber);



        //End Bets
        Bank.setBalance();
        CommonUtils.printTotalBet();
        Bank.reset();
    }
}
