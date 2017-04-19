package edu.learningJava.loops.exercises;

import java.util.Scanner;

public class TwoD {

	public static void main(String[] args) {
		int a[][]=new int[2][3];
		Scanner sc=new Scanner(System.in);
		int sum=0;
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				System.out.print("enter element in matrix");
				a[i][j]=sc.nextInt();
			}
			System.out.println();
		}
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				sum+=a[i][j];
			}
		}
		System.out.println("sum of elements is "+sum);
		sc.close();
		

	}

}
