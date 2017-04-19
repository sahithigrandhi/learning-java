package edu.learningJava.methods.exercises;

public class Employee {
	int id;
	double salary;
	String name;
	char gender;

	public Employee(int lid,String lname, double lsalary,char lgender)
	{
		id=lid;salary=lsalary;name=lname;gender=lgender;
	}
public Employee(int lid){
	id=lid;
	
}

	public void setId(int lid){
		id=lid;
	}
	public void setSalary(double lsalary){
		salary=lsalary;
	}
	public void setName(String lname){
		name=lname;
	}
	public void setGender(char lgender){
		gender=lgender;
	}

	public int getId(){
		return id;
	}
	public String getName(){
		return name;
	}
	public double getSalary(){
		return salary;
	}
	public char getGender(){
		return gender;
	}


	public void showEmployeeDetails(){
		System.out.println("emoployee id:"+id);
		System.out.println("employee name:"+name);
		System.out.println("employee salary:"+salary);
		System.out.println("employee gender:"+gender);
	}
}
