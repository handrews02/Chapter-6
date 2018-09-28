package Exercises;

import java.util.Scanner;

public class FahrenheitToCelsiusConversion2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner input = new Scanner(System.in);
		double ftempa;
		double ftempb;
		double ftempc; 
		int response = 0;
	do {
		System.out.println("What temperature in fahrenhite is it at 8 a.m.? ");
		ftempa= input.nextDouble();
		displayConversion (ftempa);
		System.out.println("What temperature in fahrenhite is it at 12 p.m.? ");
		ftempb= input.nextDouble();
		displayConversion (ftempb);
		System.out.println("What temperature in fahrenhite is it at 5 p.m.? ");
		ftempc= input.nextDouble();
		displayConversion (ftempc);
		System.out.println("would you like to do it again? 1 for yes ");
		System.out.println("for no please enter any other number ");
		response = input.nextInt();
		
	} 
	while(response == 1);}
	
	
public static void displayConversion (double ftemp) {
	double conversion;	
	conversion= (ftemp-32)/1.8; 
	System.out.println("The conversion from " + ftemp + " degrees fahrenhite to Celsius is " + conversion); 
	}

}
