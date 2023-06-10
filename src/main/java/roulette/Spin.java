package roulette;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Spin {

    private final ArrayList<Integer> americanRouletteNumbers = new ArrayList<>(Arrays.asList(
            0, 28, 9, 26, 30, 11, 7, 20, 32, 17,
            5, 22, 34, 15, 3, 24, 36, 13, 1, -1,
            27, 10, 25, 29, 12, 8, 19, 31, 18, 6,
            21, 33, 16, 4, 23, 35, 14, 2));

    public int roll() {
        SecureRandom secureRandom = new SecureRandom();
        int randomIndex = secureRandom.nextInt(americanRouletteNumbers.size());
        int randomNumber = americanRouletteNumbers.get(randomIndex);
        System.out.println("The winning number was: " + randomNumber);
        return randomNumber;
    }
}
