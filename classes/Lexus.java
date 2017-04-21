package edu.learningJava.classes;

public class Lexus extends Car{
	boolean isElectric;
	int seats;
	//constructor
	public Lexus(String color, int highestSpeed, String oilType, boolean isElectric, int seats) {
		super(color, highestSpeed, oilType);
		this.isElectric = isElectric;
		this.seats = seats;
	}
	public boolean isElectric() {
		return isElectric;
	}
	public void setElectric(boolean isElectric) {
		this.isElectric = isElectric;
	}
	public int getSeats() {
		return seats;
	}
	public void setSeats(int seats) {
		this.seats = seats;
	}
	public void showDetails(){
		System.out.println("color:"+ getColor());
		System.out.println("tyres:"+ getHighestSpeed());
		System.out.println("doors:"+getOilType());
		System.out.println("color:"+isElectric());
		System.out.println("seats:"+seats);
	}



}
