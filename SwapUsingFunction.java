package com;

import java.util.Scanner;

public class SwapUsingFunction {

	
	public static void swapUsingFunc(int a,int b) {
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println("After swapping  - a: "+ a +", b:" + b);
	}
	
	
	public static void main(String[] args) {
		int a=8;
		int b=4;
		
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the a value:");
		a=sc.nextInt();
		System.out.print("Enter the b value:");
		b= sc.nextInt();
		// call the Function
		swapUsingFunc(a,b);
		sc.close();
	}

}
