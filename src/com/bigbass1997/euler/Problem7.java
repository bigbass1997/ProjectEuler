package com.bigbass1997.euler;

import java.math.BigInteger;
import java.util.ArrayList;

/**
 * https://projecteuler.net/problem=7
 * 
 * @author bigbass1997
 *
 */
public class Problem7 {
	
	public static void main(String[] args) {
		float startTime = System.nanoTime();
		
		ArrayList<BigInteger> primes = new ArrayList<BigInteger>();
		int i = 1;
		
		int max = 10001;
		
		while(true){
			if(BigInteger.valueOf(i).isProbablePrime(90)){
				primes.add(BigInteger.valueOf(i));
				System.out.println("Prime Found! " + i);
			}
			
			if(primes.size() >= max){
				System.out.println(primes.get(max - 1));
				break;
			}
			
			i++;
		}
		
		System.out.println(((System.nanoTime() - startTime) / 1000000) + "ms");
	}
}
