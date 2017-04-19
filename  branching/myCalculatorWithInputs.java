import java.util.Scanner;
public class myCalculatorWithInputs {

	public static void main(String[] args) {
	
		Scanner s=new Scanner(System.in);
		System.out.println("enter value of a");
		int a=s.nextInt();
		System.out.println("enter value of b");
		float b=s.nextFloat();
		System.out.println("  My Calculator  ");
		System.out.println("-----------------");
		System.out.println("1. a+b="+(a+b));
		System.out.println("2. a-b="+(a-b));
		System.out.println("3. a*b="+(a*b));
		System.out.println("4. a/b="+(a/b));
		System.out.println("5. a%b="+(a%b));
		System.out.println("6. squareroot(a)="+Math.sqrt(a));
		System.out.println("7. a^b="+Math.pow(a,b));
		
		

	}
}
