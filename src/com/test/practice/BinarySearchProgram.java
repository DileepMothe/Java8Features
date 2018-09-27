package com.test.practice;

public class BinarySearchProgram {

	public static int BinarySearch(int a[],int key)
	{
		int start=0;
		int end=a.length-1;
		
		while(start<=end)
		{
			int mid=(start+end)/2;
			if(key==a[mid])
			{
				return mid;
			}
			if(key<a[mid])
				{
					end=mid-1;
				}
				else
				{
					start=mid+1;
				}
			}
		
		return -1;
	}
	
	public static void main(String[] args) {
		int a[]={10,20,30,40,50,60};
		int key=50;
System.out.println("50 Position is:"+BinarySearch(a, key));
	}

}
