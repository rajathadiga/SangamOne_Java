package com.sangamone;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;

public class Tables6 {

	public static void main(String[] args) throws Exception{
		String[] arr1=null;
		File f1=new File("in.txt");
		Scanner sc1=new Scanner(f1);
		while(sc1.hasNextLine()) {
			arr1=sc1.nextLine().split(",");
		}
		System.out.println(arr1[0]);
		int start=Integer.parseInt(arr1[0]);
		int end=Integer.parseInt(arr1[1]);
		FileWriter fw1=new FileWriter("out.txt");
		
		for(int j=start;j<=end;j++) {
			System.out.println();
			for(int i=1;i<11;i++) {
				System.out.println(j+"*"+i+"="+(j*i));
				fw1.write(j+"*"+i+"="+(j*i));
				fw1.write("\n");
			}
		}
		fw1.close();

	}

}
