package com.sangamone;

public class Greeting {
	public static String greeting(String name, String gender) {
		if(gender.equals("M")) {
			return "Hello Mr. "+name;
		}
		if(gender.equals("F")) {
			return "Hello Ms. "+name;
		}
		else {
			return "Please mention gender correctly";
		}
	}
    public static void main(String[] args) {
				//System.out.println(greeting());
				//System.out.println(greeting("Siva"));
				System.out.println(greeting("Rama","M"));
				System.out.println(greeting("Sita","F"));
				System.out.println(greeting("Sita","S"));
    }

}




