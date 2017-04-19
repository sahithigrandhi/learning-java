package edu.learningJava.methods.exercises;

public class Student {
	private int id;
	private String fn;
	private String ln;
	private int age;
	private char gender;
	private float marks[]=new float[5];
	
	void setValues(int lid,int lage, String lfn,String lln,char lgender ){
		lid=id;lage=age;lfn=fn;lln=ln;lgender=gender;
	}
void showStudentDetails(){
	System.out.println("name(id):"+fn+ln+"("+id+")");
	System.out.println("gender:"+gender);
	System.out.println("age:"+age);
}
	boolean isAdult(){
		if(age>=18){
			System.out.println("student is major");
			return true;
			}
		else{
		System.out.println("student is minor");
			return false;
			}
		
	}

}
