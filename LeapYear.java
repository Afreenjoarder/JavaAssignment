package com;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		int year;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the year:");
		year= sc.nextInt();
		if(year%4==0){
			System.out.println("this is a leap year:"+year);
		}else {
			System.out.println("this is not a leap year:"+year);
			sc.close();
		}
		

	}

}
