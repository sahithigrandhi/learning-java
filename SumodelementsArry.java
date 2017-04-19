package edu.learningJava.loops.exercises;

import java.util.Scanner;

public class SumodelementsArry {

	public static void main(String[] args) {
		int a[] = new int[5];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<5;i++) {
			System.out.println("Enter the "+(i+1)+" value");
			a[i] = sc.nextInt();
		}
		int sum = a[0];
		for(int i=1;i<5;i++){
			sum= sum+a[i] ;  			
		}
		System.out.println("Sum of all elements is "+sum);
   sc.close();

	}

}
