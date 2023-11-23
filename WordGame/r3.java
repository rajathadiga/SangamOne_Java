package com.sangamone;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import com.sangamone.Method_Rule3;

public class r3 {
	public static void main(String[] args) {
        Method_Rule3 obj1=new Method_Rule3();
        List<String>used=new ArrayList<>();
        used.add("apple");
        used.add("banana");
        used.add("carrot");
        used.add("drumstick");
        used.add("egg");
        used.add("fish");
        String result=obj1.rule3(used);
        System.out.println("Player has entered the word "+result);

	}

}


