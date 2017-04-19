package edu.learningJava.loops.exercises;

import java.util.Scanner;

public class Abcd {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter input string");
		String input=s.next();
		char[] inputarray=input.toCharArray();
		int numa=0;
		int numb=0;
		int numc=0;
		int numd=0;
		int invalid=0;
		for(int index=0;index<inputarray.length;index++)
		{
			switch(inputarray[index]){
			case 'a':
				numa++;
				break;
			case 'b':
				numb++;
				break;
			case 'c':
				numc++;
				break;
			case 'd':
				numd++;
				break;
				default:
					invalid++;
			}
		}	
System.out.println("a"+numa+"b"+numb+"c"+numc+"d"+numd);
System.out.println(invalid+"invalid entries in input");
s.close();
	}

}
