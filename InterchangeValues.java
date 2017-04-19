import java.util.Scanner;

public class InterchangeValues {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter value of a");
		int a=s.nextInt();
		System.out.println("enter value of b");
		int b=s.nextInt();
	a=a+b;
	b=a-b;
	a=a-b;
		System.out.println("present value of a is"+a);
		System.out.println("present value of b is"+b);

	}

}
