package edu.learningJava.interfaces;

public class TestInterfaces {

	public static void main(String[] args) {
		OracleDB o1=new OracleDB();
		DBConnect db1=new OracleDB();
		o1.connect();
		db1.disconnect();
		
	MySqlDB m1=new MySqlDB();
		DBConnect db2=new MySqlDB();
		m1.connect();
		db2.disconnect();
		
		

	}

}
