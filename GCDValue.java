package com;

import java.util.Scanner;

public class GCDValue {

	public static int findGCD(int a,int b) {
		if(b==0) {
			return a;
		}
		return findGCD(b,a%b);
	}
		
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 
        System.out.print("Enter first number to find GCD  :");
        int a=sc.nextInt();
        System.out.print("Enter Second number to find GCD :");
        int b=sc.nextInt();
        System.out.println("Greatest Common Divisors: " + findGCD(a, b));
        sc.close();
        
	}

}
