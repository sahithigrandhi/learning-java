package edu.learningJava.interfaces;

public class MySqlDB implements DBConnect {
	public void connect() {
		System.out.println("connection made to mySQLDB");	
	}


	public void disconnect() {	
		System.out.println("dis-connection to mySQL DB");
	}
	public void execute() {
		System.out.println("executed mySQL DB");

	}

}
