package rockpaperscissors;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        boolean end = false;
        int draw = 0;
        int playerfin = 0;
        int compfin = 0;
        System.out.println("How many games do you want to play?");
        int games = input.nextInt();

        for (int i = 0; i < games; i++) {

            System.out.println("What is you choice?");
            System.out.println("1: Rock");
            System.out.println("2: Paper");
            System.out.println("3: Scissors");

            int pick = input.nextInt();
            int comppick = rand.nextInt(3) + 1;

            if (pick == 1) {
                if (comppick == 1) {
                    System.out.println("Rock Vs Rock");
                    System.out.println("Draw!!");
                    draw++;

                } else if (comppick == 2) {
                    System.out.println("Rock vs Paper");
                    System.out.println("You lose!!");
                    compfin++;
                } else if (comppick == 3) {
                    System.out.println("Rock vs Scissors");
                    System.out.println("You win!!");
                    playerfin++;
                }
            }
            if (pick == 2) {
                if (comppick == 2) {
                    System.out.println("Paper Vs Paper");
                    System.out.println("Draw!!");
                    draw++;

                } else if (comppick == 3) {
                    System.out.println("Paper Vs Scissors");
                    System.out.println("You lose!!");
                    compfin++;
                } else if (comppick == 1) {
                    System.out.println("Paper Vs Rock");
                    System.out.println("You win!!");
                    playerfin++;
                }
            }
            if (pick == 3) {
                if (comppick == 3) {
                    System.out.println("Scissors Vs Scissors");
                    System.out.println("Draw!!");
                    draw++;

                } else if (comppick == 1) {
                    System.out.println("Scissors Vs Rock");
                    System.out.println("You lose!!");
                    compfin++;
                } else if (comppick == 2) {
                    System.out.println("Scissors Vs Paper");
                    System.out.println("You win!!");
                    playerfin++;
                }
            }
            if (draw == games/3) {
                playerfin = 0;
                compfin = 0;
                break;
            }
        }
        System.out.println("Final Scores are Computer: " + compfin + " vs Player: " + playerfin);
        System.out.println("Draws: " + draw);
        if (draw == games/3) {
            System.out.println(games/3 + " draws, GAME OVER No winner");

        } else if (compfin > playerfin) {
            System.out.println("Compute wins");
        } else if (playerfin > compfin) {
            System.out.println("Player wins");
        } else if (playerfin == compfin) {
            System.out.println("DRAW!!");
        }
    }

}
