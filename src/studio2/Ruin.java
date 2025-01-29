package studio2;

import java.util.Scanner;
import java.util.Random;

public class Ruin {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Random rand = new Random();
		System.out.println("How much will you gamble today?");
		int startAmount = in.nextInt();
		System.out.println("What is your chance of winning?");
		double winChance = in.nextDouble();
		System.out.println("What is your win limit?");
		int winLimit = in.nextInt();
		System.out.println("How many days will you play?");
		int totalSimulations = in.nextInt();
		int wins = 0;
		int losses = 0;
		int counter = 0;
		int sa = startAmount;
		
		for ( int i = 0; i < totalSimulations; i++) {
		
			while (sa > 0 && winLimit > sa) { 
			int random = rand.nextInt(101);
			if (random < (winChance)) { 
			sa++;
			counter++;}
			else {
				sa--;
			counter++;}
		}
		
	if (sa == 0) {
		System.out.println("Simulation " + i + ": " + counter + " LOSE");
		losses++;
	}
		else {
			System.out.println("Simulation " + i + ": " + counter + " WIN");
			wins++;
		}
		counter = counter - counter;
		sa = startAmount;}
		double ruinRate = losses / totalSimulations;
		System.out.println("Ruin rate: " + ruinRate);
	}

}

