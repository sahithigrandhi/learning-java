package edu.learningJava.classes;

public class Cat extends Animal{
	public Cat() {
		super();
	}

    @Override
	public int calAge() {
		age=age*10;
		return age;
	}

}
