package ss08_CleanCode.thuchanh;

import java.util.Scanner;

public class TennisGame {

    public static final String LOVE_ALL = "Love-All";
    public static final String FIFTEEN_ALL = "Fifteen-All";
    public static final String THIRTY_ALL = "Thirty-All";
    public static final String FORTY_ALL = "Forty-All";
    public static final String DEUCE = "Deuce";
    public static final String ADDITION = "-";

    public static String getScore(String player1Name, String player2Name, int scorePlayer1, int scorePlayer2) {
        String score = "";
        int tempScore = 0;
        if (scorePlayer1 == scorePlayer2) {

            score = getString(scorePlayer1);

        } else if (scorePlayer1 >= 4 || scorePlayer2 >= 4) {

            int minusResult = scorePlayer1 - scorePlayer2;

            if (minusResult == 1) {
                score = "Advantage player1";
            } else if (minusResult == -1) {
                score = "Advantage player2";
            } else if (minusResult >= 2) {
                score = "Win for player1";
            } else {
                score = "Win for player2";
            }
        } else {
            for (int i = 1; i < 3; i++) {
                if (i == 1) {
                    tempScore = scorePlayer1;
                } else {
                    score += ADDITION;
                    tempScore = scorePlayer2;
                }
                score=getString(tempScore);
            }
        }
        return score;


    }

    private static String getString(int scorePlayer1) {
        String score;
        switch (scorePlayer1) {
            case 0:
                score = LOVE_ALL;
                break;
            case 1:
                score = FIFTEEN_ALL;
                break;
            case 2:
                score = THIRTY_ALL;
                break;
            case 3:
                score = FORTY_ALL;
                break;
            default:
                score = DEUCE;
                break;

        }
        return score;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
    }
}

