package edu.learningJava.collections;

import java.util.ArrayList;
import java.util.List;

public class TestAddMethods {

	public static void main(String[] args) {
		List<String> l=new ArrayList();
		l.add("raju");
		l.add("ramu");
		l.add("ravi");
		l.add("kavi");
		l.add("kali");
		System.out.println(l);
		
		ListAddMethods check=new ListAddMethods();
		System.out.println(check.findByPattern("ra",l));
	check.addNewValue("kkk",l);
	check.updateValueWithNew("ramu", "changed", l);
	
		
	}

}
