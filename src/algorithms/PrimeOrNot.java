package algorithms;

import javax.swing.JOptionPane;

public class PrimeOrNot {

	public static void main(String[] args) {
		
		String input = JOptionPane.showInputDialog("Input a number, and I'll tell you if it's prime or not.");
		int number = Integer.parseInt(input);
		boolean prime = true;
		
		for (int i = 2; i < number; i++) {
			if (number%i==0) {
			prime = false;
			break;
			} 
		}
		if(prime)
		   JOptionPane.showMessageDialog(null, "This number is prime.");
		else
			JOptionPane.showMessageDialog(null, "This number isn't prime.");
	}
	
}
