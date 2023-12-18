package com.sangamone;
import java.util.ArrayList;

public class Jailer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> prison=new ArrayList<>();
		ArrayList<Integer> lucky=new ArrayList<>();
		ArrayList<Integer> unlucky=new ArrayList<>();
		int count=100;
		for(int i=0;i<count;i++) {
			prison.add("C");
		}
		int len1=prison.size();
		for(int i=0;i<len1;i++) {
			prison.set(i,"O");
		}
		
		for(int i=1;i<len1;i+=2) {
			prison.set(i,"C");
		}
		
		for(int j=2;j<count;j++) {
			for(int i=j;i<len1;i+=(j+1)) {
				if(prison.get(i)=="O") {
					prison.set(i,"C");
				}
				else {
					prison.set(i,"O");
				}
			}
		}
		for(int i=0;i<len1;i++) {
			if(prison.get(i)=="O") {
				lucky.add(i+1);
			}
			else {
				unlucky.add(i+1);
			}
		}
		System.out.println(lucky+" are the lucky prisoners");
		System.out.println(unlucky+" are going to release after 4 weeks");
		
	}

}
