package com.sangamone;

public class diamondleft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="FUNWITHPROGRAMMING";
		for(int i=0;i<=s.length();i++) {
			String s1=s.substring(0,i);
			System.out.println(s1);
		}
		for(int j=s.length()-1;j>=0;j--) {
			String s1=s.substring(0,j);
			System.out.println(s1);
		}
		
		
		

	}

}
