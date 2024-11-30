package Testt;

import java.util.Random;
import java.util.Scanner;

public class GuessGame {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int computerchoice = random.nextInt(0, 100);
        boolean isMatch = true;
        while (isMatch) {
            System.out.println("Enter your choice");
            int userChoice = scanner.nextInt();

            if (computerchoice == userChoice) {
                System.out.println("You won !!");
                isMatch = false;
            } else if (computerchoice < userChoice) {
                System.out.println("You guessed a Large value , please retry .");

            } else if (computerchoice > userChoice) {
                System.out.println("You guessed a Smaller value , please retry .");
            }
        }
        scanner.close();
    }
}
