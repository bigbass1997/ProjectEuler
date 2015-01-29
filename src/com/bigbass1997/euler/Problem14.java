package com.bigbass1997.euler;

import java.math.BigInteger;

/**
 * https://projecteuler.net/problem=14
 * 
 * @author bigbass1997
 *
 */
public class Problem14 {
	
	public static void main(String[] args) {
		float startTime = System.nanoTime();
		
		int highestCount = 0;
		int highestIterator = 0;
		for(int i = 1; i <= 1000000; i++){
			int count = startSquence(BigInteger.valueOf(i));
			System.out.println(i + " | " + count);
			if(count > highestCount){
				highestCount = count;
				highestIterator = i;
			}
		}
		
		System.out.println("Highest chain count to " + highestIterator + " with count of " + highestCount);

		System.out.println(((System.nanoTime() - startTime) / 1000000) + "ms");
	}
	
	public static int startSquence(BigInteger startVal){
		int count = 1;
		
		while(startVal.compareTo(BigInteger.ONE) != 0){
			startVal = nextTerm(startVal);
			count += 1;
		}
		
		return count;
	}
	
	public static BigInteger nextTerm(BigInteger input){
		BigInteger 
				ONE = BigInteger.ONE,
				TWO = BigInteger.valueOf(2),
				THREE = BigInteger.valueOf(3),
				ZERO = BigInteger.ZERO;
		if(input.remainder(TWO) == ZERO){ //if even
			return input.divide(TWO);
		}else{ //otherwise is odd
			return input.multiply(THREE).add(ONE);
		}
	}
}
