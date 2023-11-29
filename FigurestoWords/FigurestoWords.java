package com.sangamone;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FigurestoWords {
	public static ArrayList<String> loadfile(String fname)throws IOException {
		File f1=new File(fname);
		ArrayList<String> list1=new ArrayList<>();
		Scanner sc1=new Scanner(f1);
		while(sc1.hasNextLine()) {
			list1.add(sc1.nextLine());
		}
		return list1;
	}
	public static void convert100(int n1,ArrayList<String> a2)throws IOException {
		int num1=n1;
		ArrayList<String> lst1=new ArrayList<>();
		lst1=a2;
		int num2=0,part1=0,part2=0;
		if(num1<=20) {
			convert20(num1,lst1);
		}
		else {
			num2=(num1/10)-2;
			part1=num2*10;
			part2=num1%10;
			System.out.println(lst1.get(20+num2)+" "+lst1.get(part2));
		}
	}
	public static void convert20(int n1,ArrayList<String> a1)throws IOException {
		String word1;
		int num1=n1;
		word1=a1.get(num1);
		System.out.print(word1+" ");
	}

	public static void main(String[] args) throws IOException {
		System.out.println("This program will work upto 29");
		System.out.println("Enter any number: ");
		ArrayList<String> lst1=new ArrayList<>();
		int num2=0,part1=0,part2=0;
		lst1=loadfile("words6.txt");
		Scanner sc2=new Scanner(System.in);
		int num1=sc2.nextInt();
		if(num1<100) {
			convert100(num1,lst1);
		}
		else {
			System.out.println("Number too large");
		}
		
		
		
		
		
		

	}

}
