package org.example.mini_project;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Game newGame = new Game();
        Scanner sc = new Scanner(System.in);
        try {
            newGame.initialize();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        newGame.start();System.out.println(newGame.wordToGuesss);
        while (!newGame.isValid()) {
            System.out.print("Guess the word: "+newGame.spaces);
            newGame.guess(sc.nextLine().charAt(0));
            if (newGame.noOfGuess >9) {
                System.out.println("You failed ans was: " + newGame.wordToGuesss);
                break;
            }

//            System.out.println();


        }
        if (newGame.isValid()) System.out.println("You passed");
    }
}
