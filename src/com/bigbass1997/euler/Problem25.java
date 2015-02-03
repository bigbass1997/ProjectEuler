package com.bigbass1997.euler;

import java.math.BigInteger;

/**
 * https://projecteuler.net/problem=25
 * 
 * @author bigbass1997
 *
 */
public class Problem25 {
	
	public static void main(String[] args) {
		float startTime = System.nanoTime();
		
		int terms = 2;
		
		BigInteger f1 = BigInteger.valueOf(1);
		BigInteger f2 = BigInteger.valueOf(2);
		
		while(f1.toString().length() != 1000){
			BigInteger f1original = f1;
			f1 = f2;
			f2 = f2.add(f1original);
			terms += 1;
		}
		System.out.println(terms);

		System.out.println(((System.nanoTime() - startTime) / 1000000) + "ms");
	}
}
