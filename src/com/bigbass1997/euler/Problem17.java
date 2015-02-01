package com.bigbass1997.euler;

/**
 * https://projecteuler.net/problem=17
 * 
 * @author bigbass1997
 *
 */
public class Problem17 {
	
	public static String[] firstTwenty = new String[]{
		"ZERO", "ONE", "TWO", "THREE", "FOUR",
		"FIVE", "SIX", "SEVEN", "EIGHT", "NINE",
		"TEN", "ELEVEN", "TWELVE", "THIRTEEN", "FOURTEEN", 
		"FIFTEEN", "SIXTEEN", "SEVENTEEN", "EIGHTEEN", "NINETEEN",
	};
	
	public static String[] tensPastTeens = new String[]{
		"TWENTY", "THIRTY", "FORTY", "FIFTY", "SIXTY", "SEVENTY", "EIGHTY", "NINETY"
	};
	
	public static String hundred = "HUNDRED";
	public static String oneThousand = "ONETHOUSAND";
	
	public static void main(String[] args) {
		float startTime = System.nanoTime();
		
		int length = 0;
		
		for(int i = 1; i <= 1000; i++){
			String s = pickString(i);
			System.out.println(s);
			length += len(s);
		}
		
		System.out.println(length);

		System.out.println(((System.nanoTime() - startTime) / 1000000) + "ms");
	}
	
	public static String pickString(int num){
		if(num == 0){
			return "";
		}else if(num < 20){
			return firstTwenty[num];
		}else if(num < 100){
			int digit1 = Integer.valueOf(String.valueOf(num).substring(0, 1));
			int digit2 = Integer.valueOf(String.valueOf(num).substring(1));
			
			String s = tensPastTeens[digit1 - 2];
			s = s.concat(firstTwenty[digit2]);
			
			if(digit2 == 0){
				s = s.substring(0, tensPastTeens[digit1 - 2].length());
			}
			
			return s;
		}else if(num < 1000){
			int digit1 = Integer.valueOf(String.valueOf(num).substring(0, 1));
			int rest = Integer.valueOf(String.valueOf(num).substring(1));
			
			String s = firstTwenty[digit1].concat(hundred);
			
			if(rest == 0){
				s = s.concat(pickString(rest));
			}else{
				s = s.concat("AND").concat(pickString(rest));
			}
			
			return s;
		}else if(num == 1000){
			return oneThousand;
		}else{
			return "";
		}
	}
	
	public static int len(String s){
		return s.length();
	}
}
