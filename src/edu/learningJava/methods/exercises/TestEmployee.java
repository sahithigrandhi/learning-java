package edu.learningJava.methods.exercises;

public class TestEmployee {

	public static void main(String[] args) {
		Employee e1=new Employee(1,"first emp",12000.00,'f');
		e1.showEmployeeDetails();
		
		Employee e2=new Employee(2);
		e2.setGender('f');
		e2.showEmployeeDetails();
		
		Employee e3=new Employee(12000.00);
		e3.totalSalary();
		
	}

}
