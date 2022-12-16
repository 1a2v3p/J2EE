package com.jspiders.FileHandling.file1;

import java.io.File;
import java.io.IOException;

public class MyFile {
public static void main(String[] args) {
	File file=new File("C:\\DemoFile.txt");
	try {
		file.createNewFile();
		System.out.println("File Succesfully Created");
	} catch (IOException e) {
		
		e.printStackTrace();
	}
	if(file.canRead()) {
		System.out.println("File is Readable");
	}
	else {
		System.out.println("Not Readable");
	}
	if(file.canWrite()) {
		System.out.println("File is Writeble");
	}
	else {
		System.out.println("Not Writable");
	}
	if(file.canExecute()) {
		System.out.println("File is Executable");
	}
	else {
		System.out.println("Not Executable");
	}
	
}
}
