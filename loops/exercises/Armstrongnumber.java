package edu.learningJava.loops.exercises;

import java.util.Scanner;

public class Armstrongnumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int a=sc.nextInt();
		int r=0;int sum=0;
		int input=a;
		while(a>0){
			r=a%10;
					sum+= r*r*r;
					a=a/10;
			
		}
		if(input==sum)
			System.out.println("given number is armstrong number");
		else
			System.out.println("not an armstrong");
		sc.close();
	}

}
