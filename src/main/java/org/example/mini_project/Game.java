package org.example.mini_project;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.FileStore;
import java.util.*;

public class Game {
   String wordToGuesss;
   String spaces;
    List<String> allList;
    int noOfGuess;
    Set<Character> invalidWords;
//    Game () {
//
//    }
    public void start() {
        wordToGuesss = getRandomWord();
        invalidWords = new HashSet<>();
        noOfGuess = 0;
        spaces = "";
        for (char c: wordToGuesss.toCharArray())
            if (c != ' ') spaces += '_';
        else spaces += ' ';
    }
    public void initialize() throws IOException {
        allList = new ArrayList<String>();
        Scanner scan = new Scanner(new File("/CSESs/src/main/java/org/example/mini_project/Requirements.txt"));
        while(scan.hasNextLine()){
            allList.add(scan.nextLine());
        }
        scan.close();
    }
    public String getRandomWord() {
        Random r= new Random();
        // Generate random integers in range 0 to 999
        int r1 = r.nextInt(allList.size());
        return allList.get(r1);
    }
    public boolean guess(char c) {
        if (c < 'a' || c > 'z') {
            System.out.println("Invalid word: " + c);
            return false;
        }
        if (wordToGuesss.indexOf(c)>-1 && spaces.indexOf(c) == -1) {
            update(c);
        } else {
            if  (!invalidWords.contains(c)) {
                invalidWords.add(c);
                noOfGuess++;
                System.out.println("wrong words till now:" + invalidWords.toArray().toString());

            }
        }
        return true;


    }
    public boolean isValid() {
        if (spaces.indexOf('_') == -1) {
            return true;
        }
        return false;
    }
    public void update(char c){
        for (int i = 0; i< spaces.length(); ++i) {
            if (wordToGuesss.charAt(i) == c) {
                spaces = spaces.substring(0, i) + c + spaces.substring(i+1, spaces.length());
            }
        }
    }
}
