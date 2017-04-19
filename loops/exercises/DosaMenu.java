package edu.learningJava.loops.exercises;

import java.util.Scanner;

public class DosaMenu {

	public static void main(String[] args) {
		System.out.println("can i have menu?");
		Scanner sc=new Scanner(System.in);
		String answer=sc.next();
		//String answer1="yes";
		//System.out.println(answer);
		if(answer.equals("yes")){
			System.out.println("*******menu*******");
			System.out.println("1.plain dosa");
			System.out.println("2.masala dosa");
			System.out.println("3.ravva dosa");
			System.out.println("4.onion dosa");
			System.out.println("5.upma dosa");
			System.out.println("select item");
			int item=sc.nextInt();
			switch(item){
			case 1:
				System.out.println("price=50$");
				System.out.println("wait time=20min");
				break;
			case 2:
				System.out.println("price=100$");
				System.out.println("wait time=20min");
				break;
			case 3:
				System.out.println("price=150$");
				System.out.println("wait time=20min");
				break;
			case 4:
				System.out.println("price=150$");
				System.out.println("wait time=20min");
				break;
			case 5:
				System.out.println("price=170$");
				System.out.println("wait time=20min");
				break;
				default:
					System.out.println("item unavailable");
			}
		}
		else
		System.out.println("sorry!!we are out of service");
		

sc.close();
	}

}
