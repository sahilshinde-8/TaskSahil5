package com.aurionpro.test;
import java.util.Scanner;

public class TicTacTest {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		int columns = sc.nextInt();
	
		if(rows==columns) {
		
		String a[][] = new String [rows][columns];
		for(int i=0; i < rows; i++) {
			System.out.println("Player 1");
			int l = sc.nextInt();
			int p = sc.nextInt();
			a[l][p] = "X";
			System.out.println("Player 2");
			int x = sc.nextInt();
			int y = sc.nextInt();
			a[x][y] = "O";
	
	
            String line = null;
 
            switch (i) {
            case 0:
                line = a[0][0] + a[0][1]+ a[0][2];
                break;
            case 1:
                line =  a[1][0] + a[1][1]+ a[1][2];
                break;
            case 2:
                line =  a[2][0] + a[2][1]+ a[2][2];
                break;
            case 3:
                line =  a[0][0] + a[1][0]+ a[2][0];
                break;
            case 4:
                line =  a[0][0] + a[0][1]+ a[0][2];
                break;
            case 5:
                line =  a[0][0] + a[1][0]+ a[2][0];
                break;
            case 6:
                line = a[0][1] + a[1][1]+ a[2][1];
                break;
            case 7:
                line = a[0][2] + a[1][2]+ a[2][2];
                break;
                
            case 8:
                line = a[0][0] + a[1][1]+ a[2][2];
                break;
            case 9:
                line = a[0][2] + a[1][1]+ a[2][0];
                break;
            }
            //For X winner
            if (line.equals("XXX")) {
                //return "X";
		    System.out.println("Player 1 Win");
            }
             
            // For O winner
            else if (line.equals("OOO")) {
               // return "O";
		     System.out.println("Player 2 Win");
            }
        }
         
	
	}
	
	else {
		System.out.println("Kindly enter same rows and columns ");
	}
	}

}
