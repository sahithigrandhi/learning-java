package edu.learningJava.loops.exercises;
import java.awt.Toolkit;
import java.util.Scanner;


public class EvenOdd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int a=sc.nextInt();

		if(a>0){
			if(a%2==0)
				System.out.println("even number");
			else
				System.out.println("odd number");
		}
		else{
			System.out.println("ALERT!!!! A negative number");
			Toolkit.getDefaultToolkit().beep();
		}

		sc.close();
	}

}