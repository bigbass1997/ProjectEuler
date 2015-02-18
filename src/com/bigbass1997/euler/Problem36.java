package com.bigbass1997.euler;

/**
 * https://projecteuler.net/problem=36
 * 
 * @author bigbass1997
 *
 */
public class Problem36 {
	
	public static void main(String[] args) {
		float startTime = System.nanoTime();
		
		int sum = 0;
		for(int i = 0; i < 1000000; i++){
			String sProduct = String.valueOf(i);
			
			boolean stringBool = sProduct.equalsIgnoreCase(reverseIt(sProduct));
			String binary = toBinary(sProduct);
			boolean binaryBool = binary.equalsIgnoreCase(reverseIt(binary));
			if(stringBool && binaryBool){
				System.out.println(sProduct + " | " + binary + " is a Double-base Palindrome!");
				sum += i;
			}
		}
		System.out.println("Sum = " + sum);

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
	
	public static String toBinary(String x){
		return Integer.toBinaryString(Integer.valueOf(x));
	}
}
