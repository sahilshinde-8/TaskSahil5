package com.aurionpro.test;
import java.util.Scanner;
import java.util.Random;

     
public class Dice {
	public static int dice = 0;
	public static int finalscore = 0;
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int one = 0;
		int turn = 1;
		
		while(finalscore < 20){
			System.out.println("This is Your " + turn + " turn");
		System.out.println("Do you want to roll or hold ");
		String decision = sc.next();
		
		if(decision.equalsIgnoreCase("roll")) {
			
		randomDiceRoll(decision, dice);
		
		}
		else if(decision.equalsIgnoreCase("hold")){
		randomDiceHold(decision,  dice);
		System.out.println(dice);
		
		}
		else {
			System.out.println("Invalid Entry");
		}
		
		turn++;
	}
		System.out.println("This is Your Final Score " + finalscore);
	}
		
		private static void randomDiceRoll(String dices, int dice) {
			Random rand = new Random(); 
			int random = rand.nextInt(6);
			System.out.println(random);
			if(finalscore < 20 && random != 0) {
			
			Scanner sc = new Scanner(System.in);
			dice += random;
						
			
			System.out.println("Do you want to roll or hold ");
			String decisions = sc.next();
			if(decisions.equalsIgnoreCase("hold") || finalscore >= 20 || random == 0) {
				
				randomDiceHold("hold",dice);
			}
			else if(decisions.equalsIgnoreCase("roll") && finalscore < 20){
				
				randomDiceRoll("roll",  dice);
			}
			else {
				System.out.println("Invalid Entry");
			}
			
			}
			else {
				dice = dice * 0;
				System.out.println("Dice Score is " + dice);
				finalscore += dice;
				System.out.println("This is Yout Final Score " + finalscore);
			}
			
		}
		private static void randomDiceHold(String dices, int dice) {
			System.out.println("Dice Score is " + dice);
			finalscore += dice;
			System.out.println("This is Yout Final Score " + finalscore);
			
		}
		
}
