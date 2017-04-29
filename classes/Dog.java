package edu.learningJava.classes;

public class Dog extends Animal {

	private String breed;
	
	public Dog() {
		super();
	}
	

    public Dog(int age) {
		super(age);
	}


	@Override
	public int calAge() {
		age=age*6;
		return age;
	}

}
