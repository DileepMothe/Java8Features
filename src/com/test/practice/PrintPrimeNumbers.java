package com.test.practice;

import java.util.Scanner;

public class PrintPrimeNumbers {
	
	public static boolean isPrime(int n)
	{
		if(n<=1)
		{
		return false;
		}
		
		for(int i=2;i<=Math.sqrt(n);i++)
		{
			if(n%i==0){
				return false;
			}
		}
		return true;
			
		
	}

	public static void main(String[] args) {
		
		int a=10;
		System.out.println(Math.sqrt(9));
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Start Number:");
		int start=sc.nextInt();
		System.out.print("Enter End Number:");
		int end=sc.nextInt();
		for(int i=start;i<=end;i++){
			if(isPrime(i))
			System.out.println(i);
		}
		

	}

}
