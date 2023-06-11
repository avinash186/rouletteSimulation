package roulette.utils;

import roulette.Bank;

public class CommonUtils {

    public static void printBet(String play, int bet, int payout){
        String underlineTextStart = "\u001B[4m";
        String boldTextStart = "\u001B[1m";
        String resetText = "\u001B[0m";

        System.out.println("You bet $" + Bank.getThisBet(bet) + " on " + underlineTextStart + boldTextStart + play.toUpperCase()  + resetText
                + " and won $" + payout + "." +
                "\n--------------------------------");
    }

    public static void printBalance(){
        System.out.println("\nYour starting balance is $" + Bank.getBalance() + ".");
    }

    public static void printTotalBet(){
        System.out.println("Total Bet: $" + Bank.getBet());

        if (Bank.getEarnings() > 0) {
            System.out.println("You gained $" + Bank.getEarnings() + "!");
        } else if (Bank.getEarnings() < 0){
            System.out.println("You lost $" + Bank.getEarnings() + "!");
        } else if (Bank.getEarnings() == 0){
            System.out.println("You broke even!");
        }

        System.out.println("Your ending balance is $" + Bank.getBalance() + ".");
    }
}
