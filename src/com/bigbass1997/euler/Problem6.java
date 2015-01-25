package com.bigbass1997.euler;

import java.math.BigInteger;

/**
 * https://projecteuler.net/problem=6
 * 
 * @author bigbass1997
 * 
 */
public class Problem6 {
	
	public static void main(String[] args) {
		float startTime = System.nanoTime();
		
		BigInteger sumOfSquares = BigInteger.ZERO;
		BigInteger squareOfSum = BigInteger.ZERO;
		int max = 100;
		
		for(int i = 1; i < max + 1; i++){
			sumOfSquares = sumOfSquares.add(BigInteger.valueOf((long) Math.pow(i, 2)));
			squareOfSum = squareOfSum.add(BigInteger.valueOf((long) i));

		}
		
		squareOfSum = squareOfSum.pow(2);
		
		
		System.out.println(squareOfSum.subtract(sumOfSquares));

		System.out.println(((System.nanoTime() - startTime) / 1000000) + "ms");
	}
}
