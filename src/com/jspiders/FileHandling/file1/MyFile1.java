package com.jspiders.FileHandling.file1;

import java.io.File;
import java.io.IOException;

public class MyFile1 {

	public static void main(String[] args) {
		
		File file=new File("Demo.txt");
		try {
			file.createNewFile();
			System.out.println("File is successfully Created");
		} catch (IOException e) {
		  e.printStackTrace();
		}
		file.delete();
		System.out.println("File is Deleted");
		
		if(file.exists()) {
			System.out.println("Exits");
		} else
			try {
				file.createNewFile();
				System.out.println("File successfully Created");
			} catch (IOException e) {
			
				e.printStackTrace();
			}
	}
}
