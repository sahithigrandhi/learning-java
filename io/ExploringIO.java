package edu.learningJava.io;

import java.io.FileInputStream;
import java.io.IOException;

public class ExploringIO {


	public static void main(String[] args) throws IOException {

		FileInputStream fis = null;
		fis = new FileInputStream("//Users//sahithigrandhi//Documents//iocheck//hie.txt");

		// using read
		int ch = fis.read();
		while(ch != -1){ // EOF
			System.out.print((char)ch);
			ch = fis.read();
		}
	
		System.out.println();
		System.out.println("------------------------");
		
		//read array
		char c;
		byte[] b=new byte[10];
		fis.read(b);
		for(byte x:b) {
			c = (char)x;
			System.out.print(c);
		}  
		
		System.out.println();
		System.out.println("------------------------");
		
		//read byte length
		fis.read(b,1,2);
		for(byte x:b) {
			c = (char)x;
			if(x==0)
				c= '*';
			System.out.print(c);
		} 
		
		if(fis!=null)
			fis.close();
	}
}


