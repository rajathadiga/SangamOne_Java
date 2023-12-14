package com.sangamone;
import java.util.Scanner;

public class Tables4 {

	public static void main(String[] args) {
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter start value: ");
		int start=sc1.nextInt();
		System.out.println("Enter end value: ");
		int end=sc1.nextInt();
		
		for(int j=start;j<=end;j++) {
			System.out.println();
			for(int i=1;i<11;i++) {
				System.out.println(j+"*"+i+"="+(j*i));
			}
		}

	}

}
