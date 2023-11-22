package com.sangamone;

import java.math.BigInteger;

public class bigint {

	public static void main(String[] args) {
		int bi1=4;

		int bi2=1;

		BigInteger A=BigInteger.valueOf(bi1);

		BigInteger B=BigInteger.valueOf(bi2);

		for (int i=0; i<1000; i++) {

		B=B.multiply(A);

		System.out.println(B);

		}

	}

}
