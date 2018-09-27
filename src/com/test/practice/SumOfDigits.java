package com.test.practice;

public class SumOfDigits {
	
	public static int sum(int n){
		return (n==0)?0:n%10+sum(n/10);
		
	}

	public static void main(String[] args) {
		System.out.println(SumOfDigits.sum(123));
		System.out.println(123%10);
		System.out.println(123/10);

	}

}
