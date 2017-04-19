import java.util.Scanner;

public class SalaryNew {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter total salary");
		int sal=s.nextInt();
		if((sal>=10000)&&(sal< 20000))
		{
		float pf=(float) (0.02*sal);
		float da=(float) (0.03*sal);
		float hra=(float) (0.05*sal);
		float insurance=(float) (0.1*sal);
		
		System.out.println("net salary="+(sal-insurance-pf+da-hra));
		}
		else if((sal>=20000)&&(sal< 40000))
		{
		float pf=(float) (0.03*sal);
		float da=(float) (0.04*sal);
		float hra=(float) (0.06*sal);
		float insurance=(float) (0.2*sal);
		
		System.out.println("net salary="+(sal-insurance-pf+da-hra));
		}
		else{
			System.out.println("no data available for given input");
		}
s.close();
	}

}
