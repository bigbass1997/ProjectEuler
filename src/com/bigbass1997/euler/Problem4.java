package com.bigbass1997.euler;

/**
 * https://projecteuler.net/problem=4
 * 
 * @author bigbass1997
 *
 */
public class Problem4 {
	
	public static int max = 999, min = 100;
	
	public static void main(String[] args) {
		float startTime = System.nanoTime();
		
		final int max = 999, min = 100;
		int largestFound = 0;
		
		for(int i = max; i >= min; i--){
			for(int j = max; j >= min; j--){
				int product = i * j;
				
				String sProduct = String.valueOf(product);
				
				if(sProduct.length() % 2 == 0){
					if(sProduct.equalsIgnoreCase(reverseIt(sProduct))){
						System.out.println("Palindrome found: " + product);
						if(product > largestFound) largestFound = product;
					}
				}
			}
		}
		
		System.out.println("Largest Palindrome Found: " + largestFound);

		System.out.println(((System.nanoTime() - startTime) / 1000000) + "ms");
	}
	
	public static String reverseIt(String source){
		int i, len = source.length();
		StringBuilder dest = new StringBuilder(len);
		
		for(i = len - 1; i >= 0; i--){
			dest.append(source.charAt(i));
		}
		
		return dest.toString();
	}
}
