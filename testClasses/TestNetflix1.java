package edu.learningJava.testClasses;

import edu.learningJava.classes.Netflix1;

public class TestNetflix1 {

	public static void main(String[] args) {
		Netflix1 n1=new Netflix1("abc",2,2);
		n1.findCost();
		
		Netflix1 n2=new Netflix1("xyz");
		n2.findCost();
	}

}
