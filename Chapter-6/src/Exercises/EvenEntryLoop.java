package Exercises;

import java.util.Scanner;

public class EvenEntryLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numChoice;
		Scanner input = new Scanner(System.in);
		
		do {
			
		System.out.println("Please enter a number >> ");
		numChoice = input.nextInt();
		
		if(numChoice % 2 == 0) {
			System.out.println("Good Job!!!!");}
		else {
			System.out.println("ERROR");}
		
		} while(numChoice != 999);
	
	}
	
}
