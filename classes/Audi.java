package edu.learningJava.classes;

public class Audi extends Car {

	boolean isOpenTop;
	int doors;

	public Audi(String color, int highestSpeed, String oilType, boolean isOpenTop, int doors) {
		super(color, highestSpeed, oilType);
		this.isOpenTop = isOpenTop;
		this.doors = doors;
	}
	//getter setter
	public boolean isOpenTop() {
		return isOpenTop;
	}
	public void setOpenTop(boolean isOpenTop) {
		this.isOpenTop = isOpenTop;
	}
	public int getDoors() {
		return doors;
	}
	public void setDoors(int doors) {
		this.doors = doors;
	}



	public void showDetails(){
		System.out.println("color:"+ getColor());
		System.out.println("tyres:"+ getHighestSpeed());
		System.out.println("doors:"+getOilType());
		System.out.println("color:"+isOpenTop());
	}

}
