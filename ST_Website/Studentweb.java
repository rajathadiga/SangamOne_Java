package com.sangamone;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Studentweb {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		List<String> subjects=new ArrayList<>();
		List<String> names1;
		List<List<String>> all_names=new ArrayList<>(); 
		File f1=new File("StudentWebsite.txt");
		String temp;
		String temp2;
		String[] s1;
		String[] s2;
		Scanner sc1=new Scanner(f1);
		int len1;
		while(sc1.hasNextLine()) {
			names1=new ArrayList<>();
			s1=sc1.nextLine().split(":");
			subjects.add(s1[0]);
			s2=s1[1].split(",");
			len1=s2.length;
			for(int i=0;i<len1;i++) {
				names1.add(s2[i]);
			}
			all_names.add(names1);
			
		}
		temp=all_names.get(0).get(0);
		temp2=subjects.get(0)+"/"+temp;
		System.out.println(subjects);
		System.out.println(temp2);

	}

}
