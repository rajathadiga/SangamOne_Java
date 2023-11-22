package com.sangamone;

public class diamondright {
	public static void main(String[] args) {
		String str="FUNWITHPROGRAMMING";
		for(int j=0;j<=str.length();j++) {
			String s1=str.substring(0,j);
			System.out.printf("%"+str.length()+"s",s1);
		System.out.println();
		}
		for(int j=str.length()-1;j>0;j--) {
			String s1=str.substring(0,j);
			System.out.printf("%"+str.length()+"s",s1);
		System.out.println();
		}

		
	}

}
