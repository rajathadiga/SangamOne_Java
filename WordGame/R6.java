package com.sangamone;
import java.util.List;
import java.util.ArrayList;


public class R6 {
	public static List<String> perm4(String word4){
		List<String> result=new ArrayList<>();
		List<String> list4=new ArrayList<>();
		String part1="";
		String part2="";
		String s1,s2,s3,s4;
		s1=word4.substring(0,1);
		s2=word4.substring(1,2);
		s3=word4.substring(2,3);
		s4=word4.substring(3,4);
		part1=s1;
		part2=s2+s3+s4;
		result=perm3(part2);
		for(int i=0;i<6;i++) {
			list4.add(part1+result.get(i));
		}
		part1=s2;
		part2=s1+s3+s4;
		result=perm3(part2);
		for(int i=0;i<6;i++) {
			list4.add(part1+result.get(i));
		}
		part1=s3;
		part2=s1+s2+s4;
		result=perm3(part2);
		for(int i=0;i<6;i++) {
			list4.add(part1+result.get(i));
		}
		part1=s4;
		part2=s1+s2+s3;
		result=perm3(part2);
		for(int i=0;i<6;i++) {
			list4.add(part1+result.get(i));
		}
		return list4;
	}
	public static List<String> perm3(String word3) {
		List<String> list1=new ArrayList<>();
		String s1=word3.substring(0,1);
		String s2=word3.substring(1,2);
		String s3=word3.substring(2,3);
		list1.add(s1+s2+s3);
		list1.add(s1+s3+s2);
		list1.add(s2+s1+s3);
		list1.add(s2+s3+s1);
		list1.add(s3+s1+s2);
		list1.add(s3+s2+s1);
		return list1;
	}

	public static void main(String[] args) {
		String word3="EAT";
		System.out.println(perm3(word3));
		String word4="FAST";
		System.out.println(perm4(word4));
		
		
		
		

	}
	

}
