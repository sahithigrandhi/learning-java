package edu.learningJava.loops.exercises;

import java.util.Scanner;

public class SmallestelementArry {

	public static void main(String[] args) {
		int a[] = new int[5];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<5;i++) {
			System.out.println("Enter the "+(i+1)+" value");
			a[i] = sc.nextInt();
		}
		int min = a[0];
		for(int i=0;i<5;i++){
			if(min>a[i])
				min=a[i];   			
		}
		System.out.println("Smallest number is "+min);
   sc.close();

	}

}
