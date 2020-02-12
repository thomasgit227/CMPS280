package chapter9.bingo;

import java.util.Scanner;

public class Caller {
    
    Scanner keys = new Scanner(System.in);
    
    //Prompts User upon Object Creation
    public Caller() {
        startingPrompt("A Game");
    }

    public Caller(String gameName) {
        startingPrompt(gameName);
    }

    //Ask User if they would like to Play
    public void startingPrompt(String game) {
        System.out.printf("Would You Like to Play %s? \n", game);
        System.out.println("please enter y/n...");
        String ans = keys.nextLine();
        if(ans.equals("y")) {
            beginGame();
        }
        else if(ans.equals("n")) {
            System.out.println("Thanks Anyways!");
        }
        else {
            System.out.println("Please Enter a Valid Input");
            startingPrompt(game);
        }
    }

    public void beginGame() {
        System.out.println("Lets Begin...");
        System.out.println("\n\n");
    }

    public void endGame() {
        keys.close();
        System.out.println("BINGO!");
        System.out.println("Congrats");
    }
    
    public int getUserNumber() {
        System.out.println("Please Enter a Number: ");
        int userNum = keys.nextInt();
        return userNum;
    } 
}