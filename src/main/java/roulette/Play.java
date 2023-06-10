package roulette;

import roulette.playdefs.ColorBet;
import roulette.playdefs.EvenOddBet;
import roulette.playdefs.HighLowBet;
import roulette.utils.CommonUtils;

public class Play {
    public static ColorBet colorbet = new ColorBet();
    public static EvenOddBet evenOddBet = new EvenOddBet();
    public static HighLowBet highLowBet = new HighLowBet();
    public static Spin spin = new Spin();
    private static int earnings = 0;
    private static int winningNumber;


    public static void play(){
        CommonUtils.printBalance();
        winningNumber = spin.roll();
        //Place Bets Here
        earnings += colorbet.black(10, winningNumber);
        earnings += evenOddBet.even(10, winningNumber);
        earnings += highLowBet.high(10, winningNumber);
        //End Bets
        Bank.setBalance();
        CommonUtils.printTotalBet();
    }
}
