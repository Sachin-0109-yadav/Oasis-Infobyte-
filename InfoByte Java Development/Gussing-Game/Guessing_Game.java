package com.company;

import java.util.Scanner;

public class Guessing_Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int secretNumber = (int) (Math.random() * 100) + 1;
        int attempts = 0;
        int guess = 0;
        boolean hasGuessedCorrectly = false;

        System.out.println("Welcome to the Guessing Game!");
        System.out.println("I have selected a number between 1 and 100. Can you guess it?");

        while (attempts < 10) { // Player has up to 10 attempts
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < secretNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > secretNumber) {
                System.out.println("Too high! Try again.");
            } else {
                hasGuessedCorrectly = true;
                break;
            }
        }

        if (hasGuessedCorrectly) {
            System.out.println("Congratulations! You've guessed the number " + secretNumber + " correctly in " + attempts + " attempts.");
        } else {
            System.out.println("Sorry, you've run out of attempts! The correct number was " + secretNumber + ".");
        }
        scanner.close();
    }
}
