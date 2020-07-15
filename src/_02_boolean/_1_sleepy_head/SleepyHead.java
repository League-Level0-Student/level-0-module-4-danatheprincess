package _02_boolean._1_sleepy_head;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class SleepyHead {

	public static void main(String[] args) {

		// boolean variables can only hold one of two values - true or false

		/************************  SLEEPY HEAD  **************************/
		boolean isWeekend;
		// Write code to ask the user what day it is.
		// Set the boolean isWeekend based on the value they enter
		String day=JOptionPane.showInputDialog("what day is it?");
		// If it is the weekend, tell the user they get to sleep in.
		if(day.equals("saturday")||day.equals("sunday")) {
			isWeekend=true;
		}else
			isWeekend=false;
		// If it is not the weekend, tell them to get out of bed and go to school!
		if(isWeekend==false) {
			JOptionPane.showMessageDialog(null,"get out of bed and go to school");
		}else
			if(isWeekend==true) {
				JOptionPane.showMessageDialog(null,"you get to sleep in");
			}
		
		/************************   STAR STUDENT  **************************/

		boolean passedExam;
		// Write code to ask the user what percentage they scored in their last exam
		String test=JOptionPane.showInputDialog("what percentage did you get on your last exam");
		int num=Integer.parseInt(test);
		// If they scored more than 70, they passed the exam.
		if(num>70) {
			passedExam=true;
	
		}else
			passedExam=false;
		
		// Set the boolean passedExam based on their score.
		
		// If the user passed the exam, congratulate them
		if (passedExam==true) {
			JOptionPane.showMessageDialog(null,"congratulation");
		}else
			if(passedExam==false) {
				JOptionPane.showMessageDialog(null,"better luck next time");
			}
		// otherwise, wish them better luck next time.
		
		
		/************************  GAME OVER  **************************/

		boolean gameIsOver = false;
		// This code will repeat until gameIsOver is changed to true
		while (!gameIsOver) {
			// Ask the user if the game is over. 
			String gameOver = JOptionPane.showInputDialog("is game over");
			if (gameOver.equalsIgnoreCase("yes"))
				gameIsOver = true;
			
			// If they answer "yes", change gameIsOver to true
			if(gameOver.equals("yes")) {
				gameIsOver=true;
			}
		}
		// Tell the user "game is over" 
		JOptionPane.showMessageDialog(null,"game is over");
		
		/***********************   RED SQUARE  ********************/
		
		boolean isRed;
		// Ask the user what color to draw with. Based on their answer, set the isRed variable
		String color=JOptionPane.showInputDialog("what color do you want to draw with ");
		 if (color.equals("red")) {
			 isRed=true;
		 }
		boolean isSquare;		
		// Now ask the user what shape to draw. Based on their answer, set the isSquare variable
		String shape=JOptionPane.showInputDialog("what shape do you want to draw ");
		if (shape.equals("square")) {
			isSquare=false;
		}
		// Now you MUST use the && operator to join the booleans for this code. 
		// Ask your teacher if you are not sure how
		// Use an if statement to ONLY draw a red square when it has been requested (use the method below)
		// otherwise, tell the user you don't know how to draw that shape
		
		

	}



	static void drawRedSquare() {
		Robot rob = new Robot();
		// Complete the rest of this method
		rob.penDown();;
		rob.setSpeed(10);
		rob.setPenColor(10, 0, 0);
		rob.move(50);
		rob.turn(90);
		rob.move(50);
		rob.turn(90);
		rob.move(50);
		rob.turn(90);
		rob.move(50);
	}	
}
