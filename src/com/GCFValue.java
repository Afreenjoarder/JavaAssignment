package com;

import java.util.Scanner;

public class GCFValue {
	
	public static int gcf(int a, int b){
		//in case any of them is zero then gcf is zero
		if(a == 0 || b == 0)
		       return 0;
		//in case both are equal
		if (a == b)
		return a;
		//using euclidean algorithm
		if(a > b)
		return gcf(a - b, b);
		else
		return gcf(a, b - a);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 
        System.out.print("Enter first number to find GCF  :");
        int a=sc.nextInt();
        System.out.print("Enter Second number to find GCF :");
        int b=sc.nextInt();
        System.out.println("Greatest Common Factor : " + gcf(a, b));
        sc.close();
        

	}

}
