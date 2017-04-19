package edu.learningJava.loops.exercises;

import java.util.Scanner;

public class AscendingOrderArray {

	public static void main(String[] args) {
		int temp;
        Scanner sc = new Scanner(System.in);

        int a[] = new int[5];
        System.out.println("Enter all the elements:");
        for (int i = 0; i < 5; i++) 
        {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < 5; i++) 
        {
            for (int j = i + 1; j < 5; j++) 
            {
                if (a[i] > a[j]) 
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("Ascending Order:");
        for (int i = 0; i < 5; i++) 
        {
            System.out.println(a[i]);
        }
        System.out.println("Smallest element in the array :"+a[0]);
        System.out.println("Largest element in the array :"+a[4]);
        System.out.println("Second highest element in the array :"+a[3]);
        sc.close();

	}

}
