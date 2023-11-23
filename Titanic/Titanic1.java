package com.sangamone;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Titanic1 {
	public static void main(String[] args) throws FileNotFoundException {
		List<Integer> survived=new ArrayList<>();
		List<String> name=new ArrayList<>();
		List<String> sex=new ArrayList<>();
		List<Double> age=new ArrayList<>();
		//List<String> c_name=new ArrayList<>();
		List<String> s_children=new ArrayList<>();
		List<String> s_men=new ArrayList<>();
		List<String> s_women=new ArrayList<>();
		List<String> ns_children=new ArrayList<>();
		List<String> ns_men=new ArrayList<>();
		List<String> ns_women=new ArrayList<>();
		String s1;
		String[] a1;
		
		File f1=new File("titanic.csv");
		Scanner sc1=new Scanner(f1);
		s1=sc1.nextLine();
		//System.out.println(s1);
		while(sc1.hasNextLine()) {
			a1=sc1.nextLine().split(",");
			survived.add(Integer.parseInt(a1[1]));
			name.add(a1[4]);
			sex.add(a1[5]);
			if(a1[6].equals("")) {
				age.add(40.0);
			}
			else {
				age.add(Double.parseDouble(a1[6]));
			}
		}
		for(int i=0;i<name.size();i++) {
			if(age.get(i)<10.0 && survived.get(i)==1) {
				s_children.add(name.get(i));
			}
			if(age.get(i)<10.0 && survived.get(i)==0) {
				ns_children.add(name.get(i));
			}
			if(age.get(i)>10.0 && survived.get(i)==1 && sex.get(i).equals("male")) {
				s_men.add(name.get(i));
			}
			if(age.get(i)>10.0 && survived.get(i)==0 && sex.get(i).equals("male")) {
				ns_men.add(name.get(i));
			}
			if(age.get(i)>10.0 && survived.get(i)==1 && sex.get(i).equals("female")) {
				s_women.add(name.get(i));
			}
			if(age.get(i)>10.0 && survived.get(i)==0 && sex.get(i).equals("female")) {
				ns_women.add(name.get(i));
			}
		}
		int len1=s_children.size();
		System.out.println(len1);
		int len2=ns_children.size();
		System.out.println(len2);
		int len3=s_men.size();
		System.out.println(len3);
		int len4=ns_men.size();
		System.out.println(len4);
		int len5=s_women.size();
		System.out.println(len5);
		int len6=ns_women.size();
		System.out.println(len6);
		int s_total=len1+len3+len5;
		System.out.println("Total people Survivors in titanic "+s_total);
		int ns_total=len2+len4+len6;
		System.out.println("Total people Non-survivors in titanic "+ns_total);
	}
}


