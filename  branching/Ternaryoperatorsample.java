import java.util.Scanner;

public class Ternaryoperatorsample {

	public static void main(String[] args) {


		Scanner sc= new Scanner(System.in);
		System.out.println("enter the value for x");
		int x = sc.nextInt();
		System.out.println("enter the value for y");
		int y = sc.nextInt();

		String out=(x>y)? x+ "is bigger":y +"is bigger";
		System.out.println(out);
		sc.close(); 

	}

}
