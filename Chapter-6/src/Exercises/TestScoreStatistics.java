package Exercises;

import java.util.Scanner;

public class TestScoreStatistics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int userEntry;
		int count = 0;
		int totalScore = 0;
		double average = 0;
		int highest = 0;
		int lowest = 100;
		Scanner input = new Scanner(System.in);
		
		
		
		do {
		System.out.println("Please enter your test scores for Math!");
		userEntry = input.nextInt();
		if(userEntry > highest && userEntry <= 100) {
			highest = userEntry;
			count ++;
			totalScore = totalScore + userEntry;
			}
		else if(userEntry < lowest && userEntry >= 0) {
			lowest = userEntry;
			count ++;
			totalScore = totalScore + userEntry;
			}
		else if(userEntry > 100 || userEntry < 0) {
			System.out.println("Out of range");}
		
		
		average = totalScore/count;
		
		
		}while(userEntry != 999);
		System.out.println("Out of your " + count + " tests, the average scores is " + average + " With the highest test is " + highest + " and your lowest is " + lowest);
	}
}
