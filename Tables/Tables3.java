package com.sangamone;

public class Tables3 {

	public static void main(String[] args) {
		int start=3;
		int end=20;
		
		for(int j=start;j<=end;j++) {
			System.out.println();
			for(int i=1;i<11;i++) {
				System.out.println(j+"*"+i+"="+(j*i));
			}
		}

	}

}
