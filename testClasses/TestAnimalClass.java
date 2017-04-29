package edu.learningJava.testClasses;

import edu.learningJava.classes.Animal;
import edu.learningJava.classes.Cat;
import edu.learningJava.classes.Dog;
import edu.learningJava.classes.VetDoc;

public class TestAnimalClass {

	public static void main(String[] args) {
		VetDoc doctor=new VetDoc();
		Animal d=new Dog(5);
		//d.setAge(5);
		doctor.diagoniseAnimal(d);
		System.out.println("for dog");
		System.out.println("age is"+ d.getAge());
		
		Animal c=new Cat();
		c.setAge(5);
		doctor.diagoniseAnimal(c);
		System.out.println("for cat");
		System.out.println("age is"+ c.getAge());	

	}

}
