package com;

import java.util.Scanner;

public class SumJava {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of a:");
		int a= sc.nextInt();
		System.out.println("Enter value of b:");
		int b=sc.nextInt();
		/* sum formula*/
		
		int sum=a+b;
		// average formula//
		double avg=(double)sum/2;
		
		System.out.println("Sum:"+sum +"\nAverage:"+ avg);
		sc.close();
	}

	
}
