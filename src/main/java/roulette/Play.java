package roulette;

import roulette.playdefs.ColorBet;

public class Play {
    public static ColorBet colorbet = new ColorBet();
    private static int earnings = 0;
    public static void play(){
        earnings += colorbet.red(10,1);
        System.out.println(earnings);
    }
}
