package com.game;

import java.util.Scanner;

public class Game implements GameSpecifications {

    @Override
    public String getComputerPick() {

        String computerPick;

        // computer get random number 1 to 3
        int randomNumber = (int) (Math.random() * 3) + 1;

        // computer pick "paper" or "rock" or "scissors"
        if (randomNumber == 1) {
            computerPick = "paper";
        }

        else if (randomNumber == 2) {
            computerPick = "rock";
        }

        else {
            computerPick = "scissors";
        }

        return computerPick;
    }

    @Override
    public String getUserPick() {
        Scanner input = new Scanner(System.in);
        String userPick;

        while (true) {

            System.out.println("Enter rock, paper or scissors:");
            userPick = input.nextLine();

            if (userPick.equals("paper") || userPick.equals("rock") || userPick.equals("scissors")) {
                break;
            }
        }

        return userPick;
    }

    @Override
    public String getResult(String userPick, String computerPick) {
        String result;

        // User and computer is equal
        if (userPick.equals(computerPick)) {
            result = "draw";
        }

        // User and computer not equal
        // User can win or lose
        else if (userPick.equals("paper") && computerPick.equals("rock")) {
            result = "win";
        }

        else if (userPick.equals("rock") && computerPick.equals("scissors")) {
            result = "win";
        }

        else if (userPick.equals("scissors") && computerPick.equals("paper")) {
            result = "win";
        }

        else {
            result = "lose";
        }

        return result;
    }
}
