package edu.learningJava.loops.exercises;

public class PalindromesInArray {

	public static void main(String[] args) {
		
		for(int input=1;input<=30;input++){
			int r=0;int k=0;
			int a=input;
			while(a>0){
				r=a%10;
				k=k+r;
				k=k*10;
				a=a/10;

			}
			if(input==(k/10))
				System.out.print(input+",");
	}
		System.out.print("are palindromes");
	}
}
