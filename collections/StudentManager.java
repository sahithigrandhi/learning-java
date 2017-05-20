package edu.learningJava.collections;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class StudentManager {
	private List<Student> students = new ArrayList();

	public StudentManager(List<Student> students) {
		super();
		this.students = students;
	}

	public StudentManager() {
		super();
	}


	public List<Student> findTop3Students() {
		Set<Double> tops3 = new TreeSet();
		List<Student> top3 = new ArrayList();
		for(Student s : students){
			tops3.add(s.getTotalMarks());
		}
		System.out.println(tops3);
		Double[] a=(Double[]) tops3.toArray();//class cast exception?????
		for(Student s : students){
			if(a[a.length-1]==s.getTotalMarks()){
				top3.set(0, s);
			}
			if(a[a.length-2]==s.getTotalMarks()){
				top3.set(1, s);
			}
			if(a[a.length-3]==s.getTotalMarks()){
				top3.set(2, s);
			}
		}
		System.out.println(top3);
		return top3;
	}

	public Student findTopStudent(){
		double topmark=0.0;
		for(Student s : students){
			double smarks=s.getTotalMarks();
			if(topmark<s.getTotalMarks()){
				topmark=s.getTotalMarks();	
			}
		}
		for(Student s : students){
			if(s.getTotalMarks()==topmark){
				System.out.println(s);
				return s;
			}
		}
		return null;
	}

	public List<Student> segrateFailedStudents(){
		List<Student> fail=new ArrayList();
		for(Student s : students){
			double smarks=s.getTotalMarks();
			if(smarks<=20.0)
				fail.add(s);
		}
		System.out.println(fail);
		return fail;
	}

	public boolean addStudent(Student s){
		students.add(s);
		System.out.println(students);
		return true;

	}

	public Student updateStudentAddr(int id, String address) {
		for(Student s : students){
			if(id==s.getId())
				s.setAddress(address);
		}
		System.out.println(students);
		return null;
	}


}
