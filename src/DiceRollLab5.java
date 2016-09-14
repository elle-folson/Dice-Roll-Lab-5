import java.util.Scanner;

/*Simulates dice rolling
 * Asks the user to enter the number of sides for a pair of dice
 * Prompts the user to roll the dice
 * "rolls" two n-sided dice
 * displays the results of each
 * asks the user if he/she wants to roll the dice again
 */

public class DiceRollLab5 {

	public static void main(String[] args) {
		
		int sides;
		int die1;
		int die2;
		
		Scanner input = new Scanner(System.in);
		String choice = "y";

		// user input integer prompt
		System.out.print("Welcome to the Grand Circus Casino! ");
		System.out.print("Roll the dice?? (y/n): ");
		choice = input.next();
		System.out.println();

		while (choice.equalsIgnoreCase("y")) {

			System.out.print("Please enter the number of sides for a pair of dice: ");
			sides = input.nextInt();
			System.out.println();
			
			die1 = (int) (Math.random() * sides + 1);
			die2 = (int) (Math.random() * sides + 1);
			
			System.out.println("Roll 1: " + "\n" + die1 + "\n" + die2);
			System.out.println();
			
		
		// see if the user wants to continue
		System.out.print("Roll again?? (y/n): ");
		choice = input.next();
		System.out.println();
		}
		input.close();
	}
}
