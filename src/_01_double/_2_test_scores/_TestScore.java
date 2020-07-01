package _01_double._2_test_scores;

import javax.swing.JOptionPane;

public class _TestScore {
public static void main(String[] args) {
	
	String num=JOptionPane.showInputDialog("what is your test score");
	//int num1 = Integer.parseInt(num);
	//double numberAgain = (double) num1;
	double money= Double.parseDouble(num);
	//double numberAgain = (double) money;
	if(money >= 80 && money <= 100) {
		JOptionPane.showMessageDialog(null,"Good Job, you are really smart");
		
	} else if (money>=60&&money<=80){
		JOptionPane.showMessageDialog(null,"atleast you tried");
	}else {
		JOptionPane.showMessageDialog(null,"you fail try harder");
	}
	
	
	
	
	
	
	
}
}
