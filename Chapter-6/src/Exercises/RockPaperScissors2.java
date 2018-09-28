package Exercises;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    String userChoice; 
	    String computerChoice = null;  
	    int computerInt;
	    String response = null; 
	    int count = 0;

	    Scanner scan = new Scanner(System.in); 
	    Random generator = new Random(); 

	    while(count < 5) {
	    System.out.println("Hey, let's play Rock, Paper, Scissors!\n" + 
	                       "Please enter a move.\n" + "Rock = R, Paper" + 
	                       "= P, and Scissors = S.");


	   
	    computerInt = generator.nextInt(3)+1; 

	  

	    if (computerInt == 1) 
	       computerChoice = "R"; 
	    else if (computerInt == 2) 
	       computerChoice = "P"; 
	    else if (computerInt == 3) 
	       computerChoice = "S"; 


	 
	    System.out.println("Enter your play: "); 
	    userChoice = scan.next();


	    userChoice = userChoice.toUpperCase(); 

	 
	    System.out.println("Computer play is: " + computerChoice); 


	  
	    
	    if (userChoice.equals(computerChoice)) { 
	       response= ("It's a tie!"); }
	    else if (userChoice.equals("R")) {
	       if (computerChoice.equals("S")) 
	       response= ("Rock crushes scissors. You win!!");
	    		count = +1;}
	    else if (computerChoice.equals("P")) { 
	       response= ("Paper beats rock. You lose!!"); }
	    else if (userChoice.equals("P")) {
	       if (computerChoice.equals("S")) 
	       response= ("Scissor cuts paper. You lose!!"); }
	    else if (computerChoice.equals("R")) {
	       response= ("Paper eats rock. You win!!"); 
	    		count = +1; }
	    else if (userChoice.equals("S")) {
	         if (computerChoice.equals("P")) 
	       response= ("Scissor cuts paper. You win!!"); 
	         count= +1; }
	    else if (computerChoice.equals("R")) {
	       response= ("Rock breaks scissors. You lose!!"); }
	    else 
	       response= ("Invalid user input."); 
	 System.out.println("\n Did you win?\n: " + response + "\nNumber of winse " + count );
	    }	
	}
}

