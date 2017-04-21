package edu.learningJava.classes;

public class Car {

	String color;
	int highestSpeed;
	String oilType;

	//constructors
	public Car(String color, int highestSpeed, String oilType) {
		super();
		this.color = color;
		this.highestSpeed = highestSpeed;
		this.oilType = oilType;
	}
	public Car() {
		super();
	}

	//getters and setters

	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getHighestSpeed() {
		return highestSpeed;
	}
	public void setHighestSpeed(int highestSpeed) {
		this.highestSpeed = highestSpeed;
	}
	public String getOilType() {
		return oilType;
	}
	public void setOilType(String oilType) {
		this.oilType = oilType;
	}

	//show details method
	public void showDetails(){
		System.out.println("color:"+color);
		System.out.println("petrol/Diesel:"+oilType);
		System.out.println("speed:"+highestSpeed);
	}

}
