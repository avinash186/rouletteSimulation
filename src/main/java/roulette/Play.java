package roulette;

import roulette.playdefs.ColorBet;

public class Play {
    public static ColorBet colorbet = new ColorBet();
    public static Spin spin = new Spin();
    private static int earnings = 0;
    private static int winningNumber;


    public static void play(){
        winningNumber = spin.roll();
        earnings += colorbet.black(10, winningNumber);
    }
}
