package edu.learningJava.interfaces;

public class OracleDB implements DBConnect {


	public void connect() {
		System.out.println("connection made to OracleDB");	
	}


	public void disconnect() {	
		System.out.println("dis-connection to OracleDB");
	}
	public void execute() {
		System.out.println("executed OracleDB");

	}


}
