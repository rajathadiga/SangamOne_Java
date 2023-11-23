package com.sangamone;
import java.io.File;
import com.sangamone.Method_Rule3;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.ArrayList;

public class r4 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		List<String> used=new ArrayList<>();
		String s1="";
		File f1=new File("words.txt");
		Scanner sc1=new Scanner(f1);
		while(sc1.hasNextLine()) {
			s1=sc1.nextLine();
			used.add(s1);
		}
		Method_Rule3 obj1=new Method_Rule3(); 
		String result=obj1.rule3(used);
        System.out.println("Player has entered the word "+result);
	}

}
