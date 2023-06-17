package com;
import java.util.Scanner;

public class SquareJava2 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
        int a;
        

        System.out.print("Enter an integer number: ");
        a = sc.nextInt();

       System.out.println("Square of " + a + " is: " + Math.pow(a, 2));
        System.out.println("Cube of " + a + " is: " + Math.pow(a, 3));
        System.out.println("Square Root of " + a + " is: " + Math.sqrt(a));
        sc.close();
    }

	

	
	
	
}

