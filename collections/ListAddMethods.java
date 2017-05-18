package edu.learningJava.collections;

import java.util.ArrayList;
import java.util.List;

import javax.lang.model.element.Element;

public class ListAddMethods {
	

	List<String> l=new ArrayList();
	
	 public boolean updateValueWithNew ( String oldValue,String newValue,List<String> l) {
		if(l.contains(oldValue)){
			int index=l.indexOf(oldValue);
			System.out.println("before");
			System.out.println(l);
			l.set(index, newValue);
			System.out.println("after");
			System.out.println(l);
			return true;
		}
		else{
			System.out.println("no such element in list to replace");
			return false;
		}
	}

	public void addNewValue(String value,List<String> l){
		System.out.println("before adding");
		System.out.println(l);
		l.add(value);
		System.out.println("after adding");
		System.out.println(l);
	}

	public String findNameByValue(String value) {
		for(String e:l){
			if(e.equals(value)){
				System.out.println("has same value existing");
				return value;
			}
			else{
				System.out.println("no match found");
				return null;
			}
		}
		return null;
	}
	
	public List<String> findByPattern(String patterns,List<String> l){
		List<String> list=new ArrayList();
		for(String e:l){
			if(patterns.charAt(0)==(e.charAt(0)) && patterns.charAt(1)==(e.charAt(1)))
				list.add(e)	;
		}
		return list;
	}


	public boolean removetheValue(String value) {
		if(l.contains(value)){
			l.remove(value);
			return true;
		}
		else
			return false;
	}

}

