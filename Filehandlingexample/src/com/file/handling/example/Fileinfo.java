package com.file.handling.example;
import java.io.File;
public class Fileinfo {
	public static void main(String[] args) {
		File f1 = new File("/home/shaikhjunaidghg/java-phase1/Sample.txt");
		if(f1.exists()) {
		System.out.println(f1.getName());
		System.out.println(f1.getAbsolutePath());
		System.out.println(f1.canRead());
		System.out.println(f1.canWrite());
		System.out.println(f1.length());
		}
		else {
			System.out.println("File does not exist!!!");
		}
	}
	
}
