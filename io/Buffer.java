package edu.learningJava.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Buffer {

	public static void main(String[] args) throws Exception {
		FileInputStream inStream = null;
		BufferedInputStream bis = null;
		FileOutputStream outStream = null; 
		BufferedOutputStream bos = null;

		try {

			inStream = new FileInputStream("//Users//sahithigrandhi//Documents//iocheck//hie.txt");

			bis = new BufferedInputStream(inStream);
			outStream = new FileOutputStream("//Users//sahithigrandhi//Documents//iocheck//test.txt");
			bos = new BufferedOutputStream(outStream);
			System.out.println("copying started");
			int numByte = bis.available();
			byte[] buf = new byte[numByte];
			bis.read(buf, 0, 3);
			for (byte b : buf) {
				bos.write(buf, 0, 3);
				bos.flush();
				System.out.print((char)b);
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println();
			System.out.println("copying ended"); 
			if(inStream!=null)
				inStream.close();
			if(bis!=null)
				bis.close();
			if(outStream!=null)
				outStream.close();
			if(bos!=null)
				bos.close();
		}	
	}

}
