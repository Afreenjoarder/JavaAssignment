package com;

public class Compound {

	public static void main(String[] args) {
		double principle=10000;
		double rate=4;
		double time=5;
		double CI = principle *(Math.pow((1 + rate / 100), time));
		System.out.println("The Compound Interest is :" +CI);
	}

}
