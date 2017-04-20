package edu.learningJava.classes;

public class Bank1 {
	int actno;
	String name;
	double balance;
	double withdraw;
	double deposit;
	public Bank1(int actno, String name, double balance) {
		super();
		this.actno = actno;
		this.name = name;
		this.balance = balance;
	}
	public Bank1(int actno, String name, double balance, double withdraw, double deposit) {
		super();
		this.actno = actno;
		this.name = name;
		this.balance = balance;
		this.withdraw = withdraw;
		this.deposit = deposit;
	}
	public int getActno() {
		return actno;
	}
	public void setActno(int actno) {
		this.actno = actno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getWithdraw() {
		return withdraw;
	}
	public void setWithdraw(double withdraw) {
		this.withdraw = withdraw;
	}
	public double getDeposit() {
		return deposit;
	}
	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}
	
public void showDetails(){
	System.out.println("act no:"+actno);
	System.out.println("name:"+name);
	System.out.println("balance:"+balance);
}
public double findNetBalance(){
	balance=balance-withdraw+deposit;
	return balance;
}
}
