package com.jspiders.FileHandling.file1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Byte {
 public static void main(String[] args) {
	File file=new File("C:Tree.txt");
	if(file.exists()) {
		System.out.println("File already Exists");
	}
	else {
		file.setReadable(true);
		file.setWritable(true);
		file.setExecutable(true);
		try {
			file.createNewFile();
			System.out.println("File is Succesfully Created");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	try {
		FileOutputStream fileout=new FileOutputStream(file);
		try {
			fileout.write(18);
			System.out.println("Conten added");
			fileout.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	try {
		FileInputStream fileIn=new FileInputStream(file);
		try {
			System.out.println(fileIn.read());
			System.out.println("Content read from file");
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
