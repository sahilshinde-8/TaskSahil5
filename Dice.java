package com.aurionpro.test;
import java.util.Scanner;
import java.util.Random;

     
public class Dice {
	public static int dice = 0;
	public static int finalscore = 0;
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		//int random = rand.nextInt(6); 
		int one = 0;
		int turn = 1;
		//System.out.println(random);
		while(finalscore < 20){
			System.out.println("This is Your " + turn + " turn");
		System.out.println("Do you want to roll or hold ");
		String decision = sc.next();
		/*
		while(decision.equals("roll")){
		if(decision.equalsIgnoreCase("hold")){
			System.out.println(dice);
		}
		else if(random == 1) {
			System.out.println(one);
		}
		else {
			dice = dice + random;
			System.out.println(dice);
			System.out.println("Do you want to roll or hold ");
			String decisions = sc.next();
			if(decision.equalsIgnoreCase("hold")) {
				System.out.println(dice);
				break;
			}
		}
	}*/
		
		if(decision.equalsIgnoreCase("roll")) {
			
		randomDiceRoll(decision, dice);
		//System.out.println("This is Yout Final Score " + finalscore);
		}
		else if(decision.equalsIgnoreCase("hold")){
		randomDiceHold(decision,  dice);
		System.out.println(dice);
		//System.out.println("This is Yout Final Score " + finalscore);
		}
		else {
			System.out.println("Invalid Entry");
		}
		//randomDiceOne("roll",  dice);
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
						
			//System.out.println(random);
			System.out.println("Do you want to roll or hold ");
			String decisions = sc.next();
			if(decisions.equalsIgnoreCase("hold") || finalscore >= 20 || random == 0) {
				//System.out.println(dice);
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
