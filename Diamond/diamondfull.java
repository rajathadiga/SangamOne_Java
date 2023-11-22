package com.sangamone;

public class diamondfull {
	public static void main(String[] args) {
		String str="FUNWITHPROGRAMMING";
		int len=str.length();
		for(int i=0;i<=len;i+=2) {
			String s1=str.substring(0,1);
			System.out.printf("%"+(len/2)+"s",s1);
			
		}
	}

}
