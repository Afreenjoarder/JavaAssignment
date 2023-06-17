package com;

public class LCMValue {

	public static void main(String[] args) {
		int a=72;
		int b=120;
		int gcd = 1;
		for(int i = 1; i <= a && i <= b; ++i) {
		      // Checks if i is factor of both integers
		      if(a % i == 0 && b % i == 0)
		        gcd = i;
		    }

		    int lcm = (a * b) / gcd;
		    System.out.printf("The LCM of %d and %d is %d.", a,b,  lcm);

	}
}
