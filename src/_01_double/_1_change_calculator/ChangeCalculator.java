package _01_double._1_change_calculator;

import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain.
 */

public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
String money=JOptionPane.showInputDialog("how many nickels do you have?");
		// Convert their answer to an int.   Hint: Integer.parseInt()
int number =Integer.parseInt(money);
		// Ask the user how many dimes they have, and convert their answer
String cent=JOptionPane.showInputDialog("how many dimes do you have?");
int dollar=Integer.parseInt(cent);
		// Ask the user how many quarters they have, and convert their answer
String bill=JOptionPane.showInputDialog("how many quatersdo you have?");
int num=Integer.parseInt(bill);
		// Calculate how much money the user has.  Hint: Use a double variable 
double amount = (number+dollar+num);
		// Tell the user how much money they have in dollars and cents format (e.g. $6.75)
System.out.println(amount);
	}
}

