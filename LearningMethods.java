package edu.learningJava.methods.exercises;
class MyShoppingBasket{
	int tomatoes;
	int potatoes;
	float garlic;
	float ginger;

	void stirFryRecipie(){
		System.out.println("write your recipie here");
	}
	void makingCurryRecipie(){
		System.out.println("recipie given here");
	}
	void showMyBasket(){
		System.out.println("contents in my basket are");
		System.out.println("tomates="+tomatoes);
		System.out.println("potatoes="+potatoes);
		System.out.println("ginger="+ginger);
		System.out.println("garlic="+garlic);
	}
}

public class LearningMethods {


	public static void main(String[] args) {
		MyShoppingBasket day1=new MyShoppingBasket();
		day1.tomatoes=2;
		day1.potatoes=1;
		day1.ginger=0.5f;
		day1.garlic=1.5f;

		day1.stirFryRecipie();
		System.out.println("---------------------------");

		MyShoppingBasket day2=new MyShoppingBasket();
		day2.tomatoes=2;
		day2.potatoes=1;
		day2.ginger=0.5f;
		day2.garlic=1.5f;

		day2.showMyBasket();
	}

}
