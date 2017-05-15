package edu.learningJava.interfaces;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BankWithExceptionHandling {
	private int actNo;
	double balance;
	double withdraw,deposit;



	Scanner sc=new Scanner(System.in);
	
	public void verifyAct() throws InsufficientBalance, reqMinDeposit{
		System.out.println("enter password");
		String password=sc.nextLine();
		if(password.equals("password"))
			openingAct();
		else
			System.out.println("password incorrect!!try again");	
	}
	
	public void openingAct() throws InsufficientBalance, reqMinDeposit{
		System.out.println("account number:"+actNo);
		System.out.println("available balance:"+balance);
		System.out.println("select one option");
		System.out.println("1.withdraw");
		System.out.println("2.deposit");
		System.out.println("3.print account details");
		
		int select=sc.nextInt();
		switch(select){
		case 1:
			withdraw();
			break;
		case 2:
			deposit();
			break;
		case 3:
			printActDetails();
			break;
		default:
			System.out.println("not valid selection!!try later");
			System.out.println("thankyou!!visit again");


		}
	}

	public void withdraw() throws InsufficientBalance{
		System.out.println("enter amount to withdraw");
		try{
		withdraw=sc.nextDouble();
		}catch(InputMismatchException e){
			System.out.println("Enter valid number");
		}
		if(withdraw>=balance){
		balance-=withdraw;
		printActDetails();
		System.out.println("account closed");
		}
		else
			throw new InsufficientBalance("no sufficient funds available in your account");
	}
	
	public void deposit() throws reqMinDeposit{
		System.out.println("enter amount to deposit");
		try{
		deposit=sc.nextDouble();
		}catch(InputMismatchException e){
			System.out.println("Enter valid number");
		}
		if(deposit>=500){
		balance+=deposit;
		printActDetails();
		System.out.println("account closed");
		}
		else
			throw new reqMinDeposit("minimum deposit ammount required for transaction");
	}
	
	
	public void printActDetails(){
		System.out.println("account number:"+actNo);
		System.out.println("available balance:"+balance);
		System.out.println("last withdraw:"+withdraw);	
		System.out.println("last deposit:"+deposit);	
	}
}



