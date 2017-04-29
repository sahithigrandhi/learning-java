package edu.learningJava.classes;

public class Animal {
	protected int age;
	protected char gender;
	protected String color;

	public Animal() {
		super();
	}

	public Animal(int age) {
		super();
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public int calAge(){

		System.out.println(age);
		return age;
	}


}
