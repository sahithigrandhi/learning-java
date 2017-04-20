package edu.learningJava.classes;

public class Employee1 {
int id;
String name;
double salary;
public Employee1(int id, String name, double salary) {
	super();
	this.id = id;
	this.name = name;
	this.salary = salary;
}
public Employee1(double salary) {
	super();
	this.salary = salary;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}

public void showDetails(){
	System.out.println("emoployee id:"+id);
	System.out.println("employee name:"+name);
	System.out.println("employee salary:"+salary);
	
}
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
