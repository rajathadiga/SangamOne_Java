package com.sangamone;
import com.sangamone.SimpCalc;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class SimpCalcTest {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		SimpCalc t1=new SimpCalc();
		File f1=new File("add.txt");
		Scanner sc1=new Scanner(f1);
		List<Integer> list1=new ArrayList<>();
		List<Integer> list2=new ArrayList<>();
		List<Integer> list3=new ArrayList<>();
		String[] temp1;
		int num1,num2,num3,result=0;	
		for(int i=0;i<2;i++) {
			temp1=sc1.nextLine().split(",");
			list1.add(Integer.parseInt(temp1[0]));
			list2.add(Integer.parseInt(temp1[1]));
			list3.add(Integer.parseInt(temp1[2]));
			result=0;
			num1= list1.get(i);
			num2=list2.get(i);
			num3=list3.get(i);
			result =t1.add(num1,num2);
			if (result==num3){
				System.out.println("Addition is working");
				System.out.println(result);
			}
		}
		
	}

}
