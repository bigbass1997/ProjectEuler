package com.bigbass1997.euler;

/**
 * https://projecteuler.net/problem=9
 * 
 * @author Bigbass1997
 *
 */
public class Problem9 {
	
	public static void main(String[] args) {
		float startTime = System.nanoTime();
		
		System.out.println(findPythagoreanProduct(1000));

		System.out.println(((System.nanoTime() - startTime) / 1000000) + "ms");
	}
	
	/**
	 * Finds Pythagorean Triplets until the sum of (a, b, c) equal the passed "stopSum" variable.
	 * <p>
	 * Uses Euclid's Forumula to generate the triplets based on 2 variables, 'm' and 'n'.
	 * Where m > n.
	 * 
	 * @param stopSum point at which to stop looping. The sum of (a, b, c).
	 * @return product of (a, b, c)
	 */
	public static int findPythagoreanProduct(int stopSum){
		int m = 2;
		while(true){
			m++;
			for(int n = 1; n < m; n++){
				
				int a = (m * m) - (n * n);
				int b = 2 * m * n;
				int c = (m * m) + (n * n);
				
				if((a + b + c) == stopSum){
					return (a * b * c);
				}
			}
		}
	}
}
