package com.sangamone;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

public class Tables5 {

	public static void main(String[] args) throws Exception{
		ArrayList<Integer> list1=new ArrayList<>();
		String s1="";
		File f1=new File("in.txt");
		Scanner sc1=new Scanner(f1);
		while(sc1.hasNextLine()) {
			s1=sc1.nextLine();
			list1.add(Integer.parseInt(s1));
		}
		System.out.println(list1);
		int start=list1.get(0);
		int end=list1.get(1);
		
		for(int j=start;j<=end;j++) {
			System.out.println();
			for(int i=1;i<11;i++) {
				System.out.println(j+"*"+i+"="+(j*i));
			}
		}

	}

}
