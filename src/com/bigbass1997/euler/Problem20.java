package com.bigbass1997.euler;

import java.math.BigInteger;

/**
 * https://projecteuler.net/problem=20
 * 
 * @author bigbass1997
 *
 */
public class Problem20 {
	
	static int size = 100;
	
	public static void main(String[] args) {
		float startTime = System.nanoTime();
		
		BigInteger total = BigInteger.valueOf(size);
		
		for(int i = size-1; i > 0; i -= 1){
			total = total.multiply(BigInteger.valueOf(i));
		}
		
		System.out.println(getSumOfString(total.toString()).toString());
		
		System.out.println(((System.nanoTime() - startTime) / 1000000) + "ms");
	}
	
	public static BigInteger getSumOfString(String s){
		BigInteger sum = BigInteger.ZERO;
		
		for(int i = 0; i < s.length(); i++){
			sum = sum.add(BigInteger.valueOf(Long.parseLong(s.substring(i, i + 1))));
		}
		
		return sum;
	}
}
