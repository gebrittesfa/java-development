package com.pluralsight;
/*
class variable - private - playerName, playerScore, gameName, losses, wins, winOrLose
1. should have a constructor that uses all the attributes: losses, wins, playerScore - should
winOrLose - false
2. Should include a method that increments win every time the player wins
(winOrLose=true), and increments losses every time the player loses (winOrLoses=false)
3. Also, the method should increase the score when the player wins and decrease the score
when the player loses
 */
public class Score {
    //Attributes
    private String playerName;
    private int playerScore;
    private String gameName;
    private double losses;
    private double wins;
    private boolean winOrLose;

    public Score(String playerName, int playerScore, String gameName, double losses, double wins, boolean winOrLose) {
        this.playerName = playerName;
        this.playerScore = playerScore;
        this.gameName = gameName;
        this.losses = losses;
        this.wins = wins;
        this.winOrLose = winOrLose;
    }

    public String getPlayerName() {
        return playerName;
    }

    public int getPlayerScore() {
        return playerScore;
    }

    public String getGameName() {
        return gameName;
    }

    public double getLosses() {
        return losses;
    }

    public double getWins() {
        return wins;
    }

    public boolean isWinOrLose() {
        return winOrLose;
    }

    public Score(){
        this.playerName = "";
        this.playerScore = 0;
        this.gameName = "";
        this.wins = 0;
        this.winOrLose = false;
    }
    public void win(){
        wins++;
        winOrLose = true;
    }
    public void lose(){
        losses++;
        winOrLose = false;
    }
    public void updateScore(){
        if(winOrLose){
            playerScore++;
        } else {
            playerScore--;
        }
    }
    public void beatHighScore(){
        if (playerScore > 1000){
            System.out.println("You beat high score: ");
        }
    }
}
