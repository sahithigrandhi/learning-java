package edu.learningJava.testClasses;

import edu.learningJava.classes.Employee1;


public class TestEmployee1 {

	public static void main(String[] args) {
		

			
				Employee1 e1=new Employee1(1,"first emp",12000.00);
				e1.showDetails();
				
				Employee1 e2=new Employee1(2);
				e2.showDetails();
				
				Employee1 e3=new Employee1(12000.00);
				e3.totalSalary();
	}

}
