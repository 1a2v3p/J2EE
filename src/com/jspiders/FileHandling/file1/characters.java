package com.jspiders.FileHandling.file1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class characters {
  public static void main(String[] args) {
	File file=new File("C:Tree.txt");
	
	try {
		FileWriter filew=new FileWriter(file);
		filew.write("b");
		System.out.println("Written in file");
		filew.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	try {
		FileReader filer=new FileReader(file);
		try {
			System.out.println(filer.read());
			filer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
}
}
