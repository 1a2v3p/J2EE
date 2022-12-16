package com.jspiders.FileHandling.file1;

import java.io.File;
import java.io.IOException;

public class MyFile2 {

     public static void main(String[] args) {
		File file=new File("Demo1.pdf");
		try {
			file.createNewFile();
			System.out.println("File is Successfully Created");
		} catch (IOException e) {
			e.printStackTrace();
		}
//		if(file.canExecute()) {
//			System.out.println("it is executable");
//		}
	}
}
