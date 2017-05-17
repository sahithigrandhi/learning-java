package edu.learningJava.collections;

import java.util.Vector;

public class ExploreVectors {

	public static void main(String[] args) {
		Vector v=new Vector();
		v.add(1);
		v.addElement("abc");
		v.add(10);
		v.capacity();//default 10?
System.out.println(v.capacity());
v.size();
System.out.println(v.size());
System.out.println(v.isEmpty());

System.out.println(v.get(0));
Vector v1=new Vector();
v1.add(1);
v1.addElement("abc");
v1.add(1);
v1.addElement("abc");
System.out.println(v);
v.addAll(v1);//like concatination two arrays
System.out.println(v);

System.out.println(v.indexOf(1));//display index of element first occurrence
v.removeAll(v1);
System.out.println(v);
//v.add(9, 10);//can't add an element if it has null values in between
v.add(1);
v.addElement("abc");
v.add(10);
v.add(1);
v.addElement("abc");
v.add(10);
v.add(1);
v.addElement("abc");
v.add(10);
v.add(1);
v.addElement("abc");
v.add(10);
System.out.println(v);
System.out.println(v.capacity());//default 10 and increments to another 10 once it exceeds limit
	}

}
