package com;

import java.util.Scanner;

public class SwapWithVar {

	public static void main(String[] args) {
		int a,b;
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter value of a:");
		a=sc.nextInt();
		System.out.print("Enter value of a: ");
		b=sc.nextInt();
		System.out.println("Before swapping - a: "+ a +", b: " + b);
		////with third variable
		/*int temp;
		temp=a;
		a=b;
		b=temp;*/
		//////////////////////
		//without third variable
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping  - a: "+ a +", b: " + b);
		sc.close();
		
		
		

	}

}
