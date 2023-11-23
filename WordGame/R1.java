package com.sangamone;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class R1 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		List<String> names1=new ArrayList<>();
		String info;
		File f1=new File("words.txt");
		Scanner sc1=new Scanner(f1);
		while(sc1.hasNextLine()) {
			info=sc1.nextLine();
			names1.add(info);
			}
		int len2=names1.size();
		System.out.println(names1);
		Scanner sc2=new Scanner(System.in);
		System.out.println("Enter a word ");
		String input="";
		String lastletter="";
		String s2="";
		int len1;
		for(int j=0;j<3;j++) {
			input=sc2.next();
			len1=input.length();
			lastletter=input.substring(len1-1,len1);
			System.out.println(names1);
			for(int i=0;i<len2;i++) {
				if(names1.get(i).startsWith(lastletter)) {
					s2=(names1.get(i));
					break;
				}
			}
			System.out.print(input+"-"+s2);
		    	
		}
		
		
		
		

	}

}
