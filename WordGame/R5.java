package com.sangamone;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class R5 {

	public static void main(String[] args) throws FileNotFoundException {
		List<String> list1=new ArrayList<>();
		String s1;
		String[] array1;
		File f1=new File("coma.txt");
		Scanner sc1=new Scanner(f1);
		while(sc1.hasNextLine()) {
			s1=sc1.nextLine();
			array1=sc1.nextLine().split(",");
			for(String word:array1) {
				list1.add(word);
			}
			}
		System.out.println(list1);
		
		
		
		

	}

}
