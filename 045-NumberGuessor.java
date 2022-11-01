package Patika;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class NumberGuessor {
    public static void main(String[] args) {

         Scanner s = new Scanner(System.in);

        Random rand = new Random();
        int number = rand.nextInt(100);

        int right = 0;
        int guess;
        int[] wrongGuesses = new int[5];
        boolean isWin = false;
        boolean isWrong = false;

        while (right < 5) {
            System.out.print("Enter your forecast: ");
            guess = s.nextInt();

            if (guess < 0 || guess > 100) {
                System.out.println("\nPlease your forecast be between 0 to 100 ");

                if (isWrong) {
                    right++;
                    System.out.println("enter your wrong entry try again " + (5 - right));
                } else {
                    isWrong = true;
                }
                continue;
            }
            if (guess == number) {
                System.out.println("\n Congrultions!!!: " + number);
                isWin = true;
                break;
            } else {
                System.out.println("\nYour forecast is wrong we are sorry :)");

                if (guess > number) {
                    System.out.println(guess + " your forecast is higher than number.");
                } else {
                    System.out.println(guess + " your forecast is lower than number");
                }

                wrongGuesses[right] = guess;
                right++;
                System.out.println("your clan right: " + (5 - right));
            }
        }

        if (!isWin) {
            System.out.println("\nYour loser");
            System.out.println("Secret number: " + number);
            if (!isWrong) {
                System.out.println("your Forecast:" + Arrays.toString(wrongGuesses));
            }
        }
    }
}
