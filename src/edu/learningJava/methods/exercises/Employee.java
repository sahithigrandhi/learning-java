package edu.learningJava.methods.exercises;

public class Employee {
	int id;
	double salary;
	String name;
	char gender;
//constructors
	public Employee(int lid,String lname, double lsalary,char lgender)
	{
		id=lid;salary=lsalary;name=lname;gender=lgender;
	}
	public Employee(int lid){
		id=lid;

	}
	public Employee(double lsalary){
		salary=lsalary;
	}
	//set methods
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
//get methods
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

//display employee details
	public void showEmployeeDetails(){
		System.out.println("emoployee id:"+id);
		System.out.println("employee name:"+name);
		System.out.println("employee salary:"+salary);
		System.out.println("employee gender:"+gender);
	}
//total salary calculation
	public double totalSalary(){
		double totalsalary=0.0;
		if((salary>=10000)&&(salary< 20000))
		{
			float pf=(float) (0.02*salary);
			float da=(float) (0.03*salary);
			float hra=(float) (0.05*salary);
			float insurance=(float) (0.1*salary);

			totalsalary=(salary-insurance-pf+da-hra);

		}
		else if((salary>=20000)&&(salary< 40000))
		{
			float pf=(float) (0.03*salary);
			float da=(float) (0.04*salary);
			float hra=(float) (0.06*salary);
			float insurance=(float) (0.2*salary);

			totalsalary=salary-insurance-pf+da-hra;

		}
		System.out.println("total salary is"+totalsalary);
		return totalsalary;
	}
}

