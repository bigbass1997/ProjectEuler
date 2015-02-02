package com.bigbass1997.euler;

import java.math.BigInteger;

/**
 * https://projecteuler.net/problem=16
 * 
 * @author bigbass1997
 *
 */
public class Problem16 {
	
	public static void main(String[] args) {
		float startTime = System.nanoTime();
		
		String s = BigInteger.valueOf(2).pow(1000).toString();
		
		int total = 0;
		for(int i = 0; i < s.length(); i++){
			total += Integer.valueOf(s.substring(i, i + 1));
		}
		
		System.out.println(total);

		System.out.println(((System.nanoTime() - startTime) / 1000000) + "ms");
	}
}
