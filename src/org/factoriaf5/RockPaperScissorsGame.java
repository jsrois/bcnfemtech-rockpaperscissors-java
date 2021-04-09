package org.factoriaf5;

import java.util.Scanner;

import static org.factoriaf5.RockPaperScissorsGame.Move.*;

public class RockPaperScissorsGame {

    enum Move {
        ROCK, PAPER, SCISSORS;
    }

    private final Scanner scanner;

    public RockPaperScissorsGame() {
        this.scanner = new Scanner(System.in);
    }

    public void play() {
        try {
            System.out.println("Player 1, choose your move:");
            Move firstPlayerMove = getMoveFromInput();

            System.out.println("Player 2, choose your move:");
            Move secondPlayerMove = getMoveFromInput();

            String winner = calculateWinner(firstPlayerMove, secondPlayerMove);

            System.out.println("The winner is " + winner);
        }
        catch (IllegalArgumentException exception) {
            System.out.println("Invalid Move!");
        }

    }

    private String calculateWinner(Move firstPlayerMove, Move secondPlayerMove) {
        if (firstPlayerMove == ROCK && secondPlayerMove == SCISSORS) {
            return "Player 1";
        }

        if (firstPlayerMove == ROCK && secondPlayerMove == PAPER) {
            return "Player 2";
        }

        if (firstPlayerMove == SCISSORS && secondPlayerMove == PAPER) {
            return "Player 1";
        }

        if (firstPlayerMove == SCISSORS && secondPlayerMove == ROCK) {
            return "Player 2";
        }

        if (firstPlayerMove == PAPER && secondPlayerMove == ROCK) {
            return "Player 1";
        }

        return "no one";
    }

    private Move getMoveFromInput() {
        return Move.valueOf(scanner.nextLine().toUpperCase());
    }
}
