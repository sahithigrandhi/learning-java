package edu.learningJava.loops.exercises;

import java.util.Scanner;

public class BiggestelementArry {

	public static void main(String[] args) {
		int a[] = new int[5];

		Scanner sc = new Scanner(System.in);
		for(int i=0;i<5;i++) {
			System.out.println("Enter the "+(i+1)+" value");
			a[i] = sc.nextInt();
		}
		int max = a[0];
		for(int i=0;i<5;i++){
			if(max<a[i])
				max=a[i];   			
		}
		System.out.println("Biggest number is "+max);
		sc.close();

	}
}
