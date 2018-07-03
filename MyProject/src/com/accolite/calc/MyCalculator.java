package com.accolite.calc;

public class MyCalculator {
	public static void main(String[] args) {
		Addition a = new Addition();
		System.out.println("sum is"+ a.sum(new int[] {1,2,3,4}));
	}
}
