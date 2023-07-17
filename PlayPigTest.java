package com.aurionpro.test;

import com.aurionpro.model.PlayPig;
import java.util.Scanner;

public class PlayPigTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				// TODO Auto-generated method stub
				PlayPig player1 = new PlayPig();
				PlayPig player2 = new PlayPig();
				startGame(player1, 1);
			}

			private static void startGame(PlayPig player1, int turn) {
				Scanner userin = new Scanner(System.in);
				int score = 0;
				player1.setTurn(turn);
				boolean roll = true;
				System.out.println("Turn " + player1.getTurn());
				System.out.println("Game Begins!");
				while (player1.getTotalTurnScore() <= 20 && roll == true && player1.getTotalGameScore() < 21) {
					System.out.print("Roll or hold (r/h): ");
					String userinput = userin.next();
					player1.setRoll_score(getRandomNumber());
					if (userinput.equalsIgnoreCase("r") && player1.getRoll_score() != 1) {
						score += player1.getRoll_score();
						player1.setTotalTurnScore(score);
						System.out.println("Die: " + player1.getRoll_score());
						if (player1.getTotalTurnScore() >= 20) {
							turn++;
						}
					} else if (player1.getRoll_score() == 1 && userinput.equalsIgnoreCase("r")) {
						player1.setTotalTurnScore(0);
						roll = false;

//						player1.setTurn(turn);
					} else {
						//System.out.println("Total Score this turn: " + player1.getTotalTurnScore());
						roll = false;
					}

				}
				player1.setTotalGameScore(player1.getTotalTurnScore());
				if (player1.getTotalTurnScore() == 0) {
					System.out.println("Die: " + player1.getRoll_score());
				}
				if (player1.getTotalGameScore() < 20) {
					System.out.println("Total Score " + player1.getTotalTurnScore() + " in " + player1.getTurn() + " turns.");
				}
				if (player1.getTotalGameScore() >= 20) {
					System.out.println("Total Score " + player1.getTotalGameScore() + " in " + player1.getTurn() + " turns.");
					System.out.println("You won!!");
				}
				if (player1.getTotalGameScore() < 20) {
					player1.setTurn(turn);
					turn++;
					startGame(player1, turn);
				}

			}

			public static int getRandomNumber() {
				return (int) ((Math.random() * (7 - 1)) + 1);
			}

		

}


