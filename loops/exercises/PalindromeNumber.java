package edu.learningJava.loops.exercises;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int a=sc.nextInt();
		int r=0;int k=0;
		int input=a;
		while(a>0){
			r=a%10;
			k=k+r;
			k=k*10;
			a=a/10;

		}
		if(input==(k/10))
			System.out.println("given number is palindrome number");
		else
			System.out.println("not a palindrome");
		sc.close();

	}

}
