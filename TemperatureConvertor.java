import java.util.Scanner;

public class TemperatureConvertor {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter temperature in celsius");
		double c;
		double f;
		c=s.nextDouble();
		System.out.println("Temparature in fahrenheit is :" +(c*1.8+32.0));
		System.out.println("enter temperature in fahrenheit");
		f=s.nextDouble();
		System.out.println("Temparature in celsius is :" + ((f -32)/1.8));		
        s.close();
	
		
		
		

	}

}
