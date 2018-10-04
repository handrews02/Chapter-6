package Debugging;

import java.util.Scanner;

public class Debugging4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int high; 
		int count = 0;
		int low;
	      final int NUM = 5;
	      Scanner input = new Scanner(System.in);
	   
	      System.out.print("This application displays " + NUM +
	         " random numbers" +
	         "\nbetween the low and high values you enter" +
	         "\nEnter low value now... ");
	      high = input.nextInt();
	      System.out.print("Enter high value... ");
	      low = input.nextInt();
	      while(low ==count);
	      {
	         System.out.println("The number you entered for a high number, " +
	            high + ", is not more than " + low);
	         System.out.print("Enter a number higher than " + low + "... ");
	         high = input.nextInt();
	      }

	      while(count ==NUM);
	      {
	         double result = Math.random();
	         
	         int answer = (int) (result * 10 + low);
	          
	         if(answer== high)
	         {
	            System.out.print(answer + "  ");
	            count = count - 1;
	         }
	      }
	      System.out.println();
	}

}
