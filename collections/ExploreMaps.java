package edu.learningJava.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class ExploreMaps {

	public static void main(String[] args) {
		//hash map
		Map hm=new HashMap();
		hm.put(10000.9876, 10);
		hm.put(2, 20);
		hm.put(3, 30);
		hm.put("hie", 40);
		hm.put(5.0, 50);
		System.out.println(hm);

		Set s=hm.entrySet();
		System.out.println(s);
		Set s1=hm.keySet();
		System.out.println(s1);
		//hm.forEach(value->System.out.println(value));
		//hm.
		System.out.println("..............");
		//linked hash map
		Map lhm=new LinkedHashMap();
		lhm.put(10000.9876, 10);
		lhm.put(2, 20);
		lhm.put(3, 30);
		lhm.put("hie", 40);
		lhm.put(5.0, 50);
		System.out.println(lhm);
		Map lhm1=new HashMap();
	lhm1.put("hie", 400);
		lhm1.put("kai", 50);
		lhm.putAll(lhm1);
		System.out.println(lhm);
		System.out.println("..............");
		//tree map
		Map tm=new TreeMap();//same type of key values should be used
		tm.put("hie", 10);
		tm.put("bye", 20);
		tm.put("kai", 30);

		Map tm1=new TreeMap();
		tm1.put("hie", 40);
		tm1.put("kai", 50);
		tm.putAll(tm1);//puts all new values in old set(keys shld be same type in two maps) and 
		                 //replaces old ones if they have any common keys
		System.out.println(tm);


	}

}
