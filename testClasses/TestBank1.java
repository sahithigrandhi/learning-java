package edu.learningJava.testClasses;

import edu.learningJava.classes.Bank1;

public class TestBank1 {

	public static void main(String[] args) {
		Bank1 b1=new Bank1(123,"dev",13000.00,3000.00,2000.00);
		double x=b1.findNetBalance();
		System.out.println(x);
		b1.showDetails();

	}

}
