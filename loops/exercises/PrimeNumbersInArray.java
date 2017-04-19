package edu.learningJava.loops.exercises;

import java.util.Scanner;

public class PrimeNumbersInArray {

	public static void main(String[] args) {
		int a[] = new int[6];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<6;i++) {
			System.out.println("Enter the "+(i+1)+" value");
			a[i] = sc.nextInt();
		}
		int primecount=0;int count=0;
		for(int index=0;index<=5;index++){
		for(int i=2;i<a[index];i++){
			if(a[index]%i==0)
			count++;
			
			
		}
if(count==0){
	primecount++;

System.out.print(a[index]+",");
}	count=0;
	}
System.out.print("are"+ primecount+"prime numbers in the array");
sc.close();
}
}