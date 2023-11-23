package com.sangamone;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Teachers {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		File f1=new File("names.html");
		FileWriter fw1=new FileWriter(f1);
		String s1="<!DOCTYPE html>\n"+
		"<html>\n"+
		"<head>\n"+
		"</head>\n"+
		"<body>\n"+
		"<h1> My name is ";
		
		String s2="</h1>\n"+
		"<h2> I teach ";
		
		String s3="</h2>\n"+
		"</body>\n"+
		"</html>";
		
		String s4=s1+"Rajath"+s2+"AI"+s3;
		fw1.write(s4);
		fw1.close();

	}

}
