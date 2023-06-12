package roulette;
import java.io.*;
import java.util.Scanner;

public class Main {

    static int iterations = 5;
    static int currentIteration = 0;
    static int betMultiplier = 1;
    static boolean loss = false;
    static boolean loop = true;
    public static void main(String[] args) {
        do {
            if (loss == false){
                betMultiplier = 1;
            }

            Play.play(betMultiplier);
            currentIteration++;

            if (loss == true){
                Scanner scanner = new Scanner(System.in);
                System.out.println("Would you like to double up? (y/n)");
                String input = scanner.nextLine();
                if (input.equals("y") && currentIteration < iterations){
                    betMultiplier = 2;
                } else if (input.equals("n")){
                    betMultiplier = 1;
                }
            }
        } while (currentIteration < iterations);
        System.out.println("You played " + iterations + " times.");
    }

    public static void setLoss(boolean result){
        loss = result;
    }
}
