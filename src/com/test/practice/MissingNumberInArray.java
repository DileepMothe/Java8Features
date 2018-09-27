package com.test.practice;

public class MissingNumberInArray {
	
	
	public static int missingNumber(int a[]){
		int n=a.length+1;
		int sum=n*(n+1)/2;
		int aElementSum=0;
		for(int i=0;i<a.length;i++){
			aElementSum+=a[i];
		}
		int missingNumber=sum-aElementSum;
		return missingNumber;
		
	}

	public static void main(String[] args) {
		int arr[]={2,3,4,7,5,1};
		System.out.println(missingNumber(arr));
		

	}

}
