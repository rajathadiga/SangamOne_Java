package com.sangamone;

public class primitives {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b1=4;

		byte b2=1;

		for(int i=0;i<10;i++) {

		b2=(byte) (b2*b1);

		System.out.println(b2);

		}

		short s1=4;

		short s2=1;

		for(int i=0;i<10;i++) {

		s2=(short)(s2*s1);

		System.out.println(s2);

		}

		int i1=4;

		int i2=1;

		for(int i=0;i<15;i++) {

		i2=i2*i1;

		System.out.println(i2);

		}

		long l1=4;

		long l2=1;

		for (int i=0; i<31;i++) {

		l2=l2*l1;

		System.out.println(l2);

		}

	}

}
