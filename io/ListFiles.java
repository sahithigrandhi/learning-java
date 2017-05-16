package edu.learningJava.io;

import java.io.File;

public class ListFiles {
	
	public static void listFilesAndFolders(String directoryName){
		File directory = new File(directoryName);
		//get all the files from a directory
		File[] fList = directory.listFiles();
		for (File file : fList){
			System.out.println(file.getName());
		}
	}
	 public static void listFilesAndFilesSubDirectories(String directoryName){
	        File directory = new File(directoryName);
	        //get all the files from a directory
	        File[] fList = directory.listFiles();
	        for (File file : fList){
	            if (file.isFile()){
	                System.out.println(file.getAbsolutePath());
	            } else if (file.isDirectory()){
	                listFilesAndFilesSubDirectories(file.getAbsolutePath());
	            }
	        }
	    }
	 public static void listFolders(String directoryName){
	        File directory = new File(directoryName);
	        //get all the files from a directory
	        File[] fList = directory.listFiles();
	        for (File file : fList){
	            if (file.isDirectory()){
	                System.out.println(file.getName());
	            }
	        }
	    }
	 public static void listFiles(String directoryName){
	        File directory = new File(directoryName);
	        //get all the files from a directory
	        File[] fList = directory.listFiles();
	        for (File file : fList){
	            if (file.isFile()){
	                System.out.println(file.getName());
	            }
	        }
	    }
	public static void main(String[] args) {
		
		listFilesAndFolders("//Users//sahithigrandhi//Documents//iocheck");
		System.out.println(".......................");
		listFilesAndFilesSubDirectories("//Users//sahithigrandhi//Documents//iocheck");
		System.out.println(".......................");
		listFolders("//Users//sahithigrandhi//Documents//iocheck");
		System.out.println(".......................");
		listFiles("//Users//sahithigrandhi//Documents//iocheck");
	}

}


