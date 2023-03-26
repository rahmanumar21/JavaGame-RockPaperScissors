package com.game;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();

        while (true) {

            String computerPick = game.getComputerPick();
            String userPick = game.getUserPick();
            String result = game.getResult(userPick, computerPick);

            System.out.println("User Pick: " + userPick);
            System.out.println("Computer Pick: " + computerPick);
            System.out.println("You " + result);

            Scanner input = new Scanner(System.in);

            System.out.println("Do you want to play again? (y/n):");
            String playAgain = input.nextLine();

            if (!(playAgain.equals("y"))) {
                break;
            }
        }
    }
}
