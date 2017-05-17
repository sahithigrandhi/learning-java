package edu.learningJava.collections;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindName {		
			
	public static void main(String[] args) {
		List<String> l=new ArrayList();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter class strength");
		int count=sc.nextInt();
		for(int i=0;i<count;i++){
			System.out.println("enter student name"+(i+1));
			l.add(sc.next());
		}
		
		int index;
		System.out.println("enter name to check");
		String checkName=sc.next();
		if(l.contains(checkName)){
			index=l.indexOf(checkName);
		l.add(index+1,checkName );
		l.forEach(value->System.out.println(value));
		}
		else{
			l.add(checkName);
			l.forEach(value->System.out.println(value));
		}

	}
}

