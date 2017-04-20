package edu.learningJava.classes;

public class Netflix1 {
String loginid;
int noOfMovies;
int noOfDays;
double totalCost;
public Netflix1(String loginid, int noOfMovies, int noOfDays) {
	super();
	this.loginid = loginid;
	this.noOfMovies = noOfMovies;
	this.noOfDays = noOfDays;
	
}

public Netflix1(String loginid) {
	super();
	this.loginid = "insufficient Data";
}

public String getLoginid() {
	return loginid;
}
public void setLoginid(String loginid) {
	this.loginid = loginid;
}
public int getNoOfMovies() {
	return noOfMovies;
}
public void setNoOfMovies(int noOfMovies) {
	this.noOfMovies = noOfMovies;
}
public int getNoOfDays() {
	return noOfDays;
}
public void setNoOfDays(int noOfDays) {
	this.noOfDays = noOfDays;
}
public double getTotalCost() {
	return totalCost;
}
public void setTotalCost(double totalCost) {
	this.totalCost = totalCost;
}
public double findCost(){
	double perDay=10;
	totalCost=noOfMovies*noOfDays*perDay;
	System.out.println(loginid+" to make a purchase");
	System.out.println("total cost of this purchase:"+totalCost);
	return totalCost;
}
}
